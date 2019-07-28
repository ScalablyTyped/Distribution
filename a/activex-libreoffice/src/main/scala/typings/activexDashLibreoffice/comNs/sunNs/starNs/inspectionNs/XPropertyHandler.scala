package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.Property
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the basic interface for object inspection.
  *
  * The {@link ObjectInspector} itself does not know anything about the object it is inspecting, all information is obtained via XPropertyHandlers. Also,
  * property handlers are responsible for describing the user interface which should be used to interact with the user, with respect to a given aspect of
  * the inspected component.
  * @see ObjectInspector
  * @see LineDescriptor
  * @since OOo 2.0.3
  */
trait XPropertyHandler extends XComponent {
  /**
    * retrieve the actuating properties which this handler is interested in
    *
    * In general, properties can be declared as "actuating", that is, when their value changes, the UI for other properties needs to be updated (e.g.
    * enabled or disabled).
    *
    * With this method, a handler can declare that it feels responsible for some/all of the depending properties of certain actuating properties.
    *
    * Whenever the value of an actuating property changes, all handlers which expressed their interest in this particular actuating properties are called
    * with their {@link actuatingPropertyChanged()} method.
    *
    * If {@link getSupportedProperties()} returned an empty sequence, this method will not be called
    */
  val ActuatingProperties: SafeArray[String]
  /**
    * returns the properties which are to be superseded by this handler
    *
    * Besides defining an own set of properties (see {@link getSupportedProperties()} ), a property handler can also declare that foreign properties (which
    * it is **not** responsible for) are superseded by its own properties.
    *
    * This is usually used if your handler is used with another, more generic one, which should continue to be responsible for all properties, except a few
    * which your handler handles more elegantly.
    *
    * In such a case, simply return those properties here.
    *
    * There is a precedence in the property handlers used by an {@link ObjectInspector} , which also is important for the superseded properties. This
    * precedence is implied by the precedence of factories to create the property handlers, as denoted in the {@link XObjectInspectorModel.HandlerFactories}
    * attribute.
    *
    * With this in mind, property handlers can only supersede properties which are supported by a handler preceding them, but not properties of handlers
    * succeeding them.
    *
    * For instance, imaging an {@link XObjectInspectorModel} which provides three factories, for handler `A` , `B` , and `C` - in this order. Now if `A`
    * supports the property `Foo` , `C` supports `Bar` , and `B` supersedes both `Foo` and `Bar` , them the result is `Bar` is still present. This is
    * because `B` precedes `C` , so it cannot, by definition, supersede properties which are supported by `C` .
    *
    * If {@link getSupportedProperties()} returned an empty sequence, this method will not be called.
    * @see XObjectInspectorModel.HandlerFactories
    */
  val SupersededProperties: SafeArray[String]
  /**
    * returns the properties which the handler can handle
    *
    * A handler is allowed to return an empty sequence here, indicating that for the given introspection, no properties handling can be provided. This might
    * happen when a fixed set of property handlers is used for a variety of components to inspect, where not all handlers can really cope with all
    * components.
    *
    * In the case of returning an empty sequence here, the property handler is ignored by all further processing in the object inspector.
    */
  val SupportedProperties: SafeArray[Property]
  /**
    * updates the UI of dependent properties when the value of a certain actuating property changed
    *
    * This method is called whenever a property value changes, limited to those properties whose changes the handler expressed interest in (see {@link
    * getActuatingProperties()} ).
    * @param ActuatingPropertyName the id of the actuating property.
    * @param NewValue the new value of the property
    * @param OldValue the old value of the property
    * @param InspectorUI a callback for updating the object inspector UI
    * @param FirstTimeInit If `TRUE` , the method is called for the first-time update of the respective property, that is, when the property browser is just i
    * @throws com::sun::star::lang::NullPointerException if InspectorUI is `NULL`
    */
  def actuatingPropertyChanged(
    ActuatingPropertyName: String,
    NewValue: js.Any,
    OldValue: js.Any,
    InspectorUI: XObjectInspectorUI,
    FirstTimeInit: Boolean
  ): Unit
  /**
    * registers a listener for notification about property value changes
    *
    * An {@link XPropertyHandler} implementation might decide to ignore this call. However, in this case property value changes made by third party
    * components are not reflected in the object inspector.
    *
    * If a handler implementation supports property change listeners, it must be able to cope with a call to {@link addPropertyChangeListener()} even if
    * currently no component is being inspected. In this case, the listener must become active as soon as a new introspection is set in the next {@link
    * inspect()} call.
    * @param Listener the listener to notify about property changes
    * @see removePropertyChangeListener
    * @throws com::sun::star::lang::NullPointerException if the listener is `NULL`
    */
  def addPropertyChangeListener(Listener: XPropertyChangeListener): Unit
  /**
    * converts a given property value to a control-compatible value
    *
    * In {@link describePropertyLine()} , a property handler declared which type of control should be used to display the value of a certain property. To
    * allow to use the same control type for different properties, and in particular, for properties of different type, conversions between controls values
    * and property values are needed.
    *
    * This method converts a property value, which has previously been obtained using {@link getPropertyValue()} , into a control-compatible value, which
    * can be used with {@link XPropertyControl} 's {@link XPropertyControl.Value} attribute.
    *
    * A usual application of this method are list boxes: There is a generic list box implementation, which is able to display a simple list of strings.
    * Usually, every string represents one possible property value. To translate between those property values and the displayed strings, {@link
    * convertToControlValue()} and {@link convertToPropertyValue()} are used.
    *
    * The method is not invoked if the control's value type ( {@link XPropertyControl.ValueType} equals the property's value type.
    * @param PropertyName The name of the property whose value is to be converted.
    * @param PropertyValue The to-be-converted property value.
    * @param ControlValueType The target type of the conversion. This type is determined by the control which is used to display the property, which in turn i
    * @see convertToPropertyValue
    * @see describePropertyLine
    * @see XPropertyControl
    * @see getPropertyValue
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def convertToControlValue(PropertyName: String, PropertyValue: js.Any, ControlValueType: `type`): js.Any
  /**
    * converts a given control-compatible value to a property value
    *
    * In {@link describePropertyLine()} , a property handler declared which type of control should be used to display the value of a certain property. To
    * allow to use the same control type for different properties, and in particular, for properties of different type, conversions between controls values
    * and property values are needed.
    *
    * This method converts a control value into a property value, which subsequently can be used in conjunction with {@link setPropertyValue()} .
    * @param PropertyName The name of the conversion's target property.
    * @param ControlValue The to-be-converted control value. This value has been obtained from an {@link XPropertyControl} , using its {@link XPropertyControl
    * @see convertToControlValue
    * @see describePropertyLine
    * @see XPropertyControl
    * @see getPropertyValue
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def convertToPropertyValue(PropertyName: String, ControlValue: js.Any): js.Any
  /**
    * describes the UI to be used to represent the property
    * @param PropertyName the name of the property whose user interface is to be described implementation
    * @param ControlFactory a factory for creating {@link XPropertyControl} instances. Must not be `NULL` .
    * @returns the descriptor of the property line.
    * @see PropertyControlType
    * @see LineDescriptor
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by this handler
    * @throws com::sun::star::lang::NullPointerException if ControlFactory is `NULL` .
    */
  def describePropertyLine(PropertyName: String, ControlFactory: XPropertyControlFactory): LineDescriptor
  /**
    * retrieve the actuating properties which this handler is interested in
    *
    * In general, properties can be declared as "actuating", that is, when their value changes, the UI for other properties needs to be updated (e.g.
    * enabled or disabled).
    *
    * With this method, a handler can declare that it feels responsible for some/all of the depending properties of certain actuating properties.
    *
    * Whenever the value of an actuating property changes, all handlers which expressed their interest in this particular actuating properties are called
    * with their {@link actuatingPropertyChanged()} method.
    *
    * If {@link getSupportedProperties()} returned an empty sequence, this method will not be called
    */
  def getActuatingProperties(): SafeArray[String]
  /**
    * returns the state of a property
    * @param PropertyName the name of the property whose state is to be retrieved
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def getPropertyState(PropertyName: String): PropertyState
  /**
    * retrieves the current value of a property
    * @param PropertyName the name of the property whose value is to be retrieved
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def getPropertyValue(PropertyName: String): js.Any
  /**
    * returns the properties which are to be superseded by this handler
    *
    * Besides defining an own set of properties (see {@link getSupportedProperties()} ), a property handler can also declare that foreign properties (which
    * it is **not** responsible for) are superseded by its own properties.
    *
    * This is usually used if your handler is used with another, more generic one, which should continue to be responsible for all properties, except a few
    * which your handler handles more elegantly.
    *
    * In such a case, simply return those properties here.
    *
    * There is a precedence in the property handlers used by an {@link ObjectInspector} , which also is important for the superseded properties. This
    * precedence is implied by the precedence of factories to create the property handlers, as denoted in the {@link XObjectInspectorModel.HandlerFactories}
    * attribute.
    *
    * With this in mind, property handlers can only supersede properties which are supported by a handler preceding them, but not properties of handlers
    * succeeding them.
    *
    * For instance, imaging an {@link XObjectInspectorModel} which provides three factories, for handler `A` , `B` , and `C` - in this order. Now if `A`
    * supports the property `Foo` , `C` supports `Bar` , and `B` supersedes both `Foo` and `Bar` , them the result is `Bar` is still present. This is
    * because `B` precedes `C` , so it cannot, by definition, supersede properties which are supported by `C` .
    *
    * If {@link getSupportedProperties()} returned an empty sequence, this method will not be called.
    * @see XObjectInspectorModel.HandlerFactories
    */
  def getSupersededProperties(): SafeArray[String]
  /**
    * returns the properties which the handler can handle
    *
    * A handler is allowed to return an empty sequence here, indicating that for the given introspection, no properties handling can be provided. This might
    * happen when a fixed set of property handlers is used for a variety of components to inspect, where not all handlers can really cope with all
    * components.
    *
    * In the case of returning an empty sequence here, the property handler is ignored by all further processing in the object inspector.
    */
  def getSupportedProperties(): SafeArray[Property]
  /**
    * binds the property handler to a new component
    * @param Component the component to inspect. Must not be `NULL`
    * @throws com::sun::star::lang::NullPointerException if the component is `NULL`
    */
  def inspect(Component: XInterface): Unit
  /**
    * determines whether a given property, which the handler is responsible for, is composable.
    *
    * An object inspector can inspect multiple components at once, displaying the **intersection** of their properties. For this, all components are
    * examined for their properties, and all properties which exist for all components, **and** are declared to be composable by their respective handler,
    * are displayed in the inspector UI.
    * @param PropertyName the name of the property whose composability is to be determined
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def isComposable(PropertyName: String): Boolean
  /**
    * called when a browse button belonging to a property UI representation has been clicked
    *
    * Property handlers can raise a dedicated UI for entering or somehow changing a property value. Usually, this will be a modal dialog, but it can also be
    * a non-modal user interface component.
    *
    * Availability of this feature is indicated by the {@link LineDescriptor.HasPrimaryButton} and {@link LineDescriptor.HasSecondaryButton} members of a
    * {@link LineDescriptor} , which the {@link XPropertyHandler} fills in its {@link describePropertyLine()} method.
    *
    * When this method is called, the property handler should raise the UI needed to enter the property value, and return the result of this (see
    * InteractiveSelectionResult).
    *
    * It is recommended that property handlers do not directly set the property value which has been obtained from the user, but store it in the
    * output-parameter Data, and return InteractiveSelectionResult::ObtainedValue.
    *
    * If a handler sets the new property value directly, and returns InteractiveSelectionResult::ObtainedValue, this implies that the property cannot
    * properly be handled in case the object inspector is inspecting an intersection of multiple components, since in this case {@link
    * onInteractivePropertySelection()} will be called at one handler only, however the new property would have to be forwarded to all handlers.
    *
    * If a property is not composable, directly setting the new property value does not yield any problem, as long as property listeners are properly
    * notified of the change.
    * @param PropertyName The name of the property whose browse button has been clicked
    * @param Primary `TRUE` if and only if the primary button has been clicked, `FALSE` otherwise
    * @param outData If the method returns InteractiveSelectionResult::ObtainedValue, then outData contains the value which has been interactively obtained fr
    * @param InspectorUI provides access to the object inspector UI. Implementations should use this if the property selection requires non-modal user input.
    * @returns the result of the interactive property value selection.
    * @see describePropertyLine
    * @see addPropertyChangeListener
    * @see isComposable
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    * @throws com::sun::star::lang::NullPointerException if InspectorUI is `NULL`
    */
  def onInteractivePropertySelection(PropertyName: String, Primary: Boolean, outData: js.Array[_], InspectorUI: XObjectInspectorUI): InteractiveSelectionResult
  /**
    * revokes a listener for notification about property value changes
    * @see addPropertyChangeListener
    */
  def removePropertyChangeListener(Listener: XPropertyChangeListener): Unit
  /**
    * sets the value of a property
    * @param PropertyName the name of the property whose value is to be set
    * @param Value the property value to set
    * @throws com::sun::star::beans::UnknownPropertyException if the given property is not supported by the property handler
    */
  def setPropertyValue(PropertyName: String, Value: js.Any): Unit
  /**
    * suspends the handler
    *
    * A {@link XPropertyHandler} is used by a {@link XObjectInspector} instance, which implements the XController interface. By definition, a {@link
    * XObjectInspector} always forwards all suspend requests ( {@link com.sun.star.frame.XController.suspend()} ) to all its handlers.
    *
    * The usual use case for this method are non-modal user interface components used for property value input. Such a component might have been opened
    * during {@link onInteractivePropertySelection()} . If a property handler receives a {@link suspend()} call, it should forward the suspension request to
    * the UI component, and veto suspension of the {@link XObjectInspector} as appropriate.
    *
    * If suspension is not to be vetoed, then all non-modal UI components opened by the handler should have been closed when it returns from the {@link
    * suspend()} call.
    * @param Suspend Whether the handler is to be suspended `TRUE` or reactivated ( `FALSE` ). The latter happens if a handler was successfully suspended, but
    * @returns `TRUE` if the handler does allow suspension, `FALSE` if it vetoes it.
    */
  def suspend(Suspend: Boolean): Boolean
}

object XPropertyHandler {
  @scala.inline
  def apply(
    ActuatingProperties: SafeArray[String],
    SupersededProperties: SafeArray[String],
    SupportedProperties: SafeArray[Property],
    acquire: () => Unit,
    actuatingPropertyChanged: (String, js.Any, js.Any, XObjectInspectorUI, Boolean) => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: XPropertyChangeListener => Unit,
    convertToControlValue: (String, js.Any, `type`) => js.Any,
    convertToPropertyValue: (String, js.Any) => js.Any,
    describePropertyLine: (String, XPropertyControlFactory) => LineDescriptor,
    dispose: () => Unit,
    getActuatingProperties: () => SafeArray[String],
    getPropertyState: String => PropertyState,
    getPropertyValue: String => js.Any,
    getSupersededProperties: () => SafeArray[String],
    getSupportedProperties: () => SafeArray[Property],
    inspect: XInterface => Unit,
    isComposable: String => Boolean,
    onInteractivePropertySelection: (String, Boolean, js.Array[_], XObjectInspectorUI) => InteractiveSelectionResult,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: XPropertyChangeListener => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    suspend: Boolean => Boolean
  ): XPropertyHandler = {
    val __obj = js.Dynamic.literal(ActuatingProperties = ActuatingProperties, SupersededProperties = SupersededProperties, SupportedProperties = SupportedProperties, acquire = js.Any.fromFunction0(acquire), actuatingPropertyChanged = js.Any.fromFunction5(actuatingPropertyChanged), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction1(addPropertyChangeListener), convertToControlValue = js.Any.fromFunction3(convertToControlValue), convertToPropertyValue = js.Any.fromFunction2(convertToPropertyValue), describePropertyLine = js.Any.fromFunction2(describePropertyLine), dispose = js.Any.fromFunction0(dispose), getActuatingProperties = js.Any.fromFunction0(getActuatingProperties), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupersededProperties = js.Any.fromFunction0(getSupersededProperties), getSupportedProperties = js.Any.fromFunction0(getSupportedProperties), inspect = js.Any.fromFunction1(inspect), isComposable = js.Any.fromFunction1(isComposable), onInteractivePropertySelection = js.Any.fromFunction4(onInteractivePropertySelection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction1(removePropertyChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), suspend = js.Any.fromFunction1(suspend))
  
    __obj.asInstanceOf[XPropertyHandler]
  }
}


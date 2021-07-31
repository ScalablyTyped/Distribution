package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives a description of a configuration layer as a sequence of events.
  * @since OOo 1.1.2
  */
trait XLayerHandler
  extends StObject
     with XInterface {
  
  /**
    * receives notification that a new item is started.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * The new item will be created from the default template of the set.
    *
    * Subsequent calls describe the difference from the template of properties and members or items of the node until a matching call to {@link
    * XLayerHandler.endNode()} is encountered.
    * @param aName specifies the name of the item.
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNode(aName: String, aAttributes: Double): Unit
  
  /**
    * receives notification that a new item based on a particular template is started.
    *
    * The current node must be a set and a preexisting item (if any) must be removable.
    *
    * Subsequent calls describe the difference from the template of properties and members or items of the node until a matching call to {@link
    * XLayerHandler.endNode()} is encountered.
    * @param aName specifies the name of the item.
    * @param aTemplate specifies the template to use for the new node
    * @param aAttributes specifies attribute values to be applied to the new node.  The value is a combination of {@link NodeAttribute} flags. Note that {@lin
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addOrReplaceNodeFromTemplate(aName: String, aTemplate: TemplateIdentifier, aAttributes: Double): Unit
  
  /**
    * receives notification that a property having a `VOID` value is added to the current node.
    *
    * The current node must be extensible.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aType specifies the type of the new property.
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't an extensible node in progress currentlyif a property with that nam
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addProperty(aName: String, aAttributes: Double, aType: `type`): Unit
  
  /**
    * receives notification that a property having a non- `VOID` value is added to the current node.
    *
    * The current node must be extensible.
    * @param aName specifies the name of the new property.
    * @param aAttributes specifies the attributes of the new property.  The value is a combination of {@link NodeAttribute} flags and may also contain the {@l
    * @param aValue specifies the value of the new property.  The value also determines the type. Therefore the value must not be `VOID` .
    * @see com.sun.star.configuration.backend.SchemaAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't an extensible node in progress currentlyif a property with that nam
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def addPropertyWithValue(aName: String, aAttributes: Double, aValue: js.Any): Unit
  
  /**
    * receives notification that a node is dropped from a set.
    *
    * The current node must be a set and the item must be removable.
    * @param aName specifies the name of the node.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a set node in progress currentlyif there already was a change to a
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def dropNode(aName: String): Unit
  
  /**
    * receives notification that a layer description is complete.
    *
    * Must match a previous call to {@link XLayerHandler.startLayer()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the layerif there is a unfinished subnode in progre
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endLayer(): Unit
  
  /**
    * receives notification that a node description is complete.
    *
    * Must match the last open call to {@link XLayerHandler.overrideNode()} , {@link XLayerHandler.addOrReplaceNode()} or {@link
    * XLayerHandler.addOrReplaceNodeFromTemplate()} .
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the nodeif no node is started at all**Not every imp
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endNode(): Unit
  
  /**
    * receives notification that a property description is complete.
    *
    * Must match an open call to {@link XLayerHandler.overrideProperty()} ,
    * @throws com::sun::star::configuration::backend::MalformedDataException if invalid data is detected in the propertyif no property is started at all**Not e
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def endProperty(): Unit
  
  /**
    * receives notification that a description of a node override is started.
    *
    * Subsequent calls describe overrides to properties and members or items of the node until a matching call to {@link XLayerHandler.endNode()} is
    * encountered.
    * @param aName specifies the name of the node.
    * @param aAttributes specifies attribute values to be applied to the node.  The value is a combination of {@link NodeAttribute} flags.  The attributes are
    * @param bClear if `TRUE` , specifies that the node should be cleared to an empty state by removing all non-mandatory children from lower layers prior to
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a layer in progressif there already was a change to that nodeif the
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def overrideNode(aName: String, aAttributes: Double, bClear: Boolean): Unit
  
  /**
    * receives notification that an existing property is modified.
    *
    * Subsequent calls describe new value(s) for the property until a matching call to {@link XLayerHandler.endProperty()} is encountered.
    * @param aName specifies the name of the property.
    * @param aAttributes specifies the new attributes of the property.  The value is a combination of {@link NodeAttribute} flags.  The attributes are combine
    * @param aType specifies the type of the property.  This must be the same type as is already defined in the schema or lower layers, unless the previous ty
    * @param bClear if `TRUE` , specifies that the property should be cleared to an empty state by discarding all values from lower layers prior to applying t
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a group or extensible node in progress currentlyif there already wa
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def overrideProperty(aName: String, aAttributes: Double, aType: `type`, bClear: Boolean): Unit
  
  /**
    * receives notification that the value of the current property is overridden.
    * @param aValue specifies the new value of the property.  The value must match the type of the current property. If the property does not have the {@link
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property in progress currentlyif there already was a change to th
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValue(aValue: js.Any): Unit
  
  /**
    * receives notification that the value of the current localized property is overridden for a specific locale .
    * @param aValue specifies the new value of the property.  The value must match the type of the current property. If the property does not have the {@link
    * @param aLocale specifies the locale this value should apply to.
    * @see com.sun.star.configuration.backend.NodeAttribute
    * @throws com::sun::star::configuration::backend::MalformedDataException if there isn't a property in progress currentlyif the current property isn't local
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def setPropertyValueForLocale(aValue: js.Any, aLocale: String): Unit
  
  /**
    * receives notification that a layer description is started for a component.
    *
    * Subsequent calls describe the contents of the layer until a matching call to {@link XLayerHandler.endLayer()} is encountered.
    * @throws com::sun::star::configuration::backend::MalformedDataException if there is an unfinished layer in progress
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs processing the event.
    */
  def startLayer(): Unit
}
object XLayerHandler {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addOrReplaceNode: (String, Double) => Unit,
    addOrReplaceNodeFromTemplate: (String, TemplateIdentifier, Double) => Unit,
    addProperty: (String, Double, `type`) => Unit,
    addPropertyWithValue: (String, Double, js.Any) => Unit,
    dropNode: String => Unit,
    endLayer: () => Unit,
    endNode: () => Unit,
    endProperty: () => Unit,
    overrideNode: (String, Double, Boolean) => Unit,
    overrideProperty: (String, Double, `type`, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPropertyValue: js.Any => Unit,
    setPropertyValueForLocale: (js.Any, String) => Unit,
    startLayer: () => Unit
  ): XLayerHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addOrReplaceNode = js.Any.fromFunction2(addOrReplaceNode), addOrReplaceNodeFromTemplate = js.Any.fromFunction3(addOrReplaceNodeFromTemplate), addProperty = js.Any.fromFunction3(addProperty), addPropertyWithValue = js.Any.fromFunction3(addPropertyWithValue), dropNode = js.Any.fromFunction1(dropNode), endLayer = js.Any.fromFunction0(endLayer), endNode = js.Any.fromFunction0(endNode), endProperty = js.Any.fromFunction0(endProperty), overrideNode = js.Any.fromFunction3(overrideNode), overrideProperty = js.Any.fromFunction4(overrideProperty), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPropertyValue = js.Any.fromFunction1(setPropertyValue), setPropertyValueForLocale = js.Any.fromFunction2(setPropertyValueForLocale), startLayer = js.Any.fromFunction0(startLayer))
    __obj.asInstanceOf[XLayerHandler]
  }
  
  @scala.inline
  implicit class XLayerHandlerMutableBuilder[Self <: XLayerHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOrReplaceNode(value: (String, Double) => Unit): Self = StObject.set(x, "addOrReplaceNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddOrReplaceNodeFromTemplate(value: (String, TemplateIdentifier, Double) => Unit): Self = StObject.set(x, "addOrReplaceNodeFromTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddProperty(value: (String, Double, `type`) => Unit): Self = StObject.set(x, "addProperty", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddPropertyWithValue(value: (String, Double, js.Any) => Unit): Self = StObject.set(x, "addPropertyWithValue", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDropNode(value: String => Unit): Self = StObject.set(x, "dropNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEndLayer(value: () => Unit): Self = StObject.set(x, "endLayer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndNode(value: () => Unit): Self = StObject.set(x, "endNode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndProperty(value: () => Unit): Self = StObject.set(x, "endProperty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOverrideNode(value: (String, Double, Boolean) => Unit): Self = StObject.set(x, "overrideNode", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOverrideProperty(value: (String, Double, `type`, Boolean) => Unit): Self = StObject.set(x, "overrideProperty", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSetPropertyValue(value: js.Any => Unit): Self = StObject.set(x, "setPropertyValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPropertyValueForLocale(value: (js.Any, String) => Unit): Self = StObject.set(x, "setPropertyValueForLocale", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartLayer(value: () => Unit): Self = StObject.set(x, "startLayer", js.Any.fromFunction0(value))
  }
}

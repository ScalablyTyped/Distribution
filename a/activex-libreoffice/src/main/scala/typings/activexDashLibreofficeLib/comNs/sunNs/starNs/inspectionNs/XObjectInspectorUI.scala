package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * grants access to certain aspects of the user interface of an object inspector
  *
  * This interface is used as callback for XPropertyHandlers.
  *
  * As a consequence, methods operating on the UI for a property, and taking the name of this property, are tolerant against properties which do not
  * exist. For instance, if a property handler tries to disable the UI for property `Foo` , but another handler has superseded this property, then the
  * {@link ObjectInspector} will not **have** any UI for it. In this case, the call to `enablePropertyUI( "Foo" )` will simply be ignored.
  * @since OOo 2.0.3
  */
trait XObjectInspectorUI extends js.Object {
  /**
    * enables or disables all components belonging to the UI representation of a property
    *
    * This is usually used by an {@link XPropertyHandler} if it handles properties, where one does only make sense if another one has a certain value.
    * @param PropertyName denotes the name of the property whose UI is to be enabled or disabled.
    * @param Enable `TRUE` if and only if the UI should be disabled, `FALSE` otherwise.
    */
  def enablePropertyUI(PropertyName: java.lang.String, Enable: scala.Boolean): scala.Unit
  /**
    * enables or disables the single elements which can be part of the UI representation of a property
    *
    * Note that the complete UI for the property must be enabled in order for these settings to be evaluated. That is, {@link enablePropertyUIElements()}
    * does not have any effect if somebody previously disabled the complete UI for this property with {@link enablePropertyUI()} .
    * @param PropertyName the name of the property whose user interface elements are to be enabled or disabled
    * @param Elements a combination of {@link PropertyLineElement} flags specifying which elements are to be enabled or disabled. ;  Note that if you don't se
    * @param Enable `TRUE` if the elements denoted by _nElements should be enabled, `FALSE` if they should be disabled.
    */
  def enablePropertyUIElements(PropertyName: java.lang.String, Elements: scala.Double, Enable: scala.Boolean): scala.Unit
  /**
    * retrieves the control currently used to display a given property
    * @param PropertyName the name of the property whose control should be retrieved
    * @returns the {@link XPropertyControl} representing the given property, or `NULL` if there is no such property control.
    */
  def getPropertyControl(PropertyName: java.lang.String): XPropertyControl
  /**
    * hides the UI for a given property
    * @param PropertyName the name of the property whose UI is to be hidden
    */
  def hidePropertyUI(PropertyName: java.lang.String): scala.Unit
  /**
    * completely rebuilds the UI for the given property.
    *
    * This method might be used by an {@link XPropertyHandler} if it wants to change the type of control (see {@link PropertyControlType} ) used to display
    * a certain property.
    *
    * The object inspector will then call describePropertyLine again, and update its UI accordingly.
    *
    * Note that the property whose UI should be rebuilt must not necessarily be (though usually **is** ) in the responsibility of the handler which calls
    * this method. The object inspector will look up the handler with the responsibility for PropertyName and call its {@link
    * XPropertyHandler.describePropertyLine()}
    * @param PropertyName the name of the property whose UI is to be completely rebuilt.
    */
  def rebuildPropertyUI(PropertyName: java.lang.String): scala.Unit
  /**
    * registers an observer for all property controls
    *
    * The given {@link XPropertyControlObserver} will be notified of all changes in all property controls.
    * @see revokeControlObserver
    * @since OOo 2.2
    */
  def registerControlObserver(Observer: XPropertyControlObserver): scala.Unit
  /**
    * revokes a previously registered control observer
    * @see registerControlObserver
    * @since OOo 2.2
    */
  def revokeControlObserver(Observer: XPropertyControlObserver): scala.Unit
  /**
    * sets the text of the help section, if the object inspector contains one.
    * @since OOo 2.2
    * @throws NoSupportException if the {@link XObjectInspectorModel.HasHelpSection} property requires the help section to be unavailable.
    */
  def setHelpSectionText(HelpText: java.lang.String): scala.Unit
  /**
    * shows or hides all properties belonging to a given category
    * @see LineDescriptor.Category
    * @see XObjectInspectorModel.describeCategories
    */
  def showCategory(Category: java.lang.String, Show: scala.Boolean): scala.Unit
  /**
    * shows the UI for a given property
    * @param PropertyName the name of the property whose UI is to be shown
    */
  def showPropertyUI(PropertyName: java.lang.String): scala.Unit
}


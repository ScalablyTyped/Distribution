package typings.activexLibreoffice.com_.sun.star.inspection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XObjectInspectorUI extends StObject {
  
  /**
    * enables or disables all components belonging to the UI representation of a property
    *
    * This is usually used by an {@link XPropertyHandler} if it handles properties, where one does only make sense if another one has a certain value.
    * @param PropertyName denotes the name of the property whose UI is to be enabled or disabled.
    * @param Enable `TRUE` if and only if the UI should be disabled, `FALSE` otherwise.
    */
  def enablePropertyUI(PropertyName: String, Enable: Boolean): Unit = js.native
  
  /**
    * enables or disables the single elements which can be part of the UI representation of a property
    *
    * Note that the complete UI for the property must be enabled in order for these settings to be evaluated. That is, {@link enablePropertyUIElements()}
    * does not have any effect if somebody previously disabled the complete UI for this property with {@link enablePropertyUI()} .
    * @param PropertyName the name of the property whose user interface elements are to be enabled or disabled
    * @param Elements a combination of {@link PropertyLineElement} flags specifying which elements are to be enabled or disabled. ;  Note that if you don't se
    * @param Enable `TRUE` if the elements denoted by _nElements should be enabled, `FALSE` if they should be disabled.
    */
  def enablePropertyUIElements(PropertyName: String, Elements: Double, Enable: Boolean): Unit = js.native
  
  /**
    * retrieves the control currently used to display a given property
    * @param PropertyName the name of the property whose control should be retrieved
    * @returns the {@link XPropertyControl} representing the given property, or `NULL` if there is no such property control.
    */
  def getPropertyControl(PropertyName: String): XPropertyControl = js.native
  
  /**
    * hides the UI for a given property
    * @param PropertyName the name of the property whose UI is to be hidden
    */
  def hidePropertyUI(PropertyName: String): Unit = js.native
  
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
  def rebuildPropertyUI(PropertyName: String): Unit = js.native
  
  /**
    * registers an observer for all property controls
    *
    * The given {@link XPropertyControlObserver} will be notified of all changes in all property controls.
    * @see revokeControlObserver
    * @since OOo 2.2
    */
  def registerControlObserver(Observer: XPropertyControlObserver): Unit = js.native
  
  /**
    * revokes a previously registered control observer
    * @see registerControlObserver
    * @since OOo 2.2
    */
  def revokeControlObserver(Observer: XPropertyControlObserver): Unit = js.native
  
  /**
    * sets the text of the help section, if the object inspector contains one.
    * @since OOo 2.2
    * @throws NoSupportException if the {@link XObjectInspectorModel.HasHelpSection} property requires the help section to be unavailable.
    */
  def setHelpSectionText(HelpText: String): Unit = js.native
  
  /**
    * shows or hides all properties belonging to a given category
    * @see LineDescriptor.Category
    * @see XObjectInspectorModel.describeCategories
    */
  def showCategory(Category: String, Show: Boolean): Unit = js.native
  
  /**
    * shows the UI for a given property
    * @param PropertyName the name of the property whose UI is to be shown
    */
  def showPropertyUI(PropertyName: String): Unit = js.native
}
object XObjectInspectorUI {
  
  @scala.inline
  def apply(
    enablePropertyUI: (String, Boolean) => Unit,
    enablePropertyUIElements: (String, Double, Boolean) => Unit,
    getPropertyControl: String => XPropertyControl,
    hidePropertyUI: String => Unit,
    rebuildPropertyUI: String => Unit,
    registerControlObserver: XPropertyControlObserver => Unit,
    revokeControlObserver: XPropertyControlObserver => Unit,
    setHelpSectionText: String => Unit,
    showCategory: (String, Boolean) => Unit,
    showPropertyUI: String => Unit
  ): XObjectInspectorUI = {
    val __obj = js.Dynamic.literal(enablePropertyUI = js.Any.fromFunction2(enablePropertyUI), enablePropertyUIElements = js.Any.fromFunction3(enablePropertyUIElements), getPropertyControl = js.Any.fromFunction1(getPropertyControl), hidePropertyUI = js.Any.fromFunction1(hidePropertyUI), rebuildPropertyUI = js.Any.fromFunction1(rebuildPropertyUI), registerControlObserver = js.Any.fromFunction1(registerControlObserver), revokeControlObserver = js.Any.fromFunction1(revokeControlObserver), setHelpSectionText = js.Any.fromFunction1(setHelpSectionText), showCategory = js.Any.fromFunction2(showCategory), showPropertyUI = js.Any.fromFunction1(showPropertyUI))
    __obj.asInstanceOf[XObjectInspectorUI]
  }
  
  @scala.inline
  implicit class XObjectInspectorUIMutableBuilder[Self <: XObjectInspectorUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnablePropertyUI(value: (String, Boolean) => Unit): Self = StObject.set(x, "enablePropertyUI", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnablePropertyUIElements(value: (String, Double, Boolean) => Unit): Self = StObject.set(x, "enablePropertyUIElements", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPropertyControl(value: String => XPropertyControl): Self = StObject.set(x, "getPropertyControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHidePropertyUI(value: String => Unit): Self = StObject.set(x, "hidePropertyUI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRebuildPropertyUI(value: String => Unit): Self = StObject.set(x, "rebuildPropertyUI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterControlObserver(value: XPropertyControlObserver => Unit): Self = StObject.set(x, "registerControlObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRevokeControlObserver(value: XPropertyControlObserver => Unit): Self = StObject.set(x, "revokeControlObserver", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpSectionText(value: String => Unit): Self = StObject.set(x, "setHelpSectionText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShowCategory(value: (String, Boolean) => Unit): Self = StObject.set(x, "showCategory", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShowPropertyUI(value: String => Unit): Self = StObject.set(x, "showPropertyUI", js.Any.fromFunction1(value))
  }
}

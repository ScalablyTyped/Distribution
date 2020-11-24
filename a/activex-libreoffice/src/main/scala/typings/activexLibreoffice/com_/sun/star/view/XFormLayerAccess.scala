package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlModel
import typings.activexLibreoffice.com_.sun.star.form.XForm
import typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the form layer elements in a view
  * @since OOo 2.3
  */
@js.native
trait XFormLayerAccess extends XControlAccess {
  
  /**
    * returns the {@link com.sun.star.form.FormController} instance which operates on a given form.
    *
    * A form controller is a component which controls the user interaction with the form layer, as long as the form is not in design mode.
    * @returns the requested form controller, or `NULL` if the view's form layer is currently in design mode. Note that the returned instance becomes non-functi
    * @see isDesignMode
    * @see setDesignMode
    * @see com.sun.star.form.runtime.FormController
    * @see com.sun.star.form.runtime.FormOperations
    */
  def getFormController(Form: XForm): XFormController = js.native
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and asking for the current mode is the same as asking for the state of this feature.
    */
  def isFormDesignMode(): Boolean = js.native
  
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and changing the current mode is the same as dispatching this feature URL.
    */
  def setFormDesignMode(DesignMode: Boolean): Unit = js.native
}
object XFormLayerAccess {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getControl: XControlModel => XControl,
    getFormController: XForm => XFormController,
    isFormDesignMode: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFormDesignMode: Boolean => Unit
  ): XFormLayerAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFormController = js.Any.fromFunction1(getFormController), isFormDesignMode = js.Any.fromFunction0(isFormDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormDesignMode = js.Any.fromFunction1(setFormDesignMode))
    __obj.asInstanceOf[XFormLayerAccess]
  }
  
  @scala.inline
  implicit class XFormLayerAccessOps[Self <: XFormLayerAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetFormController(value: XForm => XFormController): Self = this.set("getFormController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsFormDesignMode(value: () => Boolean): Self = this.set("isFormDesignMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFormDesignMode(value: Boolean => Unit): Self = this.set("setFormDesignMode", js.Any.fromFunction1(value))
  }
}

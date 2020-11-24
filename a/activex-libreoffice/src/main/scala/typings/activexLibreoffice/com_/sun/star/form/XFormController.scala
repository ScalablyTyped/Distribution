package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabController
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is superseded by {@link com.sun.star.form.runtime.XFormController} .
  * @deprecated Deprecated
  */
@js.native
trait XFormController extends XTabController {
  
  val CurrentControl: XControl = js.native
  
  def addActivateListener(l: XFormControllerListener): Unit = js.native
  
  def getCurrentControl(): XControl = js.native
  
  def removeActivateListener(l: XFormControllerListener): Unit = js.native
}
object XFormController {
  
  @scala.inline
  def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    CurrentControl: XControl,
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    addActivateListener: XFormControllerListener => Unit,
    autoTabOrder: () => Unit,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getCurrentControl: () => XControl,
    getModel: () => XTabControllerModel,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActivateListener: XFormControllerListener => Unit,
    setContainer: XControlContainer => Unit,
    setModel: XTabControllerModel => Unit
  ): XFormController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCurrentControl = js.Any.fromFunction0(getCurrentControl), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[XFormController]
  }
  
  @scala.inline
  implicit class XFormControllerOps[Self <: XFormController] (val x: Self) extends AnyVal {
    
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
    def setCurrentControl(value: XControl): Self = this.set("CurrentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddActivateListener(value: XFormControllerListener => Unit): Self = this.set("addActivateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentControl(value: () => XControl): Self = this.set("getCurrentControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveActivateListener(value: XFormControllerListener => Unit): Self = this.set("removeActivateListener", js.Any.fromFunction1(value))
  }
}

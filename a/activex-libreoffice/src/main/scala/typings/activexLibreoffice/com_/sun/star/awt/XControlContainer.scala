package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the controls within an {@link UnoControlContainer} . */
@js.native
trait XControlContainer extends XInterface {
  /** returns all controls. */
  val Controls: SafeArray[XControl] = js.native
  /** adds the given control with the specified name to the container. */
  def addControl(Name: String, Control: XControl): Unit = js.native
  /** returns the control with the specified name. */
  def getControl(aName: String): XControl = js.native
  /** returns all controls. */
  def getControls(): SafeArray[XControl] = js.native
  /** removes the given control from the container. */
  def removeControl(Control: XControl): Unit = js.native
  /** sets the status text in the status bar of the container. */
  def setStatusText(StatusText: String): Unit = js.native
}

object XControlContainer {
  @scala.inline
  def apply(
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    addControl: (String, XControl) => Unit,
    getControl: String => XControl,
    getControls: () => SafeArray[XControl],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeControl: XControl => Unit,
    setStatusText: String => Unit
  ): XControlContainer = {
    val __obj = js.Dynamic.literal(Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addControl = js.Any.fromFunction2(addControl), getControl = js.Any.fromFunction1(getControl), getControls = js.Any.fromFunction0(getControls), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeControl = js.Any.fromFunction1(removeControl), setStatusText = js.Any.fromFunction1(setStatusText))
    __obj.asInstanceOf[XControlContainer]
  }
  @scala.inline
  implicit class XControlContainerOps[Self <: XControlContainer] (val x: Self) extends AnyVal {
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
    def setControls(value: SafeArray[XControl]): Self = this.set("Controls", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddControl(value: (String, XControl) => Unit): Self = this.set("addControl", js.Any.fromFunction2(value))
    @scala.inline
    def setGetControl(value: String => XControl): Self = this.set("getControl", js.Any.fromFunction1(value))
    @scala.inline
    def setGetControls(value: () => SafeArray[XControl]): Self = this.set("getControls", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveControl(value: XControl => Unit): Self = this.set("removeControl", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStatusText(value: String => Unit): Self = this.set("setStatusText", js.Any.fromFunction1(value))
  }
  
}


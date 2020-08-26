package typings.activexLibreoffice.com_.sun.star.inspection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface of the context of an {@link XPropertyControl} .
  * @see XPropertyControl.ControlContext
  * @since OOo 2.0.3
  */
@js.native
trait XPropertyControlContext extends XPropertyControlObserver {
  /**
    * instructs the {@link XPropertyControlContext} to active the next control
    * @param CurrentControl denotes the control which initiated the request.
    */
  def activateNextControl(CurrentControl: XPropertyControl): Unit = js.native
}

object XPropertyControlContext {
  @scala.inline
  def apply(
    activateNextControl: XPropertyControl => Unit,
    focusGained: XPropertyControl => Unit,
    valueChanged: XPropertyControl => Unit
  ): XPropertyControlContext = {
    val __obj = js.Dynamic.literal(activateNextControl = js.Any.fromFunction1(activateNextControl), focusGained = js.Any.fromFunction1(focusGained), valueChanged = js.Any.fromFunction1(valueChanged))
    __obj.asInstanceOf[XPropertyControlContext]
  }
  @scala.inline
  implicit class XPropertyControlContextOps[Self <: XPropertyControlContext] (val x: Self) extends AnyVal {
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
    def setActivateNextControl(value: XPropertyControl => Unit): Self = this.set("activateNextControl", js.Any.fromFunction1(value))
  }
  
}


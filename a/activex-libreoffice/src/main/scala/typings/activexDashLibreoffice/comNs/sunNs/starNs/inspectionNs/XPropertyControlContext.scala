package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the interface of the context of an {@link XPropertyControl} .
  * @see XPropertyControl.ControlContext
  * @since OOo 2.0.3
  */
trait XPropertyControlContext extends XPropertyControlObserver {
  /**
    * instructs the {@link XPropertyControlContext} to active the next control
    * @param CurrentControl denotes the control which initiated the request.
    */
  def activateNextControl(CurrentControl: XPropertyControl): Unit
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
}


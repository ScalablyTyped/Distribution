package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

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
  def activateNextControl(CurrentControl: XPropertyControl): scala.Unit
}

object XPropertyControlContext {
  @scala.inline
  def apply(
    activateNextControl: js.Function1[XPropertyControl, scala.Unit],
    focusGained: js.Function1[XPropertyControl, scala.Unit],
    valueChanged: js.Function1[XPropertyControl, scala.Unit]
  ): XPropertyControlContext = {
    val __obj = js.Dynamic.literal(activateNextControl = activateNextControl, focusGained = focusGained, valueChanged = valueChanged)
  
    __obj.asInstanceOf[XPropertyControlContext]
  }
}


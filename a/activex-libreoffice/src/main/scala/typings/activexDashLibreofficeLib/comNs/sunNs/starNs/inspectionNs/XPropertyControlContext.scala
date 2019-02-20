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


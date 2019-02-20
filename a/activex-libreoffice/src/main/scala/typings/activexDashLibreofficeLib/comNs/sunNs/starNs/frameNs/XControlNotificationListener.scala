package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Must be implemented by dispatch objects which want to get notifications about control events.
  * @since OOo 2.0.3
  */
trait XControlNotificationListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * notifies that a control event has happened
    * @param Event contains the event information
    */
  def controlEvent(Event: ControlEvent): scala.Unit
}


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

object XControlNotificationListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    controlEvent: ControlEvent => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XControlNotificationListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), controlEvent = js.Any.fromFunction1(controlEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XControlNotificationListener]
  }
}


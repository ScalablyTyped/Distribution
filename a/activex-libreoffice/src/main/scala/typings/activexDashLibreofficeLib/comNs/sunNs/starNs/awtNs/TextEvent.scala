package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a text event. */
trait TextEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** This is a dummy field only. Please ignore. */
  var dummy1: scala.Double
}

object TextEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, dummy1: scala.Double): TextEvent = {
    val __obj = js.Dynamic.literal(Source = Source, dummy1 = dummy1)
  
    __obj.asInstanceOf[TextEvent]
  }
}


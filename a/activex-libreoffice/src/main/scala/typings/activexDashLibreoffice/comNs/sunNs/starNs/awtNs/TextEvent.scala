package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a text event. */
trait TextEvent extends EventObject {
  /** This is a dummy field only. Please ignore. */
  var dummy1: Double
}

object TextEvent {
  @scala.inline
  def apply(Source: XInterface, dummy1: Double): TextEvent = {
    val __obj = js.Dynamic.literal(Source = Source, dummy1 = dummy1)
  
    __obj.asInstanceOf[TextEvent]
  }
}


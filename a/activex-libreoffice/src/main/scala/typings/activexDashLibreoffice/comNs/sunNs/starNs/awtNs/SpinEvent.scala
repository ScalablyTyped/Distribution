package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a spin button event. */
trait SpinEvent extends EventObject {
  /** This is a dummy field only. Please ignore. */
  var dummy1: Double
}

object SpinEvent {
  @scala.inline
  def apply(Source: XInterface, dummy1: Double): SpinEvent = {
    val __obj = js.Dynamic.literal(Source = Source, dummy1 = dummy1)
  
    __obj.asInstanceOf[SpinEvent]
  }
}


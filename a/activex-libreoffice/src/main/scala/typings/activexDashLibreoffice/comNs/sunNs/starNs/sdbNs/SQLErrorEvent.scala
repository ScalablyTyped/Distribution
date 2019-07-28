package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is invoked in case of fired database exception triggered by a database object. */
trait SQLErrorEvent extends EventObject {
  /** contains the exception that is going to be fired. */
  var Reason: js.Any
}

object SQLErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason, Source = Source)
  
    __obj.asInstanceOf[SQLErrorEvent]
  }
}


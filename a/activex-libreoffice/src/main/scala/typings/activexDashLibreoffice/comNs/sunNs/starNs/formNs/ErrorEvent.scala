package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * occurs in case of fired database exceptions triggered by a database form.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait ErrorEvent extends EventObject {
  var Reason: js.Any
}

object ErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: XInterface): ErrorEvent = {
    val __obj = js.Dynamic.literal(Reason = Reason, Source = Source)
  
    __obj.asInstanceOf[ErrorEvent]
  }
}


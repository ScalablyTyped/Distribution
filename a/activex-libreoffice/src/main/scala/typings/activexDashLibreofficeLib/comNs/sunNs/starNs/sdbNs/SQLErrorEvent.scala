package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is invoked in case of fired database exception triggered by a database object. */
trait SQLErrorEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** contains the exception that is going to be fired. */
  var Reason: js.Any
}

object SQLErrorEvent {
  @scala.inline
  def apply(Reason: js.Any, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): SQLErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Reason")(Reason)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[SQLErrorEvent]
  }
}


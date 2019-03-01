package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is fired if a database record is going to be deleted.
  *
  * Please do **not** use anymore, this struct is deprecated.
  * @deprecated Deprecated
  */
trait DatabaseDeleteEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var Bookmarks: activexDashInteropLib.SafeArray[_]
}

object DatabaseDeleteEvent {
  @scala.inline
  def apply(
    Bookmarks: activexDashInteropLib.SafeArray[_],
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): DatabaseDeleteEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bookmarks")(Bookmarks)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[DatabaseDeleteEvent]
  }
}


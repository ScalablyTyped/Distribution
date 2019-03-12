package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates which rows have changed and the type of change action on the row set. */
trait RowsChangeEvent extends RowChangeEvent {
  var Bookmarks: stdLib.SafeArray[_]
}

object RowsChangeEvent {
  @scala.inline
  def apply(
    Action: scala.Double,
    Bookmarks: stdLib.SafeArray[_],
    Rows: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): RowsChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Bookmarks = Bookmarks, Rows = Rows, Source = Source)
  
    __obj.asInstanceOf[RowsChangeEvent]
  }
}


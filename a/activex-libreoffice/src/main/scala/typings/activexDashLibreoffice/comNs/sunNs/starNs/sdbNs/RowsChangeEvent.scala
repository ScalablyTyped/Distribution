package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** indicates which rows have changed and the type of change action on the row set. */
trait RowsChangeEvent extends RowChangeEvent {
  var Bookmarks: SafeArray[_]
}

object RowsChangeEvent {
  @scala.inline
  def apply(Action: Double, Bookmarks: SafeArray[_], Rows: Double, Source: XInterface): RowsChangeEvent = {
    val __obj = js.Dynamic.literal(Action = Action, Bookmarks = Bookmarks, Rows = Rows, Source = Source)
  
    __obj.asInstanceOf[RowsChangeEvent]
  }
}


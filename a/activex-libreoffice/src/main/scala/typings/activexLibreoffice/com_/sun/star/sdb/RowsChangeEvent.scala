package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Bookmarks = Bookmarks.asInstanceOf[js.Any], Rows = Rows.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsChangeEvent]
  }
}


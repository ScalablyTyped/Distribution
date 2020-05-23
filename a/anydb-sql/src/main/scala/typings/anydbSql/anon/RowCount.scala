package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowCount[T] extends js.Object {
  var rowCount: Double
  var rows: js.Array[T]
}

object RowCount {
  @scala.inline
  def apply[T](rowCount: Double, rows: js.Array[T]): RowCount[T] = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCount[T]]
  }
}


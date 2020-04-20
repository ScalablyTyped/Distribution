package typings.anydbSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowCount[T] extends js.Object {
  var rowCount: Double
  var rows: js.Array[T]
}

object AnonRowCount {
  @scala.inline
  def apply[T](rowCount: Double, rows: js.Array[T]): AnonRowCount[T] = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowCount[T]]
  }
}


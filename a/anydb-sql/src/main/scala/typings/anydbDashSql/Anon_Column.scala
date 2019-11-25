package typings.anydbDashSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: String
  var table: String
}

object Anon_Column {
  @scala.inline
  def apply(column: String, table: String): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Column]
  }
}


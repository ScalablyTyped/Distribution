package typings.anydbSql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: String
  var table: String
}

object AnonColumn {
  @scala.inline
  def apply(column: String, table: String): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}


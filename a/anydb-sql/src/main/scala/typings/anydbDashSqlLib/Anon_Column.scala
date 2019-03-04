package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: java.lang.String
  var table: java.lang.String
}

object Anon_Column {
  @scala.inline
  def apply(column: java.lang.String, table: java.lang.String): Anon_Column = {
    val __obj = js.Dynamic.literal(column = column, table = table)
  
    __obj.asInstanceOf[Anon_Column]
  }
}


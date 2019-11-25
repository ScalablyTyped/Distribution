package typings.anydbDashSql.anydbDashSqlMod

import typings.anydbDashSql.Anon_C
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQL extends js.Object {
  var functions: Anon_C
}

object SQL {
  @scala.inline
  def apply(functions: Anon_C): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SQL]
  }
}


package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQL extends js.Object {
  var functions: anydbDashSqlLib.Anon_C
}

object SQL {
  @scala.inline
  def apply(functions: anydbDashSqlLib.Anon_C): SQL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("functions")(functions)
    __obj.asInstanceOf[SQL]
  }
}


package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  def LOWER(c: anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
}

object Anon_C {
  @scala.inline
  def apply(
    LOWER: js.Function1[
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String], 
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
    ]
  ): Anon_C = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOWER")(LOWER)
    __obj.asInstanceOf[Anon_C]
  }
}


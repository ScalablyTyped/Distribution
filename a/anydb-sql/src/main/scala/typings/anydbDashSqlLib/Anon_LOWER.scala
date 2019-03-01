package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOWER extends js.Object {
  def LOWER(name: anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
  def RTRIM(name: anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
}

object Anon_LOWER {
  @scala.inline
  def apply(
    LOWER: js.Function1[
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String], 
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
    ],
    RTRIM: js.Function1[
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String], 
      anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Column[java.lang.String]
    ]
  ): Anon_LOWER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOWER")(LOWER)
    __obj.updateDynamic("RTRIM")(RTRIM)
    __obj.asInstanceOf[Anon_LOWER]
  }
}


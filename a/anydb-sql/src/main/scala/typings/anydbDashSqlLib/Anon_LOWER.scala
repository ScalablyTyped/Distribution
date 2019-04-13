package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOWER extends js.Object {
  def LOWER(name: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]
  def RTRIM(name: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]
}

object Anon_LOWER {
  @scala.inline
  def apply(
    LOWER: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String] => anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String],
    RTRIM: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String] => anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]
  ): Anon_LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
  
    __obj.asInstanceOf[Anon_LOWER]
  }
}


package typings
package anydbDashSqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  def LOWER(c: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]): anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]
}

object Anon_C {
  @scala.inline
  def apply(
    LOWER: anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String] => anydbDashSqlLib.anydbDashSqlMod.Column[java.lang.String]
  ): Anon_C = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
  
    __obj.asInstanceOf[Anon_C]
  }
}


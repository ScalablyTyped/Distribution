package typings.anydbDashSql

import typings.anydbDashSql.anydbDashSqlMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  def LOWER(c: Column[String]): Column[String]
}

object Anon_C {
  @scala.inline
  def apply(LOWER: Column[String] => Column[String]): Anon_C = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
  
    __obj.asInstanceOf[Anon_C]
  }
}


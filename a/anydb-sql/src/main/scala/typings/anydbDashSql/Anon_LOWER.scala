package typings.anydbDashSql

import typings.anydbDashSql.anydbDashSqlMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOWER extends js.Object {
  def LOWER(name: Column[String]): Column[String]
  def RTRIM(name: Column[String]): Column[String]
}

object Anon_LOWER {
  @scala.inline
  def apply(LOWER: Column[String] => Column[String], RTRIM: Column[String] => Column[String]): Anon_LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
  
    __obj.asInstanceOf[Anon_LOWER]
  }
}


package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTRIM extends js.Object {
  def LOWER(name: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String]
  def RTRIM(name: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String]
}

object RTRIM {
  @scala.inline
  def apply(
    LOWER: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String],
    RTRIM: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]
  ): RTRIM = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
    __obj.asInstanceOf[RTRIM]
  }
}


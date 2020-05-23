package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LOWER extends js.Object {
  def LOWER(c: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String]
}

object LOWER {
  @scala.inline
  def apply(LOWER: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[LOWER]
  }
}


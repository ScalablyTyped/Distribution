package typings.anydbSql

import typings.anydbSql.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOWER extends js.Object {
  def LOWER(c: Column[String]): Column[String]
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[String] => Column[String]): AnonLOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[AnonLOWER]
  }
}


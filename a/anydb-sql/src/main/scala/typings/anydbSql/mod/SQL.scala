package typings.anydbSql.mod

import typings.anydbSql.AnonLOWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQL extends js.Object {
  var functions: AnonLOWER
}

object SQL {
  @scala.inline
  def apply(functions: AnonLOWER): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
}


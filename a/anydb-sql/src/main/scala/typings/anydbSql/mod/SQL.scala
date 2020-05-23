package typings.anydbSql.mod

import typings.anydbSql.anon.LOWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQL extends js.Object {
  var functions: LOWER
}

object SQL {
  @scala.inline
  def apply(functions: LOWER): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQL]
  }
}


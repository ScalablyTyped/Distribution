package typings.anydbSql.mod

import typings.anydbSql.AnonC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQL extends js.Object {
  var functions: AnonC
}

object SQL {
  @scala.inline
  def apply(functions: AnonC): SQL = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SQL]
  }
}


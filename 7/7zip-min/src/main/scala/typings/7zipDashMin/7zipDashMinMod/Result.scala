package typings.`7zipDashMin`.`7zipDashMinMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var attr: String
  var compressed: String
  var date: String
  var name: String
  var size: String
  var time: String
}

object Result {
  @scala.inline
  def apply(attr: String, compressed: String, date: String, name: String, size: String, time: String): Result = {
    val __obj = js.Dynamic.literal(attr = attr, compressed = compressed, date = date, name = name, size = size, time = time)
  
    __obj.asInstanceOf[Result]
  }
}


package typings.`7zipMin`.mod

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
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}


package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilePath extends js.Object {
  var filePath: String
  var fn: js.Any
  var name: String
}

object AnonFilePath {
  @scala.inline
  def apply(filePath: String, fn: js.Any, name: String): AnonFilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilePath]
  }
}


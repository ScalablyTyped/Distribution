package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait outputFormat extends js.Object {
  var ARRAY: String
  var JSON: String
  var STRING: String
}

object outputFormat {
  @scala.inline
  def apply(ARRAY: String, JSON: String, STRING: String): outputFormat = {
    val __obj = js.Dynamic.literal(ARRAY = ARRAY.asInstanceOf[js.Any], JSON = JSON.asInstanceOf[js.Any], STRING = STRING.asInstanceOf[js.Any])
    __obj.asInstanceOf[outputFormat]
  }
}


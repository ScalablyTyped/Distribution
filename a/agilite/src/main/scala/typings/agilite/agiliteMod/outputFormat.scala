package typings.agilite.agiliteMod

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
    val __obj = js.Dynamic.literal(ARRAY = ARRAY, JSON = JSON, STRING = STRING)
  
    __obj.asInstanceOf[outputFormat]
  }
}


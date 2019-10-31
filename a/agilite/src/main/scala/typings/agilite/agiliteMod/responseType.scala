package typings.agilite.agiliteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait responseType extends js.Object {
  var ARRAY_BUFFER: String
  var BLOB: String
  var DOCUMENT: String
  var JSON: String
  var STREAM: String
  var TEXT: String
}

object responseType {
  @scala.inline
  def apply(ARRAY_BUFFER: String, BLOB: String, DOCUMENT: String, JSON: String, STREAM: String, TEXT: String): responseType = {
    val __obj = js.Dynamic.literal(ARRAY_BUFFER = ARRAY_BUFFER, BLOB = BLOB, DOCUMENT = DOCUMENT, JSON = JSON, STREAM = STREAM, TEXT = TEXT)
  
    __obj.asInstanceOf[responseType]
  }
}


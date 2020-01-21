package typings.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawRawValue extends js.Object {
  var raw: String
  var rawValue: String
}

object AnonRawRawValue {
  @scala.inline
  def apply(raw: String, rawValue: String): AnonRawRawValue = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRawRawValue]
  }
}


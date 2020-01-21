package typings.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw extends js.Object {
  var raw: String
  var rawValue: Double
}

object AnonRaw {
  @scala.inline
  def apply(raw: String, rawValue: Double): AnonRaw = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRaw]
  }
}


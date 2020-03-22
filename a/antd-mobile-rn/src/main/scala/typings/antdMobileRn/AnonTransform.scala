package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform extends js.Object {
  var color: String
  var fontSize: Double
  var fontWeight: String
  var textAlign: String
  var transform: js.Array[AnonRotate]
}

object AnonTransform {
  @scala.inline
  def apply(
    color: String,
    fontSize: Double,
    fontWeight: String,
    textAlign: String,
    transform: js.Array[AnonRotate]
  ): AnonTransform = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTransform]
  }
}


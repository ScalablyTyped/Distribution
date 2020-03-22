package typings.antdMobileRn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var backgroundColor: String
  var position: String
  var top: Double
  var transform: js.Array[AnonRotate]
  var width: Double
}

object AnonPosition {
  @scala.inline
  def apply(
    backgroundColor: String,
    position: String,
    top: Double,
    transform: js.Array[AnonRotate],
    width: Double
  ): AnonPosition = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPosition]
  }
}


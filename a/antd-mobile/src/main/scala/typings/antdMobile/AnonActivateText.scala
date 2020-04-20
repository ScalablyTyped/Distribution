package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActivateText extends js.Object {
  var activateText: String
  var deactivateText: String
  var finishText: String
}

object AnonActivateText {
  @scala.inline
  def apply(activateText: String, deactivateText: String, finishText: String): AnonActivateText = {
    val __obj = js.Dynamic.literal(activateText = activateText.asInstanceOf[js.Any], deactivateText = deactivateText.asInstanceOf[js.Any], finishText = finishText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActivateText]
  }
}


package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivateText extends js.Object {
  var activateText: String
  var deactivateText: String
  var finishText: String
}

object ActivateText {
  @scala.inline
  def apply(activateText: String, deactivateText: String, finishText: String): ActivateText = {
    val __obj = js.Dynamic.literal(activateText = activateText.asInstanceOf[js.Any], deactivateText = deactivateText.asInstanceOf[js.Any], finishText = finishText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateText]
  }
}


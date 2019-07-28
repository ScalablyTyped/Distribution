package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleResponse extends js.Object {
  /** Optional text to be shown to user */
  var displayText: js.UndefOr[String] = js.undefined
  /** Speech to be spoken to user. SSML allowed. */
  var speech: String
}

object SimpleResponse {
  @scala.inline
  def apply(speech: String, displayText: String = null): SimpleResponse = {
    val __obj = js.Dynamic.literal(speech = speech)
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    __obj.asInstanceOf[SimpleResponse]
  }
}


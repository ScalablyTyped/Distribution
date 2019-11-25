package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2FinalResponse extends js.Object {
  /**
    * Rich response when user is not required to provide an input.
    */
  var richResponse: js.UndefOr[GoogleActionsV2RichResponse] = js.undefined
  /**
    * Spoken response when user is not required to provide an input.
    */
  var speechResponse: js.UndefOr[GoogleActionsV2SpeechResponse] = js.undefined
}

object GoogleActionsV2FinalResponse {
  @scala.inline
  def apply(
    richResponse: GoogleActionsV2RichResponse = null,
    speechResponse: GoogleActionsV2SpeechResponse = null
  ): GoogleActionsV2FinalResponse = {
    val __obj = js.Dynamic.literal()
    if (richResponse != null) __obj.updateDynamic("richResponse")(richResponse.asInstanceOf[js.Any])
    if (speechResponse != null) __obj.updateDynamic("speechResponse")(speechResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2FinalResponse]
  }
}


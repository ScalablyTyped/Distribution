package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2PlaceValueSpecPlaceDialogSpec extends js.Object {
  /**
    * This is the context for seeking permission to access various user related
    * data if the user prompts for personal location during the sub-dialog like
    * \"Home\", \"Work\" or \"Dad's house\". For example \"*To help you find
    * juice stores*, I just need to check your location. Can I get that from
    * Google?\". The first part of this permission prompt is configurable.
    */
  var permissionContext: js.UndefOr[String] = js.undefined
  /**
    * This is the initial prompt by AskForPlace sub-dialog. For example \"What
    * place do you want?\"
    */
  var requestPrompt: js.UndefOr[String] = js.undefined
}

object GoogleActionsV2PlaceValueSpecPlaceDialogSpec {
  @scala.inline
  def apply(permissionContext: String = null, requestPrompt: String = null): GoogleActionsV2PlaceValueSpecPlaceDialogSpec = {
    val __obj = js.Dynamic.literal()
    if (permissionContext != null) __obj.updateDynamic("permissionContext")(permissionContext.asInstanceOf[js.Any])
    if (requestPrompt != null) __obj.updateDynamic("requestPrompt")(requestPrompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2PlaceValueSpecPlaceDialogSpec]
  }
}


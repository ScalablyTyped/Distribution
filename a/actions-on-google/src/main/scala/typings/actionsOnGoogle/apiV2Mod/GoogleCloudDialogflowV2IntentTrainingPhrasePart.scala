package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentTrainingPhrasePart extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var entityType: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var userDefined: js.UndefOr[Boolean] = js.undefined
}

object GoogleCloudDialogflowV2IntentTrainingPhrasePart {
  @scala.inline
  def apply(
    alias: String = null,
    entityType: String = null,
    text: String = null,
    userDefined: js.UndefOr[Boolean] = js.undefined
  ): GoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (entityType != null) __obj.updateDynamic("entityType")(entityType.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(userDefined)) __obj.updateDynamic("userDefined")(userDefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
}


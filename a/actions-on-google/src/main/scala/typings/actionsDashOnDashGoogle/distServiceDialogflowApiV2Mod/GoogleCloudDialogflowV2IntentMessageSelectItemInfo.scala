package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentMessageSelectItemInfo extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var synonyms: js.UndefOr[js.Array[String]] = js.undefined
}

object GoogleCloudDialogflowV2IntentMessageSelectItemInfo {
  @scala.inline
  def apply(key: String = null, synonyms: js.Array[String] = null): GoogleCloudDialogflowV2IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms)
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSelectItemInfo]
  }
}


package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2IntentTrainingPhrase extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]] = js.undefined
  var timesAddedCount: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[GoogleCloudDialogflowV2IntentTrainingPhraseType] = js.undefined
}

object GoogleCloudDialogflowV2IntentTrainingPhrase {
  @scala.inline
  def apply(
    name: String = null,
    parts: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart] = null,
    timesAddedCount: Int | Double = null,
    `type`: GoogleCloudDialogflowV2IntentTrainingPhraseType = null
  ): GoogleCloudDialogflowV2IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (timesAddedCount != null) __obj.updateDynamic("timesAddedCount")(timesAddedCount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrase]
  }
}


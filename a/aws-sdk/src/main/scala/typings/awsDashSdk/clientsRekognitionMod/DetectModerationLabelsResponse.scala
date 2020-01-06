package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectModerationLabelsResponse extends js.Object {
  /**
    * Shows the results of the human in the loop evaluation.
    */
  var HumanLoopActivationOutput: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.HumanLoopActivationOutput] = js.native
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ModerationLabels] = js.native
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.native
}

object DetectModerationLabelsResponse {
  @scala.inline
  def apply(
    HumanLoopActivationOutput: HumanLoopActivationOutput = null,
    ModerationLabels: ModerationLabels = null,
    ModerationModelVersion: String = null
  ): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (HumanLoopActivationOutput != null) __obj.updateDynamic("HumanLoopActivationOutput")(HumanLoopActivationOutput.asInstanceOf[js.Any])
    if (ModerationLabels != null) __obj.updateDynamic("ModerationLabels")(ModerationLabels.asInstanceOf[js.Any])
    if (ModerationModelVersion != null) __obj.updateDynamic("ModerationModelVersion")(ModerationModelVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
}


package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectModerationLabelsResponse extends js.Object {
  /**
    * Array of detected Moderation labels and the time, in milliseconds from the start of the video, they were detected.
    */
  var ModerationLabels: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ModerationLabels] = js.undefined
  /**
    * Version number of the moderation detection model that was used to detect unsafe content.
    */
  var ModerationModelVersion: js.UndefOr[String] = js.undefined
}

object DetectModerationLabelsResponse {
  @scala.inline
  def apply(ModerationLabels: ModerationLabels = null, ModerationModelVersion: String = null): DetectModerationLabelsResponse = {
    val __obj = js.Dynamic.literal()
    if (ModerationLabels != null) __obj.updateDynamic("ModerationLabels")(ModerationLabels)
    if (ModerationModelVersion != null) __obj.updateDynamic("ModerationModelVersion")(ModerationModelVersion)
    __obj.asInstanceOf[DetectModerationLabelsResponse]
  }
}


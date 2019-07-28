package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentModerationDetection extends js.Object {
  /**
    * The moderation label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ModerationLabel] = js.undefined
  /**
    * Time, in milliseconds from the beginning of the video, that the moderation label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object ContentModerationDetection {
  @scala.inline
  def apply(ModerationLabel: ModerationLabel = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    if (ModerationLabel != null) __obj.updateDynamic("ModerationLabel")(ModerationLabel)
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[ContentModerationDetection]
  }
}


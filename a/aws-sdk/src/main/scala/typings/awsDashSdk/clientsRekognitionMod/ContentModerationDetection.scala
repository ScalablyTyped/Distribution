package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentModerationDetection extends js.Object {
  /**
    * The unsafe content label detected by in the stored video.
    */
  var ModerationLabel: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.ModerationLabel] = js.native
  /**
    * Time, in milliseconds from the beginning of the video, that the unsafe content label was detected.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.native
}

object ContentModerationDetection {
  @scala.inline
  def apply(ModerationLabel: ModerationLabel = null, Timestamp: Int | Double = null): ContentModerationDetection = {
    val __obj = js.Dynamic.literal()
    if (ModerationLabel != null) __obj.updateDynamic("ModerationLabel")(ModerationLabel.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentModerationDetection]
  }
}


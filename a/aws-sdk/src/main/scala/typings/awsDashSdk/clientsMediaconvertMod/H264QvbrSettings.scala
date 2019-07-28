package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait H264QvbrSettings extends js.Object {
  /**
    * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value that you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
    */
  var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
  /**
    * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within h264Settings. Specify the target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9.
    */
  var QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
}

object H264QvbrSettings {
  @scala.inline
  def apply(
    MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined,
    QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
  ): H264QvbrSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxAverageBitrate)) __obj.updateDynamic("MaxAverageBitrate")(MaxAverageBitrate)
    if (!js.isUndefined(QvbrQualityLevel)) __obj.updateDynamic("QvbrQualityLevel")(QvbrQualityLevel)
    __obj.asInstanceOf[H264QvbrSettings]
  }
}


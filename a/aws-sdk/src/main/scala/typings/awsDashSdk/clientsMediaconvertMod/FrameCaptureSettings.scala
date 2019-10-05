package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameCaptureSettings extends js.Object {
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.n.jpg where n is the 0-based sequence number of each Capture.
    */
  var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based frame sequence number zero padded to 7 decimal places.
    */
  var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Maximum number of captures (encoded jpg output files).
    */
  var MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined
  /**
    * JPEG Quality - a higher value equals higher quality.
    */
  var Quality: js.UndefOr[__integerMin1Max100] = js.undefined
}

object FrameCaptureSettings {
  @scala.inline
  def apply(
    FramerateDenominator: Int | Double = null,
    FramerateNumerator: Int | Double = null,
    MaxCaptures: Int | Double = null,
    Quality: Int | Double = null
  ): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal()
    if (FramerateDenominator != null) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.asInstanceOf[js.Any])
    if (FramerateNumerator != null) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.asInstanceOf[js.Any])
    if (MaxCaptures != null) __obj.updateDynamic("MaxCaptures")(MaxCaptures.asInstanceOf[js.Any])
    if (Quality != null) __obj.updateDynamic("Quality")(Quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
}


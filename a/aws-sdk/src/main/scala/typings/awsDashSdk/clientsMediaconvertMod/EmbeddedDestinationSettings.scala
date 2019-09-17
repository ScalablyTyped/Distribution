package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedDestinationSettings extends js.Object {
  /**
    * Ignore this setting unless your input captions are SCC format and your output captions are embedded in the video stream. Specify a CC number for each captions channel in this output. If you have two channels, choose CC numbers that aren't in the same field. For example, choose 1 and 3. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  /**
    * Ignore this setting unless your input captions are SCC format and you want both 608 and 708 captions embedded in your output stream. Optionally, specify the 708 service number for each output captions channel. Choose a different number for each channel. To use this setting, also set Force 608 to 708 upconvert (Convert608To708) to Upconvert (UPCONVERT) in your input captions selector settings. If you choose to upconvert but don't specify a 708 service number, MediaConvert uses the number that you specify for CC channel number (destination608ChannelNumber) for the 708 service number. For more information, see https://docs.aws.amazon.com/console/mediaconvert/dual-scc-to-embedded.
    */
  var Destination708ServiceNumber: js.UndefOr[__integerMin1Max6] = js.undefined
}

object EmbeddedDestinationSettings {
  @scala.inline
  def apply(
    Destination608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
    Destination708ServiceNumber: js.UndefOr[__integerMin1Max6] = js.undefined
  ): EmbeddedDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Destination608ChannelNumber)) __obj.updateDynamic("Destination608ChannelNumber")(Destination608ChannelNumber)
    if (!js.isUndefined(Destination708ServiceNumber)) __obj.updateDynamic("Destination708ServiceNumber")(Destination708ServiceNumber)
    __obj.asInstanceOf[EmbeddedDestinationSettings]
  }
}


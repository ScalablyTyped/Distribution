package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedSourceSettings extends js.Object {
  /**
    * When set to UPCONVERT, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  /**
    * Specifies the video track index used for extracting captions. The system only supports one input video track, so this should always be set to '1'.
    */
  var Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined
}

object EmbeddedSourceSettings {
  @scala.inline
  def apply(
    Convert608To708: EmbeddedConvert608To708 = null,
    Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined,
    Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined
  ): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (!js.isUndefined(Source608ChannelNumber)) __obj.updateDynamic("Source608ChannelNumber")(Source608ChannelNumber)
    if (!js.isUndefined(Source608TrackNumber)) __obj.updateDynamic("Source608TrackNumber")(Source608TrackNumber)
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
}


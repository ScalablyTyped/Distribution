package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedSourceSettings extends js.Object {
  /**
    * If upconvert, 608 data is both passed through via the "608 compatibility bytes" fields of the 708 wrapper as well as translated into 708. 708 data present in the source content will be discarded.
    */
  var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined
  /**
    * Set to "auto" to handle streams with intermittent and/or non-aligned SCTE-20 and Embedded captions.
    */
  var Scte20Detection: js.UndefOr[EmbeddedScte20Detection] = js.undefined
  /**
    * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
    */
  var Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  /**
    * This field is unused and deprecated.
    */
  var Source608TrackNumber: js.UndefOr[__integerMin1Max5] = js.undefined
}

object EmbeddedSourceSettings {
  @scala.inline
  def apply(
    Convert608To708: EmbeddedConvert608To708 = null,
    Scte20Detection: EmbeddedScte20Detection = null,
    Source608ChannelNumber: Int | Double = null,
    Source608TrackNumber: Int | Double = null
  ): EmbeddedSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (Scte20Detection != null) __obj.updateDynamic("Scte20Detection")(Scte20Detection.asInstanceOf[js.Any])
    if (Source608ChannelNumber != null) __obj.updateDynamic("Source608ChannelNumber")(Source608ChannelNumber.asInstanceOf[js.Any])
    if (Source608TrackNumber != null) __obj.updateDynamic("Source608TrackNumber")(Source608TrackNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedSourceSettings]
  }
}


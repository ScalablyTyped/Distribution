package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AncillarySourceSettings extends js.Object {
  /**
    * Specify whether this set of input captions appears in your outputs in both 608 and 708 format. If you choose Upconvert (UPCONVERT), MediaConvert includes the captions data in two ways: it passes the 608 data through using the 608 compatibility bytes fields of the 708 wrapper, and it also translates the 608 data into 708.
    */
  var Convert608To708: js.UndefOr[AncillaryConvert608To708] = js.undefined
  /**
    * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for passthrough.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  /**
    * By default, the service terminates any unterminated captions at the end of each input. If you want the caption to continue onto your next input, disable this setting.
    */
  var TerminateCaptions: js.UndefOr[AncillaryTerminateCaptions] = js.undefined
}

object AncillarySourceSettings {
  @scala.inline
  def apply(
    Convert608To708: AncillaryConvert608To708 = null,
    SourceAncillaryChannelNumber: Int | Double = null,
    TerminateCaptions: AncillaryTerminateCaptions = null
  ): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    if (Convert608To708 != null) __obj.updateDynamic("Convert608To708")(Convert608To708.asInstanceOf[js.Any])
    if (SourceAncillaryChannelNumber != null) __obj.updateDynamic("SourceAncillaryChannelNumber")(SourceAncillaryChannelNumber.asInstanceOf[js.Any])
    if (TerminateCaptions != null) __obj.updateDynamic("TerminateCaptions")(TerminateCaptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AncillarySourceSettings]
  }
}


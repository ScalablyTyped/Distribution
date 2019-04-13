package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AncillarySourceSettings extends js.Object {
  /**
    * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for passthrough.
    */
  var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
}

object AncillarySourceSettings {
  @scala.inline
  def apply(SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined): AncillarySourceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SourceAncillaryChannelNumber)) __obj.updateDynamic("SourceAncillaryChannelNumber")(SourceAncillaryChannelNumber)
    __obj.asInstanceOf[AncillarySourceSettings]
  }
}


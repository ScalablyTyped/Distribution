package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mp4Settings extends js.Object {
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined
  /**
    * Inserts a free-space box immediately after the moov box.
    */
  var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined
  /**
    * If set to PROGRESSIVE_DOWNLOAD, the MOOV atom is relocated to the beginning of the archive as required for progressive downloading. Otherwise it is placed normally at the end.
    */
  var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined
  /**
    * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
    */
  var Mp4MajorBrand: js.UndefOr[__string] = js.undefined
}

object Mp4Settings {
  @scala.inline
  def apply(
    CslgAtom: Mp4CslgAtom = null,
    FreeSpaceBox: Mp4FreeSpaceBox = null,
    MoovPlacement: Mp4MoovPlacement = null,
    Mp4MajorBrand: __string = null
  ): Mp4Settings = {
    val __obj = js.Dynamic.literal()
    if (CslgAtom != null) __obj.updateDynamic("CslgAtom")(CslgAtom.asInstanceOf[js.Any])
    if (FreeSpaceBox != null) __obj.updateDynamic("FreeSpaceBox")(FreeSpaceBox.asInstanceOf[js.Any])
    if (MoovPlacement != null) __obj.updateDynamic("MoovPlacement")(MoovPlacement.asInstanceOf[js.Any])
    if (Mp4MajorBrand != null) __obj.updateDynamic("Mp4MajorBrand")(Mp4MajorBrand)
    __obj.asInstanceOf[Mp4Settings]
  }
}


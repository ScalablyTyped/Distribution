package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MovSettings extends js.Object {
  /**
    * When enabled, include 'clap' atom if appropriate for the video output settings.
    */
  var ClapAtom: js.UndefOr[MovClapAtom] = js.undefined
  /**
    * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
    */
  var CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined
  /**
    * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable when the video codec is MPEG2.
    */
  var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined
  /**
    * If set to OMNEON, inserts Omneon-compatible padding
    */
  var PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined
  /**
    * Always keep the default value (SELF_CONTAINED) for this setting.
    */
  var Reference: js.UndefOr[MovReference] = js.undefined
}

object MovSettings {
  @scala.inline
  def apply(
    ClapAtom: MovClapAtom = null,
    CslgAtom: MovCslgAtom = null,
    Mpeg2FourCCControl: MovMpeg2FourCCControl = null,
    PaddingControl: MovPaddingControl = null,
    Reference: MovReference = null
  ): MovSettings = {
    val __obj = js.Dynamic.literal()
    if (ClapAtom != null) __obj.updateDynamic("ClapAtom")(ClapAtom.asInstanceOf[js.Any])
    if (CslgAtom != null) __obj.updateDynamic("CslgAtom")(CslgAtom.asInstanceOf[js.Any])
    if (Mpeg2FourCCControl != null) __obj.updateDynamic("Mpeg2FourCCControl")(Mpeg2FourCCControl.asInstanceOf[js.Any])
    if (PaddingControl != null) __obj.updateDynamic("PaddingControl")(PaddingControl.asInstanceOf[js.Any])
    if (Reference != null) __obj.updateDynamic("Reference")(Reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovSettings]
  }
}


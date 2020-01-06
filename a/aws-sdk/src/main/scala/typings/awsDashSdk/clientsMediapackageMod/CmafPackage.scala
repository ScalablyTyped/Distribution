package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CmafPackage extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.native
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[__listOfHlsManifest] = js.native
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.native
  /**
    * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
    */
  var SegmentPrefix: js.UndefOr[__string] = js.native
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.StreamSelection] = js.native
}

object CmafPackage {
  @scala.inline
  def apply(
    Encryption: CmafEncryption = null,
    HlsManifests: __listOfHlsManifest = null,
    SegmentDurationSeconds: Int | Double = null,
    SegmentPrefix: __string = null,
    StreamSelection: StreamSelection = null
  ): CmafPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption.asInstanceOf[js.Any])
    if (HlsManifests != null) __obj.updateDynamic("HlsManifests")(HlsManifests.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (SegmentPrefix != null) __obj.updateDynamic("SegmentPrefix")(SegmentPrefix.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
}


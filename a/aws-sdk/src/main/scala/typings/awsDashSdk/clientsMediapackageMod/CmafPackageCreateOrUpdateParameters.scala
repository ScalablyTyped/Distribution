package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmafPackageCreateOrUpdateParameters extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.undefined
  /**
    * A list of HLS manifest configurations
    */
  var HlsManifests: js.UndefOr[__listOfHlsManifestCreateOrUpdateParameters] = js.undefined
  /**
    * Duration (in seconds) of each segment. Actual segments will be
  rounded to the nearest multiple of the source segment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * An optional custom string that is prepended to the name of each segment. If not specified, it defaults to the ChannelId.
    */
  var SegmentPrefix: js.UndefOr[__string] = js.undefined
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.StreamSelection] = js.undefined
}

object CmafPackageCreateOrUpdateParameters {
  @scala.inline
  def apply(
    Encryption: CmafEncryption = null,
    HlsManifests: __listOfHlsManifestCreateOrUpdateParameters = null,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
    SegmentPrefix: __string = null,
    StreamSelection: StreamSelection = null
  ): CmafPackageCreateOrUpdateParameters = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (HlsManifests != null) __obj.updateDynamic("HlsManifests")(HlsManifests)
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    if (SegmentPrefix != null) __obj.updateDynamic("SegmentPrefix")(SegmentPrefix)
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[CmafPackageCreateOrUpdateParameters]
  }
}


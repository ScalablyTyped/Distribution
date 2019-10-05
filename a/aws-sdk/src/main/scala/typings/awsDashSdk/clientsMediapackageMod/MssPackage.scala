package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MssPackage extends js.Object {
  var Encryption: js.UndefOr[MssEncryption] = js.undefined
  /**
    * The time window (in seconds) contained in each manifest.
    */
  var ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * The duration (in seconds) of each segment.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  var StreamSelection: js.UndefOr[typings.awsDashSdk.clientsMediapackageMod.StreamSelection] = js.undefined
}

object MssPackage {
  @scala.inline
  def apply(
    Encryption: MssEncryption = null,
    ManifestWindowSeconds: Int | Double = null,
    SegmentDurationSeconds: Int | Double = null,
    StreamSelection: StreamSelection = null
  ): MssPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (ManifestWindowSeconds != null) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds.asInstanceOf[js.Any])
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[MssPackage]
  }
}


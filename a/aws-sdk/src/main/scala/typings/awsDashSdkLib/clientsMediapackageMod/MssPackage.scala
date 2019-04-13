package typings
package awsDashSdkLib.clientsMediapackageMod

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
  var StreamSelection: js.UndefOr[StreamSelection] = js.undefined
}

object MssPackage {
  @scala.inline
  def apply(
    Encryption: MssEncryption = null,
    ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
    SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined,
    StreamSelection: StreamSelection = null
  ): MssPackage = {
    val __obj = js.Dynamic.literal()
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (!js.isUndefined(ManifestWindowSeconds)) __obj.updateDynamic("ManifestWindowSeconds")(ManifestWindowSeconds)
    if (!js.isUndefined(SegmentDurationSeconds)) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds)
    if (StreamSelection != null) __obj.updateDynamic("StreamSelection")(StreamSelection)
    __obj.asInstanceOf[MssPackage]
  }
}


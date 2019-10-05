package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CmafPackage extends js.Object {
  var Encryption: js.UndefOr[CmafEncryption] = js.undefined
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: __listOfHlsManifest
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
}

object CmafPackage {
  @scala.inline
  def apply(
    HlsManifests: __listOfHlsManifest,
    Encryption: CmafEncryption = null,
    SegmentDurationSeconds: Int | Double = null
  ): CmafPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmafPackage]
  }
}


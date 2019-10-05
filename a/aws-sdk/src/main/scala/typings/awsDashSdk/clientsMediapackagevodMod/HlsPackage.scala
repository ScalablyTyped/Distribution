package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsPackage extends js.Object {
  var Encryption: js.UndefOr[HlsEncryption] = js.undefined
  /**
    * A list of HLS manifest configurations.
    */
  var HlsManifests: __listOfHlsManifest
  /**
    * Duration (in seconds) of each fragment. Actual fragments will be
  rounded to the nearest multiple of the source fragment duration.
    */
  var SegmentDurationSeconds: js.UndefOr[__integer] = js.undefined
  /**
    * When enabled, audio streams will be placed in rendition groups in the output.
    */
  var UseAudioRenditionGroup: js.UndefOr[__boolean] = js.undefined
}

object HlsPackage {
  @scala.inline
  def apply(
    HlsManifests: __listOfHlsManifest,
    Encryption: HlsEncryption = null,
    SegmentDurationSeconds: Int | Double = null,
    UseAudioRenditionGroup: js.UndefOr[Boolean] = js.undefined
  ): HlsPackage = {
    val __obj = js.Dynamic.literal(HlsManifests = HlsManifests)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    if (SegmentDurationSeconds != null) __obj.updateDynamic("SegmentDurationSeconds")(SegmentDurationSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(UseAudioRenditionGroup)) __obj.updateDynamic("UseAudioRenditionGroup")(UseAudioRenditionGroup)
    __obj.asInstanceOf[HlsPackage]
  }
}


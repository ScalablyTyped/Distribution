package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HlsOutputSettings extends js.Object {
  /**
    * Only applicable when this output is referencing an H.265 video description.
  Specifies whether MP4 segments should be packaged as HEV1 or HVC1.
    */
  var H265PackagingType: js.UndefOr[HlsH265PackagingType] = js.native
  /**
    * Settings regarding the underlying stream. These settings are different for audio-only outputs.
    */
  var HlsSettings: typings.awsDashSdk.clientsMedialiveMod.HlsSettings = js.native
  /**
    * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
    */
  var NameModifier: js.UndefOr[__stringMin1] = js.native
  /**
    * String concatenated to end of segment filenames.
    */
  var SegmentModifier: js.UndefOr[__string] = js.native
}

object HlsOutputSettings {
  @scala.inline
  def apply(
    HlsSettings: HlsSettings,
    H265PackagingType: HlsH265PackagingType = null,
    NameModifier: __stringMin1 = null,
    SegmentModifier: __string = null
  ): HlsOutputSettings = {
    val __obj = js.Dynamic.literal(HlsSettings = HlsSettings.asInstanceOf[js.Any])
    if (H265PackagingType != null) __obj.updateDynamic("H265PackagingType")(H265PackagingType.asInstanceOf[js.Any])
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier.asInstanceOf[js.Any])
    if (SegmentModifier != null) __obj.updateDynamic("SegmentModifier")(SegmentModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[HlsOutputSettings]
  }
}


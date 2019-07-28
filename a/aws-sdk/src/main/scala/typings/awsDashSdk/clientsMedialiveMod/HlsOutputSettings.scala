package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HlsOutputSettings extends js.Object {
  /**
    * Settings regarding the underlying stream. These settings are different for audio-only outputs.
    */
  var HlsSettings: typings.awsDashSdk.clientsMedialiveMod.HlsSettings
  /**
    * String concatenated to the end of the destination filename. Accepts \"Format Identifiers\":#formatIdentifierParameters.
    */
  var NameModifier: js.UndefOr[__stringMin1] = js.undefined
  /**
    * String concatenated to end of segment filenames.
    */
  var SegmentModifier: js.UndefOr[__string] = js.undefined
}

object HlsOutputSettings {
  @scala.inline
  def apply(HlsSettings: HlsSettings, NameModifier: __stringMin1 = null, SegmentModifier: __string = null): HlsOutputSettings = {
    val __obj = js.Dynamic.literal(HlsSettings = HlsSettings)
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier)
    if (SegmentModifier != null) __obj.updateDynamic("SegmentModifier")(SegmentModifier)
    __obj.asInstanceOf[HlsOutputSettings]
  }
}


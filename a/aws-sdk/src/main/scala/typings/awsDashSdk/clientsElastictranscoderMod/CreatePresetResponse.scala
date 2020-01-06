package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset that is created.
    */
  var Preset: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Preset] = js.native
  /**
    * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created the preset because the settings might produce acceptable output.
    */
  var Warning: js.UndefOr[String] = js.native
}

object CreatePresetResponse {
  @scala.inline
  def apply(Preset: Preset = null, Warning: String = null): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset.asInstanceOf[js.Any])
    if (Warning != null) __obj.updateDynamic("Warning")(Warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresetResponse]
  }
}


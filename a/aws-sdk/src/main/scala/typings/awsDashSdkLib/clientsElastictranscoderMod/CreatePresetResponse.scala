package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset that is created.
    */
  var Preset: js.UndefOr[Preset] = js.undefined
  /**
    * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created the preset because the settings might produce acceptable output.
    */
  var Warning: js.UndefOr[String] = js.undefined
}

object CreatePresetResponse {
  @scala.inline
  def apply(Preset: Preset = null, Warning: String = null): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset)
    if (Warning != null) __obj.updateDynamic("Warning")(Warning)
    __obj.asInstanceOf[CreatePresetResponse]
  }
}


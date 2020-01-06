package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadPresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Preset] = js.native
}

object ReadPresetResponse {
  @scala.inline
  def apply(Preset: Preset = null): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadPresetResponse]
  }
}


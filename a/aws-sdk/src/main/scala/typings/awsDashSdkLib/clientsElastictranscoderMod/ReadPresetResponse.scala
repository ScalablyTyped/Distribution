package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadPresetResponse extends js.Object {
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[Preset] = js.undefined
}

object ReadPresetResponse {
  @scala.inline
  def apply(Preset: Preset = null): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    if (Preset != null) __obj.updateDynamic("Preset")(Preset)
    __obj.asInstanceOf[ReadPresetResponse]
  }
}


package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPresetsResponse extends js.Object {
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.native
  /**
    * An array of Preset objects.
    */
  var Presets: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Presets] = js.native
}

object ListPresetsResponse {
  @scala.inline
  def apply(NextPageToken: Id = null, Presets: Presets = null): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Presets != null) __obj.updateDynamic("Presets")(Presets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPresetsResponse]
  }
}


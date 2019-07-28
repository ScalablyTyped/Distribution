package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPresetsResponse extends js.Object {
  /**
    * Use this string to request the next batch of presets.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * List of presets
    */
  var Presets: js.UndefOr[__listOfPreset] = js.undefined
}

object ListPresetsResponse {
  @scala.inline
  def apply(NextToken: __string = null, Presets: __listOfPreset = null): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Presets != null) __obj.updateDynamic("Presets")(Presets)
    __obj.asInstanceOf[ListPresetsResponse]
  }
}


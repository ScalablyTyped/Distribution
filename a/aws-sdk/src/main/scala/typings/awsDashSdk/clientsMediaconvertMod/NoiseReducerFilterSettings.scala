package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoiseReducerFilterSettings extends js.Object {
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[__integerMin0Max3] = js.undefined
}

object NoiseReducerFilterSettings {
  @scala.inline
  def apply(Strength: js.UndefOr[__integerMin0Max3] = js.undefined): NoiseReducerFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Strength)) __obj.updateDynamic("Strength")(Strength)
    __obj.asInstanceOf[NoiseReducerFilterSettings]
  }
}


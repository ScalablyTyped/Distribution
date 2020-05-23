package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingConfig extends js.Object {
  /**
    * Changes the number of icons.
    *
    * @default: 5
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * A variable used in the template to specify the state for unselected icons.
    *
    * @default: null
    */
  var stateOff: js.UndefOr[String] = js.undefined
  /**
    * A variable used in the template to specify the state for selected icons.
    *
    * @default: null
    */
  var stateOn: js.UndefOr[String] = js.undefined
  /**
    * An array of strings defining titles for all icons.
    *
    * @default: ["one", "two", "three", "four", "five"]
    */
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object IRatingConfig {
  @scala.inline
  def apply(
    max: js.UndefOr[Double] = js.undefined,
    stateOff: String = null,
    stateOn: String = null,
    titles: js.Array[String] = null
  ): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (stateOff != null) __obj.updateDynamic("stateOff")(stateOff.asInstanceOf[js.Any])
    if (stateOn != null) __obj.updateDynamic("stateOn")(stateOn.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRatingConfig]
  }
}


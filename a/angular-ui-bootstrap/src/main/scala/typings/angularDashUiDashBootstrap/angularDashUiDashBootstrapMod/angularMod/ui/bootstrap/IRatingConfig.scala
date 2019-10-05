package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

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
    max: Int | Double = null,
    stateOff: String = null,
    stateOn: String = null,
    titles: js.Array[String] = null
  ): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (stateOff != null) __obj.updateDynamic("stateOff")(stateOff)
    if (stateOn != null) __obj.updateDynamic("stateOn")(stateOn)
    if (titles != null) __obj.updateDynamic("titles")(titles)
    __obj.asInstanceOf[IRatingConfig]
  }
}


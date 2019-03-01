package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRatingConfig extends js.Object {
  /**
    * Changes the number of icons.
    *
    * @default: 5
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * A variable used in the template to specify the state for unselected icons.
    *
    * @default: null
    */
  var stateOff: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A variable used in the template to specify the state for selected icons.
    *
    * @default: null
    */
  var stateOn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of strings defining titles for all icons.
    *
    * @default: ["one", "two", "three", "four", "five"]
    */
  var titles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IRatingConfig {
  @scala.inline
  def apply(
    max: scala.Int | scala.Double = null,
    stateOff: java.lang.String = null,
    stateOn: java.lang.String = null,
    titles: js.Array[java.lang.String] = null
  ): IRatingConfig = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (stateOff != null) __obj.updateDynamic("stateOff")(stateOff)
    if (stateOn != null) __obj.updateDynamic("stateOn")(stateOn)
    if (titles != null) __obj.updateDynamic("titles")(titles)
    __obj.asInstanceOf[IRatingConfig]
  }
}


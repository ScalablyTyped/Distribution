package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scale extends js.Object {
  /**
    * The unit of measure for the scale value.
    */
  var unit: js.UndefOr[ScaleUnit] = js.undefined
  /**
    * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object Scale {
  @scala.inline
  def apply(unit: ScaleUnit = null, value: js.UndefOr[Double] = js.undefined): Scale = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Scale]
  }
}


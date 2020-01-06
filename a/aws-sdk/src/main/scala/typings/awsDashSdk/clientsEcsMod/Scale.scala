package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale extends js.Object {
  /**
    * The unit of measure for the scale value.
    */
  var unit: js.UndefOr[ScaleUnit] = js.native
  /**
    * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
    */
  var value: js.UndefOr[Double] = js.native
}

object Scale {
  @scala.inline
  def apply(unit: ScaleUnit = null, value: Int | scala.Double = null): Scale = {
    val __obj = js.Dynamic.literal()
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}


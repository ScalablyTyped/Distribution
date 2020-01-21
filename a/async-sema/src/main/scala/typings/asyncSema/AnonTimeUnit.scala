package typings.asyncSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTimeUnit extends js.Object {
  var timeUnit: js.UndefOr[Double] = js.undefined
  var uniformDistribution: js.UndefOr[Boolean] = js.undefined
}

object AnonTimeUnit {
  @scala.inline
  def apply(timeUnit: Int | Double = null, uniformDistribution: js.UndefOr[Boolean] = js.undefined): AnonTimeUnit = {
    val __obj = js.Dynamic.literal()
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(uniformDistribution)) __obj.updateDynamic("uniformDistribution")(uniformDistribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTimeUnit]
  }
}


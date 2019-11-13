package typings.asyncDashSema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeUnit extends js.Object {
  var timeUnit: js.UndefOr[Double] = js.undefined
  var uniformDistribution: js.UndefOr[Boolean] = js.undefined
}

object Anon_TimeUnit {
  @scala.inline
  def apply(timeUnit: Int | Double = null, uniformDistribution: js.UndefOr[Boolean] = js.undefined): Anon_TimeUnit = {
    val __obj = js.Dynamic.literal()
    if (timeUnit != null) __obj.updateDynamic("timeUnit")(timeUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(uniformDistribution)) __obj.updateDynamic("uniformDistribution")(uniformDistribution)
    __obj.asInstanceOf[Anon_TimeUnit]
  }
}


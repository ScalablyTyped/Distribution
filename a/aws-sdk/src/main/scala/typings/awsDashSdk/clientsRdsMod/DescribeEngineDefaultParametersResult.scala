package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEngineDefaultParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typings.awsDashSdk.clientsRdsMod.EngineDefaults] = js.undefined
}

object DescribeEngineDefaultParametersResult {
  @scala.inline
  def apply(EngineDefaults: EngineDefaults = null): DescribeEngineDefaultParametersResult = {
    val __obj = js.Dynamic.literal()
    if (EngineDefaults != null) __obj.updateDynamic("EngineDefaults")(EngineDefaults)
    __obj.asInstanceOf[DescribeEngineDefaultParametersResult]
  }
}


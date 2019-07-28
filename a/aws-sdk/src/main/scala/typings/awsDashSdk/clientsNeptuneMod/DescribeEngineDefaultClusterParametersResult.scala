package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEngineDefaultClusterParametersResult extends js.Object {
  var EngineDefaults: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.EngineDefaults] = js.undefined
}

object DescribeEngineDefaultClusterParametersResult {
  @scala.inline
  def apply(EngineDefaults: EngineDefaults = null): DescribeEngineDefaultClusterParametersResult = {
    val __obj = js.Dynamic.literal()
    if (EngineDefaults != null) __obj.updateDynamic("EngineDefaults")(EngineDefaults)
    __obj.asInstanceOf[DescribeEngineDefaultClusterParametersResult]
  }
}


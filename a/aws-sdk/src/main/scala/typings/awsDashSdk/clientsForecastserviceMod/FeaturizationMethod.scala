package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturizationMethod extends js.Object {
  /**
    * The name of the method. In this release, "filling" is the only supported method.
    */
  var FeaturizationMethodName: typings.awsDashSdk.clientsForecastserviceMod.FeaturizationMethodName
  /**
    * The method parameters (key-value pairs). Specify these to override the default values. The following list shows the parameters and their valid values. Bold signifies the default value.    aggregation: sum, avg, first, min, max     frontfill: none     middlefill: zero, nan (not a number)    backfill: zero, nan   
    */
  var FeaturizationMethodParameters: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.FeaturizationMethodParameters] = js.undefined
}

object FeaturizationMethod {
  @scala.inline
  def apply(
    FeaturizationMethodName: FeaturizationMethodName,
    FeaturizationMethodParameters: FeaturizationMethodParameters = null
  ): FeaturizationMethod = {
    val __obj = js.Dynamic.literal(FeaturizationMethodName = FeaturizationMethodName.asInstanceOf[js.Any])
    if (FeaturizationMethodParameters != null) __obj.updateDynamic("FeaturizationMethodParameters")(FeaturizationMethodParameters)
    __obj.asInstanceOf[FeaturizationMethod]
  }
}


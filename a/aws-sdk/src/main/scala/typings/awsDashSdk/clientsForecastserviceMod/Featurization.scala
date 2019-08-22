package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Featurization extends js.Object {
  /**
    * The name of the schema attribute specifying the data field to be featurized. In this release, only the target field of the TARGET_TIME_SERIES dataset type is supported. For example, for the RETAIL domain, the target is demand, and for the CUSTOM domain, the target is target_value.
    */
  var AttributeName: Name
  /**
    * An array FeaturizationMethod objects that specifies the feature transformation methods. For this release, the number of methods is limited to one.
    */
  var FeaturizationPipeline: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.FeaturizationPipeline] = js.undefined
}

object Featurization {
  @scala.inline
  def apply(AttributeName: Name, FeaturizationPipeline: FeaturizationPipeline = null): Featurization = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName)
    if (FeaturizationPipeline != null) __obj.updateDynamic("FeaturizationPipeline")(FeaturizationPipeline)
    __obj.asInstanceOf[Featurization]
  }
}


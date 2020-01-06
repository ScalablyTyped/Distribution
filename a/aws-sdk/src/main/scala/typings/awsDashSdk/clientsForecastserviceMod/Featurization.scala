package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Featurization extends js.Object {
  /**
    * The name of the schema attribute that specifies the data field to be featurized. Only the target field of the TARGET_TIME_SERIES dataset type is supported. For example, for the RETAIL domain, the target is demand, and for the CUSTOM domain, the target is target_value.
    */
  var AttributeName: Name = js.native
  /**
    * An array of one FeaturizationMethod object that specifies the feature transformation method.
    */
  var FeaturizationPipeline: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.FeaturizationPipeline] = js.native
}

object Featurization {
  @scala.inline
  def apply(AttributeName: Name, FeaturizationPipeline: FeaturizationPipeline = null): Featurization = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any])
    if (FeaturizationPipeline != null) __obj.updateDynamic("FeaturizationPipeline")(FeaturizationPipeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Featurization]
  }
}


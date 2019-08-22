package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeaturizationConfig extends js.Object {
  /**
    * An array of featurization (transformation) information for the fields of a dataset. In this release, only a single featurization is supported.
    */
  var Featurizations: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.Featurizations] = js.undefined
  /**
    * An array of dimension (field) names that specify how to group the generated forecast. For example, suppose that you are generating a forecast for item sales across all of your stores, and your dataset contains a store_id field. If you want the sales forecast for each item by store, you would specify store_id as the dimension.
    */
  var ForecastDimensions: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.ForecastDimensions] = js.undefined
  /**
    * The frequency of predictions in a forecast. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "Y" indicates every year and "5min" indicates every five minutes.
    */
  var ForecastFrequency: Frequency
}

object FeaturizationConfig {
  @scala.inline
  def apply(
    ForecastFrequency: Frequency,
    Featurizations: Featurizations = null,
    ForecastDimensions: ForecastDimensions = null
  ): FeaturizationConfig = {
    val __obj = js.Dynamic.literal(ForecastFrequency = ForecastFrequency)
    if (Featurizations != null) __obj.updateDynamic("Featurizations")(Featurizations)
    if (ForecastDimensions != null) __obj.updateDynamic("ForecastDimensions")(ForecastDimensions)
    __obj.asInstanceOf[FeaturizationConfig]
  }
}


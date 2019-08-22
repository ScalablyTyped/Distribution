package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputDataConfig extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: Arn
  /**
    * An array of supplementary features. For this release, the only supported feature is a holiday calendar.
    */
  var SupplementaryFeatures: js.UndefOr[typings.awsDashSdk.clientsForecastserviceMod.SupplementaryFeatures] = js.undefined
}

object InputDataConfig {
  @scala.inline
  def apply(DatasetGroupArn: Arn, SupplementaryFeatures: SupplementaryFeatures = null): InputDataConfig = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn)
    if (SupplementaryFeatures != null) __obj.updateDynamic("SupplementaryFeatures")(SupplementaryFeatures)
    __obj.asInstanceOf[InputDataConfig]
  }
}


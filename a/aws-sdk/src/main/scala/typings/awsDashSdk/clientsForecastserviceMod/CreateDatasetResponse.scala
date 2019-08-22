package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
}

object CreateDatasetResponse {
  @scala.inline
  def apply(DatasetArn: Arn = null): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn)
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}


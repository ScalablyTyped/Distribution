package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetResponse {
  @scala.inline
  def apply(DatasetArn: Arn = null): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (DatasetArn != null) __obj.updateDynamic("DatasetArn")(DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}


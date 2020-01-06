package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var DatasetArn: Arn = js.native
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(DatasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}


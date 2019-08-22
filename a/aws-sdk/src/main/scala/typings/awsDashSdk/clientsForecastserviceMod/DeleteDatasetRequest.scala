package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var DatasetArn: Arn
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(DatasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn)
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}


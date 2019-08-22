package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to delete.
    */
  var DatasetGroupArn: Arn
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn)
  
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
}


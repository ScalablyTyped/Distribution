package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDatasetGroupRequest extends js.Object {
  /**
    * An array of Amazon Resource Names (ARNs) of the datasets to add to the dataset group.
    */
  var DatasetArns: ArnList
  /**
    * The ARN of the dataset group.
    */
  var DatasetGroupArn: Arn
}

object UpdateDatasetGroupRequest {
  @scala.inline
  def apply(DatasetArns: ArnList, DatasetGroupArn: Arn): UpdateDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetArns = DatasetArns, DatasetGroupArn = DatasetGroupArn)
  
    __obj.asInstanceOf[UpdateDatasetGroupRequest]
  }
}


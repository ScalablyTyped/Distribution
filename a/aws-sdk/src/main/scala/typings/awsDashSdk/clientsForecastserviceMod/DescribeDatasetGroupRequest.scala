package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group.
    */
  var DatasetGroupArn: Arn
}

object DescribeDatasetGroupRequest {
  @scala.inline
  def apply(DatasetGroupArn: Arn): DescribeDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(DatasetGroupArn = DatasetGroupArn)
  
    __obj.asInstanceOf[DescribeDatasetGroupRequest]
  }
}


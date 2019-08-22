package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: Arn
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(DatasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn)
  
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}


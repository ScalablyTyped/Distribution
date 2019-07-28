package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetGroupRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to describe.
    */
  var datasetGroupArn: Arn
}

object DescribeDatasetGroupRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn): DescribeDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn)
  
    __obj.asInstanceOf[DescribeDatasetGroupRequest]
  }
}


package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to describe.
    */
  var datasetArn: Arn
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(datasetArn: Arn): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn)
  
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}


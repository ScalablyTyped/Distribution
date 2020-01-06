package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to describe.
    */
  var datasetImportJobArn: Arn = js.native
}

object DescribeDatasetImportJobRequest {
  @scala.inline
  def apply(datasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(datasetImportJobArn = datasetImportJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
}


package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to describe.
    */
  var datasetImportJobArn: Arn
}

object DescribeDatasetImportJobRequest {
  @scala.inline
  def apply(datasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(datasetImportJobArn = datasetImportJobArn)
  
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
}


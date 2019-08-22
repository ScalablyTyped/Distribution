package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var DatasetImportJobArn: Arn
}

object DescribeDatasetImportJobRequest {
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DescribeDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn)
  
    __obj.asInstanceOf[DescribeDatasetImportJobRequest]
  }
}


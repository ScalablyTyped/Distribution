package typings.awsDashSdk.clientsForecastserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetImportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset import job to delete.
    */
  var DatasetImportJobArn: Arn
}

object DeleteDatasetImportJobRequest {
  @scala.inline
  def apply(DatasetImportJobArn: Arn): DeleteDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DatasetImportJobArn = DatasetImportJobArn)
  
    __obj.asInstanceOf[DeleteDatasetImportJobRequest]
  }
}


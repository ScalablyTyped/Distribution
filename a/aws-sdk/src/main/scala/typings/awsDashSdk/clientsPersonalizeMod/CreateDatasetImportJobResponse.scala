package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetImportJobResponse extends js.Object {
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.native
}

object CreateDatasetImportJobResponse {
  @scala.inline
  def apply(datasetImportJobArn: Arn = null): CreateDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetImportJobArn != null) __obj.updateDynamic("datasetImportJobArn")(datasetImportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobResponse]
  }
}


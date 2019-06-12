package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetImportJobResponse extends js.Object {
  /**
    * Information about the dataset import job, including the status. The status is one of the following values:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var datasetImportJob: js.UndefOr[DatasetImportJob] = js.undefined
}

object DescribeDatasetImportJobResponse {
  @scala.inline
  def apply(datasetImportJob: DatasetImportJob = null): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetImportJob != null) __obj.updateDynamic("datasetImportJob")(datasetImportJob)
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
}


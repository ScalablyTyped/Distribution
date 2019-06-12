package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetImportJobSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the dataset import job was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.undefined
  /**
    * If a dataset import job fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The name of the dataset import job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  /**
    * The date and time (in Unix time) that the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object DatasetImportJobSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    datasetImportJobArn: Arn = null,
    failureReason: FailureReason = null,
    jobName: Name = null,
    lastUpdatedDateTime: _Date = null,
    status: Status = null
  ): DatasetImportJobSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (datasetImportJobArn != null) __obj.updateDynamic("datasetImportJobArn")(datasetImportJobArn)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (jobName != null) __obj.updateDynamic("jobName")(jobName)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DatasetImportJobSummary]
  }
}


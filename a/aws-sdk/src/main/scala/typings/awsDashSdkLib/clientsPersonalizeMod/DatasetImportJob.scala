package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetImportJob extends js.Object {
  /**
    * The creation date and time (in Unix time) of the dataset import job.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The Amazon S3 bucket that contains the training data to import.
    */
  var dataSource: js.UndefOr[DataSource] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the dataset that receives the imported data.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
  /**
    * The ARN of the dataset import job.
    */
  var datasetImportJobArn: js.UndefOr[Arn] = js.undefined
  /**
    * If a dataset import job fails, provides the reason why.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The name of the import job.
    */
  var jobName: js.UndefOr[Name] = js.undefined
  /**
    * The date and time (in Unix time) the dataset was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that has permissions to read from the Amazon S3 data source.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the dataset import job. A dataset import job can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object DatasetImportJob {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    dataSource: DataSource = null,
    datasetArn: Arn = null,
    datasetImportJobArn: Arn = null,
    failureReason: FailureReason = null,
    jobName: Name = null,
    lastUpdatedDateTime: _Date = null,
    roleArn: Arn = null,
    status: Status = null
  ): DatasetImportJob = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    if (datasetImportJobArn != null) __obj.updateDynamic("datasetImportJobArn")(datasetImportJobArn)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (jobName != null) __obj.updateDynamic("jobName")(jobName)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[DatasetImportJob]
  }
}


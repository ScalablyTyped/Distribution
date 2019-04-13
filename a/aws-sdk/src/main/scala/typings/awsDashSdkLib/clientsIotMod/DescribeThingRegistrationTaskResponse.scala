package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingRegistrationTaskResponse extends js.Object {
  /**
    * The task creation date.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The number of things that failed to be provisioned.
    */
  var failureCount: js.UndefOr[Count] = js.undefined
  /**
    * The S3 bucket that contains the input file.
    */
  var inputFileBucket: js.UndefOr[RegistryS3BucketName] = js.undefined
  /**
    * The input file key.
    */
  var inputFileKey: js.UndefOr[RegistryS3KeyName] = js.undefined
  /**
    * The date when the task was last modified.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
  /**
    * The message.
    */
  var message: js.UndefOr[ErrorMessage] = js.undefined
  /**
    * The progress of the bulk provisioning task expressed as a percentage.
    */
  var percentageProgress: js.UndefOr[Percentage] = js.undefined
  /**
    * The role ARN that grants access to the input file bucket.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  /**
    * The status of the bulk thing provisioning task.
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The number of things successfully provisioned.
    */
  var successCount: js.UndefOr[Count] = js.undefined
  /**
    * The task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
  /**
    * The task's template.
    */
  var templateBody: js.UndefOr[TemplateBody] = js.undefined
}

object DescribeThingRegistrationTaskResponse {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    failureCount: js.UndefOr[Count] = js.undefined,
    inputFileBucket: RegistryS3BucketName = null,
    inputFileKey: RegistryS3KeyName = null,
    lastModifiedDate: LastModifiedDate = null,
    message: ErrorMessage = null,
    percentageProgress: js.UndefOr[Percentage] = js.undefined,
    roleArn: RoleArn = null,
    status: Status = null,
    successCount: js.UndefOr[Count] = js.undefined,
    taskId: TaskId = null,
    templateBody: TemplateBody = null
  ): DescribeThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (!js.isUndefined(failureCount)) __obj.updateDynamic("failureCount")(failureCount)
    if (inputFileBucket != null) __obj.updateDynamic("inputFileBucket")(inputFileBucket)
    if (inputFileKey != null) __obj.updateDynamic("inputFileKey")(inputFileKey)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(percentageProgress)) __obj.updateDynamic("percentageProgress")(percentageProgress)
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (!js.isUndefined(successCount)) __obj.updateDynamic("successCount")(successCount)
    if (taskId != null) __obj.updateDynamic("taskId")(taskId)
    if (templateBody != null) __obj.updateDynamic("templateBody")(templateBody)
    __obj.asInstanceOf[DescribeThingRegistrationTaskResponse]
  }
}


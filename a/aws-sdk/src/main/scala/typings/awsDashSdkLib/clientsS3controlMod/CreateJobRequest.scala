package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateJobRequest extends js.Object {
  /**
    * 
    */
  var AccountId: awsDashSdkLib.clientsS3controlMod.AccountId
  /**
    * An idempotency token to ensure that you don't accidentally submit the same request twice. You can use any string up to the maximum length.
    */
  var ClientRequestToken: NonEmptyMaxLength64String
  /**
    * Indicates whether confirmation is required before Amazon S3 runs the job. Confirmation is only required for jobs created through the Amazon S3 console.
    */
  var ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined
  /**
    * A description for this job. You can use any string within the permitted length. Descriptions don't need to be unique and can be used for multiple jobs.
    */
  var Description: js.UndefOr[NonEmptyMaxLength256String] = js.undefined
  /**
    * Configuration parameters for the manifest.
    */
  var Manifest: JobManifest
  /**
    * The operation that you want this job to perform on each object listed in the manifest. For more information about the available operations, see Available Operations in the Amazon Simple Storage Service Developer Guide.
    */
  var Operation: JobOperation
  /**
    * The numerical priority for this job. Higher numbers indicate higher priority.
    */
  var Priority: JobPriority
  /**
    * Configuration parameters for the optional job-completion report.
    */
  var Report: JobReport
  /**
    * The Amazon Resource Name (ARN) for the Identity and Access Management (IAM) Role that batch operations will use to execute this job's operation on each object in the manifest.
    */
  var RoleArn: IAMRoleArn
}

object CreateJobRequest {
  @scala.inline
  def apply(
    AccountId: AccountId,
    ClientRequestToken: NonEmptyMaxLength64String,
    Manifest: JobManifest,
    Operation: JobOperation,
    Priority: JobPriority,
    Report: JobReport,
    RoleArn: IAMRoleArn,
    ConfirmationRequired: js.UndefOr[ConfirmationRequired] = js.undefined,
    Description: NonEmptyMaxLength256String = null
  ): CreateJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, ClientRequestToken = ClientRequestToken, Manifest = Manifest, Operation = Operation, Priority = Priority, Report = Report, RoleArn = RoleArn)
    if (!js.isUndefined(ConfirmationRequired)) __obj.updateDynamic("ConfirmationRequired")(ConfirmationRequired)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateJobRequest]
  }
}


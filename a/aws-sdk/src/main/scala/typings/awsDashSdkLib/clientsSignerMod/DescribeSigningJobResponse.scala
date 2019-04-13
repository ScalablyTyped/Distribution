package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSigningJobResponse extends js.Object {
  /**
    * Date and time that the signing job was completed.
    */
  var completedAt: js.UndefOr[CompletedAt] = js.undefined
  /**
    * Date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The ID of the signing job on output.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * A list of any overrides that were applied to the signing operation.
    */
  var overrides: js.UndefOr[SigningPlatformOverrides] = js.undefined
  /**
    * The microcontroller platform to which your signed code image will be distributed.
    */
  var platformId: js.UndefOr[PlatformId] = js.undefined
  /**
    * The name of the profile that initiated the signing operation.
    */
  var profileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The IAM principal that requested the signing job.
    */
  var requestedBy: js.UndefOr[RequestedBy] = js.undefined
  /**
    * Name of the S3 bucket where the signed code image is saved by AWS Signer.
    */
  var signedObject: js.UndefOr[SignedObject] = js.undefined
  /**
    * Amazon Resource Name (ARN) of your code signing certificate.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  /**
    * Map of user-assigned key-value pairs used during signing. These values contain any information that you specified for use in your signing job. 
    */
  var signingParameters: js.UndefOr[SigningParameters] = js.undefined
  /**
    * The object that contains the name of your S3 bucket or your raw code.
    */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * Status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
  /**
    * String value that contains the status reason.
    */
  var statusReason: js.UndefOr[StatusReason] = js.undefined
}

object DescribeSigningJobResponse {
  @scala.inline
  def apply(
    completedAt: CompletedAt = null,
    createdAt: CreatedAt = null,
    jobId: JobId = null,
    overrides: SigningPlatformOverrides = null,
    platformId: PlatformId = null,
    profileName: ProfileName = null,
    requestedBy: RequestedBy = null,
    signedObject: SignedObject = null,
    signingMaterial: SigningMaterial = null,
    signingParameters: SigningParameters = null,
    source: Source = null,
    status: SigningStatus = null,
    statusReason: StatusReason = null
  ): DescribeSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    if (completedAt != null) __obj.updateDynamic("completedAt")(completedAt)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (platformId != null) __obj.updateDynamic("platformId")(platformId)
    if (profileName != null) __obj.updateDynamic("profileName")(profileName)
    if (requestedBy != null) __obj.updateDynamic("requestedBy")(requestedBy)
    if (signedObject != null) __obj.updateDynamic("signedObject")(signedObject)
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial)
    if (signingParameters != null) __obj.updateDynamic("signingParameters")(signingParameters)
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    __obj.asInstanceOf[DescribeSigningJobResponse]
  }
}


package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningJob extends js.Object {
  /**
    * The date and time that the signing job was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  /**
    * The ID of the signing job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    * A SignedObject structure that contains information about a signing job's signed code image.
    */
  var signedObject: js.UndefOr[SignedObject] = js.undefined
  /**
    * A SigningMaterial object that contains the Amazon Resource Name (ARN) of the certificate used for the signing job.
    */
  var signingMaterial: js.UndefOr[SigningMaterial] = js.undefined
  /**
    * A Source that contains information about a signing job's code image source.
    */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * The status of the signing job.
    */
  var status: js.UndefOr[SigningStatus] = js.undefined
}

object SigningJob {
  @scala.inline
  def apply(
    createdAt: CreatedAt = null,
    jobId: JobId = null,
    signedObject: SignedObject = null,
    signingMaterial: SigningMaterial = null,
    source: Source = null,
    status: SigningStatus = null
  ): SigningJob = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (signedObject != null) __obj.updateDynamic("signedObject")(signedObject)
    if (signingMaterial != null) __obj.updateDynamic("signingMaterial")(signingMaterial)
    if (source != null) __obj.updateDynamic("source")(source)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningJob]
  }
}


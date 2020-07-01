package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentResult extends js.Object {
  /**
    *  When the fileMap argument is provided in the request, fileUploadUrls will contain a map of file names to upload URLs. 
    */
  var fileUploadUrls: FileUploadUrls = js.native
  /**
    *  The job ID for this deployment. will supply to start deployment api. 
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    *  When the fileMap argument is not provided in the request, this zipUploadUrl is returned. 
    */
  var zipUploadUrl: UploadUrl = js.native
}

object CreateDeploymentResult {
  @scala.inline
  def apply(fileUploadUrls: FileUploadUrls, zipUploadUrl: UploadUrl, jobId: JobId = null): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal(fileUploadUrls = fileUploadUrls.asInstanceOf[js.Any], zipUploadUrl = zipUploadUrl.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResult]
  }
}


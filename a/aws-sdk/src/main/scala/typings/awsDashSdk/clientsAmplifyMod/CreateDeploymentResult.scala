package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeploymentResult extends js.Object {
  /**
    *  When the fileMap argument is provided in the request, the fileUploadUrls will contain a map of file names to upload url. 
    */
  var fileUploadUrls: FileUploadUrls
  /**
    *  The jobId for this deployment, will supply to start deployment api. 
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    *  When the fileMap argument is NOT provided. This zipUploadUrl will be returned. 
    */
  var zipUploadUrl: UploadUrl
}

object CreateDeploymentResult {
  @scala.inline
  def apply(fileUploadUrls: FileUploadUrls, zipUploadUrl: UploadUrl, jobId: JobId = null): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal(fileUploadUrls = fileUploadUrls, zipUploadUrl = zipUploadUrl)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    __obj.asInstanceOf[CreateDeploymentResult]
  }
}


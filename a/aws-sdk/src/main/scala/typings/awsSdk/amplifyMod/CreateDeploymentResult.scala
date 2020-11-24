package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(fileUploadUrls: FileUploadUrls, zipUploadUrl: UploadUrl): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal(fileUploadUrls = fileUploadUrls.asInstanceOf[js.Any], zipUploadUrl = zipUploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  
  @scala.inline
  implicit class CreateDeploymentResultOps[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFileUploadUrls(value: FileUploadUrls): Self = this.set("fileUploadUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipUploadUrl(value: UploadUrl): Self = this.set("zipUploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
}

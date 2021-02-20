package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentResult extends StObject {
  
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
  implicit class CreateDeploymentResultMutableBuilder[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUploadUrls(value: FileUploadUrls): Self = StObject.set(x, "fileUploadUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setZipUploadUrl(value: UploadUrl): Self = StObject.set(x, "zipUploadUrl", value.asInstanceOf[js.Any])
  }
}

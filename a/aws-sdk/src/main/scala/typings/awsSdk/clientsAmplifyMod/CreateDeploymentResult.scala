package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentResult extends StObject {
  
  /**
    *  When the fileMap argument is provided in the request, fileUploadUrls will contain a map of file names to upload URLs. 
    */
  var fileUploadUrls: FileUploadUrls
  
  /**
    *  The job ID for this deployment. will supply to start deployment api. 
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    *  When the fileMap argument is not provided in the request, this zipUploadUrl is returned. 
    */
  var zipUploadUrl: UploadUrl
}
object CreateDeploymentResult {
  
  inline def apply(fileUploadUrls: FileUploadUrls, zipUploadUrl: UploadUrl): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal(fileUploadUrls = fileUploadUrls.asInstanceOf[js.Any], zipUploadUrl = zipUploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    inline def setFileUploadUrls(value: FileUploadUrls): Self = StObject.set(x, "fileUploadUrls", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setZipUploadUrl(value: UploadUrl): Self = StObject.set(x, "zipUploadUrl", value.asInstanceOf[js.Any])
  }
}

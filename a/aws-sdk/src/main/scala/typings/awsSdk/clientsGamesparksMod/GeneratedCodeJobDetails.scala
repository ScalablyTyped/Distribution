package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratedCodeJobDetails extends StObject {
  
  /**
    * The description of the generated code job.
    */
  var Description: js.UndefOr[GeneratedCodeJobDescription] = js.undefined
  
  /**
    * The expiration date and time for the download URL.  The download URL us guaranteed to be available until at least this time. 
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the generated code job.
    */
  var GeneratedCodeJobId: js.UndefOr[typings.awsSdk.clientsGamesparksMod.GeneratedCodeJobId] = js.undefined
  
  /**
    * A presigned URL that can be used to download the generated code.
    */
  var S3Url: js.UndefOr[S3PresignedUrl] = js.undefined
  
  /**
    * The status of the generated code job
    */
  var Status: js.UndefOr[GeneratedCodeJobState] = js.undefined
}
object GeneratedCodeJobDetails {
  
  inline def apply(): GeneratedCodeJobDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratedCodeJobDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratedCodeJobDetails] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: GeneratedCodeJobDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setExpirationTime(value: js.Date): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    inline def setGeneratedCodeJobId(value: GeneratedCodeJobId): Self = StObject.set(x, "GeneratedCodeJobId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeJobIdUndefined: Self = StObject.set(x, "GeneratedCodeJobId", js.undefined)
    
    inline def setS3Url(value: S3PresignedUrl): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
    
    inline def setS3UrlUndefined: Self = StObject.set(x, "S3Url", js.undefined)
    
    inline def setStatus(value: GeneratedCodeJobState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

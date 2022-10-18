package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartModelPackagingJobResponse extends StObject {
  
  /**
    * The job name for the model packaging job. If you don't supply a job name in the JobName input parameter, the service creates a job name for you. 
    */
  var JobName: js.UndefOr[ModelPackagingJobName] = js.undefined
}
object StartModelPackagingJobResponse {
  
  inline def apply(): StartModelPackagingJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartModelPackagingJobResponse]
  }
  
  extension [Self <: StartModelPackagingJobResponse](x: Self) {
    
    inline def setJobName(value: ModelPackagingJobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}

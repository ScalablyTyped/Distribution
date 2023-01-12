package typings.awsSdk.clientsSignerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSigningJobResponse extends StObject {
  
  /**
    * The ID of your signing job.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * The AWS account ID of the signing job owner.
    */
  var jobOwner: js.UndefOr[AccountId] = js.undefined
}
object StartSigningJobResponse {
  
  inline def apply(): StartSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSigningJobResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobOwner(value: AccountId): Self = StObject.set(x, "jobOwner", value.asInstanceOf[js.Any])
    
    inline def setJobOwnerUndefined: Self = StObject.set(x, "jobOwner", js.undefined)
  }
}

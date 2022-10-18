package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThirdPartyJob extends StObject {
  
  /**
    * The clientToken portion of the clientId and clientToken pair used to verify that the calling entity is allowed access to the job and its details.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  
  /**
    * The identifier used to identify the job in AWS CodePipeline.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
}
object ThirdPartyJob {
  
  inline def apply(): ThirdPartyJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyJob]
  }
  
  extension [Self <: ThirdPartyJob](x: Self) {
    
    inline def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
  }
}

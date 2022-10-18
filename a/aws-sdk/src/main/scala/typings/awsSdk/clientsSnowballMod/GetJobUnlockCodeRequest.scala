package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobUnlockCodeRequest extends StObject {
  
  /**
    * The ID for the job that you want to get the UnlockCode value for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.clientsSnowballMod.JobId
}
object GetJobUnlockCodeRequest {
  
  inline def apply(JobId: JobId): GetJobUnlockCodeRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobUnlockCodeRequest]
  }
  
  extension [Self <: GetJobUnlockCodeRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}

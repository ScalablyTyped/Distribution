package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopEntitiesDetectionV2JobResponse extends StObject {
  
  /**
    * The identifier of the medical entities detection job that was stopped.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StopEntitiesDetectionV2JobResponse {
  
  inline def apply(): StopEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopEntitiesDetectionV2JobResponse]
  }
  
  extension [Self <: StopEntitiesDetectionV2JobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}

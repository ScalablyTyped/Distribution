package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartEntitiesDetectionV2JobResponse extends StObject {
  
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the DescribeEntitiesDetectionV2Job operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.JobId] = js.undefined
}
object StartEntitiesDetectionV2JobResponse {
  
  inline def apply(): StartEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartEntitiesDetectionV2JobResponse]
  }
  
  extension [Self <: StartEntitiesDetectionV2JobResponse](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}

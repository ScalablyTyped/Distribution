package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSoftwareUpdatesRequest extends StObject {
  
  /**
    * The ID for a job that you want to get the software update file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.clientsSnowballMod.JobId
}
object GetSoftwareUpdatesRequest {
  
  inline def apply(JobId: JobId): GetSoftwareUpdatesRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSoftwareUpdatesRequest]
  }
  
  extension [Self <: GetSoftwareUpdatesRequest](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}

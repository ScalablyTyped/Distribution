package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneyRunResponse extends StObject {
  
  /**
    * The time when the journey run was created or scheduled, in ISO 8601 format.
    */
  var CreationTime: string
  
  /**
    * The last time the journey run was updated, in ISO 8601 format..
    */
  var LastUpdateTime: string
  
  /**
    * The unique identifier for the run.
    */
  var RunId: string
  
  /**
    * The current status of the journey run.
    */
  var Status: JourneyRunStatus
}
object JourneyRunResponse {
  
  inline def apply(CreationTime: string, LastUpdateTime: string, RunId: string, Status: JourneyRunStatus): JourneyRunResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], LastUpdateTime = LastUpdateTime.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneyRunResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: string): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTime(value: string): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: string): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JourneyRunStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}

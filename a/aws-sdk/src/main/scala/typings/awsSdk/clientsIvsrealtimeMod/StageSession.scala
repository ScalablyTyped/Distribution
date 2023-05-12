package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageSession extends StObject {
  
  /**
    * ISO 8601 timestamp (returned as a string) when the stage session ended. This is null if the stage is active.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * ID of the session within the stage.
    */
  var sessionId: js.UndefOr[StageSessionId] = js.undefined
  
  /**
    *  ISO 8601 timestamp (returned as a string) when this stage session began.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
}
object StageSession {
  
  inline def apply(): StageSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StageSession] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setSessionId(value: StageSessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}

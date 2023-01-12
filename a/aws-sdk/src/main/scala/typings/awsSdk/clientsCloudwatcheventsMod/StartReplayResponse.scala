package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplayResponse extends StObject {
  
  /**
    * The ARN of the replay.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.clientsCloudwatcheventsMod.ReplayArn] = js.undefined
  
  /**
    * The time at which the replay started.
    */
  var ReplayStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.undefined
  
  /**
    * The reason that the replay is in the state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.undefined
}
object StartReplayResponse {
  
  inline def apply(): StartReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartReplayResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReplayResponse] (val x: Self) extends AnyVal {
    
    inline def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    inline def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    inline def setReplayStartTime(value: js.Date): Self = StObject.set(x, "ReplayStartTime", value.asInstanceOf[js.Any])
    
    inline def setReplayStartTimeUndefined: Self = StObject.set(x, "ReplayStartTime", js.undefined)
    
    inline def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

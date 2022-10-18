package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelReplayResponse extends StObject {
  
  /**
    * The ARN of the replay to cancel.
    */
  var ReplayArn: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.ReplayArn] = js.undefined
  
  /**
    * The current state of the replay.
    */
  var State: js.UndefOr[ReplayState] = js.undefined
  
  /**
    * The reason that the replay is in the current state.
    */
  var StateReason: js.UndefOr[ReplayStateReason] = js.undefined
}
object CancelReplayResponse {
  
  inline def apply(): CancelReplayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelReplayResponse]
  }
  
  extension [Self <: CancelReplayResponse](x: Self) {
    
    inline def setReplayArn(value: ReplayArn): Self = StObject.set(x, "ReplayArn", value.asInstanceOf[js.Any])
    
    inline def setReplayArnUndefined: Self = StObject.set(x, "ReplayArn", js.undefined)
    
    inline def setState(value: ReplayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: ReplayStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

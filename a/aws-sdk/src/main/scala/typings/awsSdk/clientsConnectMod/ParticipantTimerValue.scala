package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTimerValue extends StObject {
  
  /**
    * The timer action. Currently only one value is allowed: Unset. It deletes a timer.
    */
  var ParticipantTimerAction: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantTimerAction] = js.undefined
  
  /**
    * The duration of a timer, in minutes. 
    */
  var ParticipantTimerDurationInMinutes: js.UndefOr[typings.awsSdk.clientsConnectMod.ParticipantTimerDurationInMinutes] = js.undefined
}
object ParticipantTimerValue {
  
  inline def apply(): ParticipantTimerValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantTimerValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantTimerValue] (val x: Self) extends AnyVal {
    
    inline def setParticipantTimerAction(value: ParticipantTimerAction): Self = StObject.set(x, "ParticipantTimerAction", value.asInstanceOf[js.Any])
    
    inline def setParticipantTimerActionUndefined: Self = StObject.set(x, "ParticipantTimerAction", js.undefined)
    
    inline def setParticipantTimerDurationInMinutes(value: ParticipantTimerDurationInMinutes): Self = StObject.set(x, "ParticipantTimerDurationInMinutes", value.asInstanceOf[js.Any])
    
    inline def setParticipantTimerDurationInMinutesUndefined: Self = StObject.set(x, "ParticipantTimerDurationInMinutes", js.undefined)
  }
}

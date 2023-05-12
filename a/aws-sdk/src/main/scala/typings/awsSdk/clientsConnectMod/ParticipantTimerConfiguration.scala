package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantTimerConfiguration extends StObject {
  
  /**
    * The role of the participant in the chat conversation.
    */
  var ParticipantRole: TimerEligibleParticipantRoles
  
  /**
    * The type of timer. IDLE indicates the timer applies for considering a human chat participant as idle. DISCONNECT_NONCUSTOMER indicates the timer applies to automatically disconnecting a chat participant due to idleness.
    */
  var TimerType: ParticipantTimerType
  
  /**
    * The value of the timer. Either the timer action (Unset to delete the timer), or the duration of the timer in minutes. Only one value can be set.
    */
  var TimerValue: ParticipantTimerValue
}
object ParticipantTimerConfiguration {
  
  inline def apply(
    ParticipantRole: TimerEligibleParticipantRoles,
    TimerType: ParticipantTimerType,
    TimerValue: ParticipantTimerValue
  ): ParticipantTimerConfiguration = {
    val __obj = js.Dynamic.literal(ParticipantRole = ParticipantRole.asInstanceOf[js.Any], TimerType = TimerType.asInstanceOf[js.Any], TimerValue = TimerValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticipantTimerConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantTimerConfiguration] (val x: Self) extends AnyVal {
    
    inline def setParticipantRole(value: TimerEligibleParticipantRoles): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setTimerType(value: ParticipantTimerType): Self = StObject.set(x, "TimerType", value.asInstanceOf[js.Any])
    
    inline def setTimerValue(value: ParticipantTimerValue): Self = StObject.set(x, "TimerValue", value.asInstanceOf[js.Any])
  }
}

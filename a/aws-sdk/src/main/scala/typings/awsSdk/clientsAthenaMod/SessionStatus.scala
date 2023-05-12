package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStatus extends StObject {
  
  /**
    * The date and time that the session ended.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time starting at which the session became idle. Can be empty if the session is not currently idle.
    */
  var IdleSinceDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent date and time that the session was modified.
    */
  var LastModifiedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the session started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the session. A description of each state follows.  CREATING - The session is being started, including acquiring resources.  CREATED - The session has been started.  IDLE - The session is able to accept a calculation.  BUSY - The session is processing another task and is unable to accept a calculation.  TERMINATING - The session is in the process of shutting down.  TERMINATED - The session and its resources are no longer running.  DEGRADED - The session has no healthy coordinators.  FAILED - Due to a failure, the session and its resources are no longer running.
    */
  var State: js.UndefOr[SessionState] = js.undefined
  
  /**
    * The reason for the session state change (for example, canceled because the session was terminated).
    */
  var StateChangeReason: js.UndefOr[DescriptionString] = js.undefined
}
object SessionStatus {
  
  inline def apply(): SessionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionStatus] (val x: Self) extends AnyVal {
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setIdleSinceDateTime(value: js.Date): Self = StObject.set(x, "IdleSinceDateTime", value.asInstanceOf[js.Any])
    
    inline def setIdleSinceDateTimeUndefined: Self = StObject.set(x, "IdleSinceDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: js.Date): Self = StObject.set(x, "LastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "LastModifiedDateTime", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setState(value: SessionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: DescriptionString): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}

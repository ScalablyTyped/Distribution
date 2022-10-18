package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  /**
    * Reserved for future use.
    */
  var Details: js.UndefOr[SessionDetails] = js.undefined
  
  /**
    * The name of the Session Manager SSM document used to define the parameters and plugin settings for the session. For example, SSM-SessionManagerRunShell.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.clientsSsmMod.DocumentName] = js.undefined
  
  /**
    * The date and time, in ISO-8601 Extended format, when the session was terminated.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The maximum duration of a session before it terminates.
    */
  var MaxSessionDuration: js.UndefOr[typings.awsSdk.clientsSsmMod.MaxSessionDuration] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var OutputUrl: js.UndefOr[SessionManagerOutputUrl] = js.undefined
  
  /**
    * The ID of the Amazon Web Services user account that started the session.
    */
  var Owner: js.UndefOr[SessionOwner] = js.undefined
  
  /**
    * The reason for connecting to the instance.
    */
  var Reason: js.UndefOr[SessionReason] = js.undefined
  
  /**
    * The ID of the session.
    */
  var SessionId: js.UndefOr[typings.awsSdk.clientsSsmMod.SessionId] = js.undefined
  
  /**
    * The date and time, in ISO-8601 Extended format, when the session began.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the session. For example, "Connected" or "Terminated".
    */
  var Status: js.UndefOr[SessionStatus] = js.undefined
  
  /**
    * The managed node that the Session Manager session connected to.
    */
  var Target: js.UndefOr[SessionTarget] = js.undefined
}
object Session {
  
  inline def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  
  extension [Self <: Session](x: Self) {
    
    inline def setDetails(value: SessionDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    inline def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setMaxSessionDuration(value: MaxSessionDuration): Self = StObject.set(x, "MaxSessionDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxSessionDurationUndefined: Self = StObject.set(x, "MaxSessionDuration", js.undefined)
    
    inline def setOutputUrl(value: SessionManagerOutputUrl): Self = StObject.set(x, "OutputUrl", value.asInstanceOf[js.Any])
    
    inline def setOutputUrlUndefined: Self = StObject.set(x, "OutputUrl", js.undefined)
    
    inline def setOwner(value: SessionOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setReason(value: SessionReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "SessionId", js.undefined)
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
    
    inline def setStatus(value: SessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTarget(value: SessionTarget): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}

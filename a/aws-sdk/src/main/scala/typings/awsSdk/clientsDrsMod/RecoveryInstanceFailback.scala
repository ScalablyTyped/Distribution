package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstanceFailback extends StObject {
  
  /**
    * The date and time the agent on the Recovery Instance was last seen by the service.
    */
  var agentLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The amount of time that the Recovery Instance has been replicating for.
    */
  var elapsedReplicationDuration: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The ID of the failback client that this Recovery Instance is associated with.
    */
  var failbackClientID: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * The date and time that the failback client was last seen by the service.
    */
  var failbackClientLastSeenByServiceDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The date and time that the failback initiation started.
    */
  var failbackInitiationTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The Job ID of the last failback log for this Recovery Instance.
    */
  var failbackJobID: js.UndefOr[JobID] = js.undefined
  
  /**
    * Whether we are failing back to the original Source Server for this Recovery Instance.
    */
  var failbackToOriginalServer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The date and time of the first byte that was replicated from the Recovery Instance.
    */
  var firstByteDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The state of the failback process that this Recovery Instance is in.
    */
  var state: js.UndefOr[FailbackState] = js.undefined
}
object RecoveryInstanceFailback {
  
  inline def apply(): RecoveryInstanceFailback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstanceFailback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryInstanceFailback] (val x: Self) extends AnyVal {
    
    inline def setAgentLastSeenByServiceDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "agentLastSeenByServiceDateTime", value.asInstanceOf[js.Any])
    
    inline def setAgentLastSeenByServiceDateTimeUndefined: Self = StObject.set(x, "agentLastSeenByServiceDateTime", js.undefined)
    
    inline def setElapsedReplicationDuration(value: ISO8601DatetimeString): Self = StObject.set(x, "elapsedReplicationDuration", value.asInstanceOf[js.Any])
    
    inline def setElapsedReplicationDurationUndefined: Self = StObject.set(x, "elapsedReplicationDuration", js.undefined)
    
    inline def setFailbackClientID(value: BoundedString): Self = StObject.set(x, "failbackClientID", value.asInstanceOf[js.Any])
    
    inline def setFailbackClientIDUndefined: Self = StObject.set(x, "failbackClientID", js.undefined)
    
    inline def setFailbackClientLastSeenByServiceDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "failbackClientLastSeenByServiceDateTime", value.asInstanceOf[js.Any])
    
    inline def setFailbackClientLastSeenByServiceDateTimeUndefined: Self = StObject.set(x, "failbackClientLastSeenByServiceDateTime", js.undefined)
    
    inline def setFailbackInitiationTime(value: ISO8601DatetimeString): Self = StObject.set(x, "failbackInitiationTime", value.asInstanceOf[js.Any])
    
    inline def setFailbackInitiationTimeUndefined: Self = StObject.set(x, "failbackInitiationTime", js.undefined)
    
    inline def setFailbackJobID(value: JobID): Self = StObject.set(x, "failbackJobID", value.asInstanceOf[js.Any])
    
    inline def setFailbackJobIDUndefined: Self = StObject.set(x, "failbackJobID", js.undefined)
    
    inline def setFailbackToOriginalServer(value: Boolean): Self = StObject.set(x, "failbackToOriginalServer", value.asInstanceOf[js.Any])
    
    inline def setFailbackToOriginalServerUndefined: Self = StObject.set(x, "failbackToOriginalServer", js.undefined)
    
    inline def setFirstByteDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "firstByteDateTime", value.asInstanceOf[js.Any])
    
    inline def setFirstByteDateTimeUndefined: Self = StObject.set(x, "firstByteDateTime", js.undefined)
    
    inline def setState(value: FailbackState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

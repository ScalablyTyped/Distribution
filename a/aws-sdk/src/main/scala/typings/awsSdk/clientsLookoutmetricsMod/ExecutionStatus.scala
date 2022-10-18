package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionStatus extends StObject {
  
  /**
    * The reason that the run failed, if applicable.
    */
  var FailureReason: js.UndefOr[AnomalyDetectionTaskStatusMessage] = js.undefined
  
  /**
    * The run's status.
    */
  var Status: js.UndefOr[AnomalyDetectionTaskStatus] = js.undefined
  
  /**
    * The run's timestamp.
    */
  var Timestamp: js.UndefOr[TimestampString] = js.undefined
}
object ExecutionStatus {
  
  inline def apply(): ExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionStatus]
  }
  
  extension [Self <: ExecutionStatus](x: Self) {
    
    inline def setFailureReason(value: AnomalyDetectionTaskStatusMessage): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setStatus(value: AnomalyDetectionTaskStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimestamp(value: TimestampString): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}

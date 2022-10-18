package typings.awsSdk.clientsKeyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointInTimeRecoverySummary extends StObject {
  
  /**
    * Specifies the earliest possible restore point of the table in ISO 8601 format.
    */
  var earliestRestorableTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Shows if point-in-time recovery is enabled or disabled for the specified table.
    */
  var status: PointInTimeRecoveryStatus
}
object PointInTimeRecoverySummary {
  
  inline def apply(status: PointInTimeRecoveryStatus): PointInTimeRecoverySummary = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoverySummary]
  }
  
  extension [Self <: PointInTimeRecoverySummary](x: Self) {
    
    inline def setEarliestRestorableTimestamp(value: js.Date): Self = StObject.set(x, "earliestRestorableTimestamp", value.asInstanceOf[js.Any])
    
    inline def setEarliestRestorableTimestampUndefined: Self = StObject.set(x, "earliestRestorableTimestamp", js.undefined)
    
    inline def setStatus(value: PointInTimeRecoveryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

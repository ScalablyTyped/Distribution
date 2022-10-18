package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOrderingIdSummary extends StObject {
  
  /**
    * The reason an action could not be processed. An action can be a PUT or DELETE action for mapping users to their groups.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsKendraMod.FailureReason] = js.undefined
  
  /**
    * The last date-time an action was updated. An action can be a PUT or DELETE action for mapping users to their groups.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The order in which actions should complete processing. An action can be a PUT or DELETE action for mapping users to their groups.
    */
  var OrderingId: js.UndefOr[PrincipalOrderingId] = js.undefined
  
  /**
    * The date-time an action was received by Amazon Kendra. An action can be a PUT or DELETE action for mapping users to their groups.
    */
  var ReceivedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current processing status of actions for mapping users to their groups. The status can be either PROCESSING, SUCCEEDED, DELETING, DELETED, or FAILED.
    */
  var Status: js.UndefOr[PrincipalMappingStatus] = js.undefined
}
object GroupOrderingIdSummary {
  
  inline def apply(): GroupOrderingIdSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOrderingIdSummary]
  }
  
  extension [Self <: GroupOrderingIdSummary](x: Self) {
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setOrderingId(value: PrincipalOrderingId): Self = StObject.set(x, "OrderingId", value.asInstanceOf[js.Any])
    
    inline def setOrderingIdUndefined: Self = StObject.set(x, "OrderingId", js.undefined)
    
    inline def setReceivedAt(value: js.Date): Self = StObject.set(x, "ReceivedAt", value.asInstanceOf[js.Any])
    
    inline def setReceivedAtUndefined: Self = StObject.set(x, "ReceivedAt", js.undefined)
    
    inline def setStatus(value: PrincipalMappingStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

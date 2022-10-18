package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSetSummaryListItem extends StObject {
  
  /**
    * The ARN associated with the unique identifier for the change set referenced in this request.
    */
  var ChangeSetArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The unique identifier for a change set.
    */
  var ChangeSetId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The non-unique name for the change set.
    */
  var ChangeSetName: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.ChangeSetName] = js.undefined
  
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was finished.
    */
  var EndTime: js.UndefOr[DateTimeISO8601] = js.undefined
  
  /**
    * This object is a list of entity IDs (string) that are a part of a change set. The entity ID list is a maximum of 20 entities. It must contain at least one entity.
    */
  var EntityIdList: js.UndefOr[ResourceIdList] = js.undefined
  
  /**
    * Returned if the change set is in FAILED status. Can be either CLIENT_ERROR, which means that there are issues with the request (see the ErrorDetailList of DescribeChangeSet), or SERVER_FAULT, which means that there is a problem in the system, and you should retry your request.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.FailureCode] = js.undefined
  
  /**
    * The time, in ISO 8601 format (2018-02-27T13:45:22Z), when the change set was started.
    */
  var StartTime: js.UndefOr[DateTimeISO8601] = js.undefined
  
  /**
    * The current status of the change set.
    */
  var Status: js.UndefOr[ChangeStatus] = js.undefined
}
object ChangeSetSummaryListItem {
  
  inline def apply(): ChangeSetSummaryListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetSummaryListItem]
  }
  
  extension [Self <: ChangeSetSummaryListItem](x: Self) {
    
    inline def setChangeSetArn(value: ARN): Self = StObject.set(x, "ChangeSetArn", value.asInstanceOf[js.Any])
    
    inline def setChangeSetArnUndefined: Self = StObject.set(x, "ChangeSetArn", js.undefined)
    
    inline def setChangeSetId(value: ResourceId): Self = StObject.set(x, "ChangeSetId", value.asInstanceOf[js.Any])
    
    inline def setChangeSetIdUndefined: Self = StObject.set(x, "ChangeSetId", js.undefined)
    
    inline def setChangeSetName(value: ChangeSetName): Self = StObject.set(x, "ChangeSetName", value.asInstanceOf[js.Any])
    
    inline def setChangeSetNameUndefined: Self = StObject.set(x, "ChangeSetName", js.undefined)
    
    inline def setEndTime(value: DateTimeISO8601): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEntityIdList(value: ResourceIdList): Self = StObject.set(x, "EntityIdList", value.asInstanceOf[js.Any])
    
    inline def setEntityIdListUndefined: Self = StObject.set(x, "EntityIdList", js.undefined)
    
    inline def setEntityIdListVarargs(value: ResourceId*): Self = StObject.set(x, "EntityIdList", js.Array(value*))
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setStartTime(value: DateTimeISO8601): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: ChangeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}

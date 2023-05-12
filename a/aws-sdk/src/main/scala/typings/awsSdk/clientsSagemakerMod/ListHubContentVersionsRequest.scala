package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListHubContentVersionsRequest extends StObject {
  
  /**
    * Only list hub content versions that were created after the time specified.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Only list hub content versions that were created before the time specified.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the hub content.
    */
  var HubContentName: typings.awsSdk.clientsSagemakerMod.HubContentName
  
  /**
    * The type of hub content to list versions of.
    */
  var HubContentType: typings.awsSdk.clientsSagemakerMod.HubContentType
  
  /**
    * The name of the hub to list the content versions of.
    */
  var HubName: typings.awsSdk.clientsSagemakerMod.HubName
  
  /**
    * The maximum number of hub content versions to list.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MaxResults] = js.undefined
  
  /**
    * The upper bound of the hub content schema version.
    */
  var MaxSchemaVersion: js.UndefOr[DocumentSchemaVersion] = js.undefined
  
  /**
    * The lower bound of the hub content versions to list.
    */
  var MinVersion: js.UndefOr[HubContentVersion] = js.undefined
  
  /**
    * If the response to a previous ListHubContentVersions request was truncated, the response includes a NextToken. To retrieve the next set of hub content versions, use the token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
  
  /**
    * Sort hub content versions by either name or creation time.
    */
  var SortBy: js.UndefOr[HubContentSortBy] = js.undefined
  
  /**
    * Sort hub content versions by ascending or descending order.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SortOrder] = js.undefined
}
object ListHubContentVersionsRequest {
  
  inline def apply(HubContentName: HubContentName, HubContentType: HubContentType, HubName: HubName): ListHubContentVersionsRequest = {
    val __obj = js.Dynamic.literal(HubContentName = HubContentName.asInstanceOf[js.Any], HubContentType = HubContentType.asInstanceOf[js.Any], HubName = HubName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHubContentVersionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListHubContentVersionsRequest] (val x: Self) extends AnyVal {
    
    inline def setCreationTimeAfter(value: js.Date): Self = StObject.set(x, "CreationTimeAfter", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeAfterUndefined: Self = StObject.set(x, "CreationTimeAfter", js.undefined)
    
    inline def setCreationTimeBefore(value: js.Date): Self = StObject.set(x, "CreationTimeBefore", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeBeforeUndefined: Self = StObject.set(x, "CreationTimeBefore", js.undefined)
    
    inline def setHubContentName(value: HubContentName): Self = StObject.set(x, "HubContentName", value.asInstanceOf[js.Any])
    
    inline def setHubContentType(value: HubContentType): Self = StObject.set(x, "HubContentType", value.asInstanceOf[js.Any])
    
    inline def setHubName(value: HubName): Self = StObject.set(x, "HubName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMaxSchemaVersion(value: DocumentSchemaVersion): Self = StObject.set(x, "MaxSchemaVersion", value.asInstanceOf[js.Any])
    
    inline def setMaxSchemaVersionUndefined: Self = StObject.set(x, "MaxSchemaVersion", js.undefined)
    
    inline def setMinVersion(value: HubContentVersion): Self = StObject.set(x, "MinVersion", value.asInstanceOf[js.Any])
    
    inline def setMinVersionUndefined: Self = StObject.set(x, "MinVersion", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: HubContentSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}

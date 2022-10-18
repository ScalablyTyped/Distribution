package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLFTagsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * If resource share type is ALL, returns both in-account LF-tags and shared LF-tags that the requester has permission to view. If resource share type is FOREIGN, returns all share LF-tags that the requester can view. If no resource share type is passed, lists LF-tags in the given catalog ID that the requester has permission to view.
    */
  var ResourceShareType: js.UndefOr[typings.awsSdk.clientsLakeformationMod.ResourceShareType] = js.undefined
}
object ListLFTagsRequest {
  
  inline def apply(): ListLFTagsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLFTagsRequest]
  }
  
  extension [Self <: ListLFTagsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceShareType(value: ResourceShareType): Self = StObject.set(x, "ResourceShareType", value.asInstanceOf[js.Any])
    
    inline def setResourceShareTypeUndefined: Self = StObject.set(x, "ResourceShareType", js.undefined)
  }
}

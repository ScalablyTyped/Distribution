package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * Indicates that related permissions should be included in the results.
    */
  var IncludeRelated: js.UndefOr[TrueFalseString] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Specifies a principal to filter the permissions returned.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.undefined
  
  /**
    * A resource where you will get a list of the principal permissions. This operation does not support getting privileges on a table with columns. Instead, call this operation on the table, and the operation returns the table and the table w columns.
    */
  var Resource: js.UndefOr[typings.awsSdk.clientsLakeformationMod.Resource] = js.undefined
  
  /**
    * Specifies a resource type to filter the permissions returned.
    */
  var ResourceType: js.UndefOr[DataLakeResourceType] = js.undefined
}
object ListPermissionsRequest {
  
  inline def apply(): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionsRequest]
  }
  
  extension [Self <: ListPermissionsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setIncludeRelated(value: TrueFalseString): Self = StObject.set(x, "IncludeRelated", value.asInstanceOf[js.Any])
    
    inline def setIncludeRelatedUndefined: Self = StObject.set(x, "IncludeRelated", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrincipal(value: DataLakePrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
    
    inline def setResource(value: Resource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: DataLakeResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}

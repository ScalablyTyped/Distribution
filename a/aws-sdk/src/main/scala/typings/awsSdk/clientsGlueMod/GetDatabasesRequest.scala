package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatabasesRequest extends StObject {
  
  /**
    * The ID of the Data Catalog from which to retrieve Databases. If none is provided, the Amazon Web Services account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * The maximum number of databases to return in one response.
    */
  var MaxResults: js.UndefOr[CatalogGetterPageSize] = js.undefined
  
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Allows you to specify that you want to list the databases shared with your account. The allowable values are FOREIGN or ALL.    If set to FOREIGN, will list the databases shared with your account.    If set to ALL, will list the databases shared with your account, as well as the databases in yor local account.   
    */
  var ResourceShareType: js.UndefOr[typings.awsSdk.clientsGlueMod.ResourceShareType] = js.undefined
}
object GetDatabasesRequest {
  
  inline def apply(): GetDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatabasesRequest]
  }
  
  extension [Self <: GetDatabasesRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setMaxResults(value: CatalogGetterPageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceShareType(value: ResourceShareType): Self = StObject.set(x, "ResourceShareType", value.asInstanceOf[js.Any])
    
    inline def setResourceShareTypeUndefined: Self = StObject.set(x, "ResourceShareType", js.undefined)
  }
}

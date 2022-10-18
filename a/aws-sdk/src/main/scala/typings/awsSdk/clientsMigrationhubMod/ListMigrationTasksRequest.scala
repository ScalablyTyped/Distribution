package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationTasksRequest extends StObject {
  
  /**
    * Value to specify how many results are returned per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.MaxResults] = js.undefined
  
  /**
    * If a NextToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in NextToken.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Filter migration tasks by discovered resource name.
    */
  var ResourceName: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.ResourceName] = js.undefined
}
object ListMigrationTasksRequest {
  
  inline def apply(): ListMigrationTasksRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationTasksRequest]
  }
  
  extension [Self <: ListMigrationTasksRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}

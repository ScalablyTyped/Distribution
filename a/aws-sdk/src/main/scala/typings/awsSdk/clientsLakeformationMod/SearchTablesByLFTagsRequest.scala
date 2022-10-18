package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTablesByLFTagsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of conditions (LFTag structures) to search for in table resources.
    */
  var Expression: typings.awsSdk.clientsLakeformationMod.Expression
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object SearchTablesByLFTagsRequest {
  
  inline def apply(Expression: Expression): SearchTablesByLFTagsRequest = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTablesByLFTagsRequest]
  }
  
  extension [Self <: SearchTablesByLFTagsRequest](x: Self) {
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionVarargs(value: LFTag*): Self = StObject.set(x, "Expression", js.Array(value*))
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

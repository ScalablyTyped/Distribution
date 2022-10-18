package typings.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesResponse extends StObject {
  
  /**
    *  Array of EntitySummary object.
    */
  var EntitySummaryList: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.EntitySummaryList] = js.undefined
  
  /**
    * The value of the next token if it exists. Null if there is no more result.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsMarketplacecatalogMod.NextToken] = js.undefined
}
object ListEntitiesResponse {
  
  inline def apply(): ListEntitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesResponse]
  }
  
  extension [Self <: ListEntitiesResponse](x: Self) {
    
    inline def setEntitySummaryList(value: EntitySummaryList): Self = StObject.set(x, "EntitySummaryList", value.asInstanceOf[js.Any])
    
    inline def setEntitySummaryListUndefined: Self = StObject.set(x, "EntitySummaryList", js.undefined)
    
    inline def setEntitySummaryListVarargs(value: EntitySummary*): Self = StObject.set(x, "EntitySummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

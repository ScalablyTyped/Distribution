package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCatalogItemsOutput extends StObject {
  
  /**
    * Information about the catalog items.
    */
  var CatalogItems: js.UndefOr[CatalogItemListDefinition] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListCatalogItemsOutput {
  
  inline def apply(): ListCatalogItemsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCatalogItemsOutput]
  }
  
  extension [Self <: ListCatalogItemsOutput](x: Self) {
    
    inline def setCatalogItems(value: CatalogItemListDefinition): Self = StObject.set(x, "CatalogItems", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemsUndefined: Self = StObject.set(x, "CatalogItems", js.undefined)
    
    inline def setCatalogItemsVarargs(value: CatalogItem*): Self = StObject.set(x, "CatalogItems", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogItemOutput extends StObject {
  
  /**
    * Information about this catalog item.
    */
  var CatalogItem: js.UndefOr[typings.awsSdk.clientsOutpostsMod.CatalogItem] = js.undefined
}
object GetCatalogItemOutput {
  
  inline def apply(): GetCatalogItemOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCatalogItemOutput]
  }
  
  extension [Self <: GetCatalogItemOutput](x: Self) {
    
    inline def setCatalogItem(value: CatalogItem): Self = StObject.set(x, "CatalogItem", value.asInstanceOf[js.Any])
    
    inline def setCatalogItemUndefined: Self = StObject.set(x, "CatalogItem", js.undefined)
  }
}

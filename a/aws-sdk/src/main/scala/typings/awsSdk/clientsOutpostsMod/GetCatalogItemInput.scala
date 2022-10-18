package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCatalogItemInput extends StObject {
  
  /**
    * The ID of the catalog item.
    */
  var CatalogItemId: SkuCode
}
object GetCatalogItemInput {
  
  inline def apply(CatalogItemId: SkuCode): GetCatalogItemInput = {
    val __obj = js.Dynamic.literal(CatalogItemId = CatalogItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCatalogItemInput]
  }
  
  extension [Self <: GetCatalogItemInput](x: Self) {
    
    inline def setCatalogItemId(value: SkuCode): Self = StObject.set(x, "CatalogItemId", value.asInstanceOf[js.Any])
  }
}

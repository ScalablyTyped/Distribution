package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariantStoresResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of variant stores.
    */
  var variantStores: js.UndefOr[VariantStoreItems] = js.undefined
}
object ListVariantStoresResponse {
  
  inline def apply(): ListVariantStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariantStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVariantStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVariantStores(value: VariantStoreItems): Self = StObject.set(x, "variantStores", value.asInstanceOf[js.Any])
    
    inline def setVariantStoresUndefined: Self = StObject.set(x, "variantStores", js.undefined)
    
    inline def setVariantStoresVarargs(value: VariantStoreItem*): Self = StObject.set(x, "variantStores", js.Array(value*))
  }
}

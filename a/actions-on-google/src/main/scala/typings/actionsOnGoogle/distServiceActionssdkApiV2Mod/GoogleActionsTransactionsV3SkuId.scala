package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsTransactionsV3SkuId extends StObject {
  
  /**
    * The identifier of the product SKU used for registration in the developer
    * console.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the android package under which the sku was registered.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of SKU.
    */
  var skuType: js.UndefOr[GoogleActionsTransactionsV3SkuIdSkuType] = js.undefined
}
object GoogleActionsTransactionsV3SkuId {
  
  inline def apply(): GoogleActionsTransactionsV3SkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3SkuId]
  }
  
  extension [Self <: GoogleActionsTransactionsV3SkuId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSkuType(value: GoogleActionsTransactionsV3SkuIdSkuType): Self = StObject.set(x, "skuType", value.asInstanceOf[js.Any])
    
    inline def setSkuTypeUndefined: Self = StObject.set(x, "skuType", js.undefined)
  }
}

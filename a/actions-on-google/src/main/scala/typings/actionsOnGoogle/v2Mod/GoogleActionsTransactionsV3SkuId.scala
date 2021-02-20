package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3SkuId extends StObject {
  
  /**
    * The identifier of the product SKU used for registration in the developer
    * console.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The name of the android package under which the sku was registered.
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * The type of SKU.
    */
  var skuType: js.UndefOr[GoogleActionsTransactionsV3SkuIdSkuType] = js.native
}
object GoogleActionsTransactionsV3SkuId {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3SkuId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3SkuId]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3SkuIdMutableBuilder[Self <: GoogleActionsTransactionsV3SkuId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setSkuType(value: GoogleActionsTransactionsV3SkuIdSkuType): Self = StObject.set(x, "skuType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuTypeUndefined: Self = StObject.set(x, "skuType", js.undefined)
  }
}

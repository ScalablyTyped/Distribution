package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValueSpec extends StObject {
  
  /**
    * An opaque string specified by developer, which would associate with the
    * purchase and is expected to return as part of purchase data.
    */
  var developerPayload: js.UndefOr[String] = js.native
  
  /**
    * The product being purchased.
    */
  var skuId: js.UndefOr[GoogleActionsTransactionsV3SkuId] = js.native
}
object GoogleActionsTransactionsV3CompletePurchaseValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsTransactionsV3CompletePurchaseValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsTransactionsV3CompletePurchaseValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueSpecMutableBuilder[Self <: GoogleActionsTransactionsV3CompletePurchaseValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setSkuId(value: GoogleActionsTransactionsV3SkuId): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
  }
}

package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsTransactionsV3CompletePurchaseValueSpec extends js.Object {
  
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
  implicit class GoogleActionsTransactionsV3CompletePurchaseValueSpecOps[Self <: GoogleActionsTransactionsV3CompletePurchaseValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    
    @scala.inline
    def setSkuId(value: GoogleActionsTransactionsV3SkuId): Self = this.set("skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkuId: Self = this.set("skuId", js.undefined)
  }
}

package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketplaceInformation extends StObject {
  
  /**
    * The product ID from the Amazon Web Services Marketplace.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The product URL from the Amazon Web Services Marketplace.
    */
  var productUrl: js.UndefOr[String] = js.undefined
}
object MarketplaceInformation {
  
  inline def apply(): MarketplaceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarketplaceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarketplaceInformation] (val x: Self) extends AnyVal {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductUrl(value: String): Self = StObject.set(x, "productUrl", value.asInstanceOf[js.Any])
    
    inline def setProductUrlUndefined: Self = StObject.set(x, "productUrl", js.undefined)
  }
}

package typings.awsSdk.clientsLicensemanagerusersubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProductSubscriptionResponse extends StObject {
  
  /**
    * Metadata that describes the start product subscription operation.
    */
  var ProductUserSummary: typings.awsSdk.clientsLicensemanagerusersubscriptionsMod.ProductUserSummary
}
object StartProductSubscriptionResponse {
  
  inline def apply(ProductUserSummary: ProductUserSummary): StartProductSubscriptionResponse = {
    val __obj = js.Dynamic.literal(ProductUserSummary = ProductUserSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProductSubscriptionResponse]
  }
  
  extension [Self <: StartProductSubscriptionResponse](x: Self) {
    
    inline def setProductUserSummary(value: ProductUserSummary): Self = StObject.set(x, "ProductUserSummary", value.asInstanceOf[js.Any])
  }
}

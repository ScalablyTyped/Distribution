package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrustedSigners extends StObject {
  
  /**
    * This field is true if any of the Amazon Web Services accounts have public keys that CloudFront can use to verify the signatures of signed URLs and signed cookies. If not, this field is false.
    */
  var Enabled: Boolean
  
  /**
    * A list of Amazon Web Services account identifiers.
    */
  var Items: js.UndefOr[AwsAccountNumberList] = js.undefined
  
  /**
    * The number of Amazon Web Services accounts in the list.
    */
  var Quantity: integer
}
object TrustedSigners {
  
  inline def apply(Enabled: Boolean, Quantity: integer): TrustedSigners = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrustedSigners]
  }
  
  extension [Self <: TrustedSigners](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setItems(value: AwsAccountNumberList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPairIds extends StObject {
  
  /**
    * A list of CloudFront key pair identifiers.
    */
  var Items: js.UndefOr[KeyPairIdList] = js.undefined
  
  /**
    * The number of key pair identifiers in the list.
    */
  var Quantity: integer
}
object KeyPairIds {
  
  inline def apply(Quantity: integer): KeyPairIds = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairIds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPairIds] (val x: Self) extends AnyVal {
    
    inline def setItems(value: KeyPairIdList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: String*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}

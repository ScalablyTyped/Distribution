package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Product extends StObject {
  
  var account: Data
  
  var product: DataIdType
}
object Product {
  
  inline def apply(account: Data, product: DataIdType): Product = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Product]
  }
  
  extension [Self <: Product](x: Self) {
    
    inline def setAccount(value: Data): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: DataIdType): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}

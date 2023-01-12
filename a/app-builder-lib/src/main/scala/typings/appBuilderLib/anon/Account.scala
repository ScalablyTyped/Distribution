package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var account: Data
  
  var product: DataType
}
object Account {
  
  inline def apply(account: Data, product: DataType): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: Data): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setProduct(value: DataType): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
  }
}

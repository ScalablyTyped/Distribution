package typings.acmeClient.typesRfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderCreateRequest extends StObject {
  
  var identifiers: js.Array[Identifier]
  
  var notAfter: js.UndefOr[String] = js.undefined
  
  var notBefore: js.UndefOr[String] = js.undefined
}
object OrderCreateRequest {
  
  inline def apply(identifiers: js.Array[Identifier]): OrderCreateRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateRequest]
  }
  
  extension [Self <: OrderCreateRequest](x: Self) {
    
    inline def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    inline def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value*))
    
    inline def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}

package typings.acmeClient.rfc8555Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderCreateRequest extends StObject {
  
  var identifiers: js.Array[Identifier]
  
  var notAfter: js.UndefOr[String] = js.undefined
  
  var notBefore: js.UndefOr[String] = js.undefined
}
object OrderCreateRequest {
  
  @scala.inline
  def apply(identifiers: js.Array[Identifier]): OrderCreateRequest = {
    val __obj = js.Dynamic.literal(identifiers = identifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderCreateRequest]
  }
  
  @scala.inline
  implicit class OrderCreateRequestMutableBuilder[Self <: OrderCreateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifiers(value: js.Array[Identifier]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifiersVarargs(value: Identifier*): Self = StObject.set(x, "identifiers", js.Array(value :_*))
    
    @scala.inline
    def setNotAfter(value: String): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: String): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}

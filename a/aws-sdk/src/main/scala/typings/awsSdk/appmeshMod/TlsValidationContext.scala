package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsValidationContext extends StObject {
  
  /**
    * A reference to an object that represents a TLS validation context trust.
    */
  var trust: TlsValidationContextTrust
}
object TlsValidationContext {
  
  @scala.inline
  def apply(trust: TlsValidationContextTrust): TlsValidationContext = {
    val __obj = js.Dynamic.literal(trust = trust.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsValidationContext]
  }
  
  @scala.inline
  implicit class TlsValidationContextMutableBuilder[Self <: TlsValidationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrust(value: TlsValidationContextTrust): Self = StObject.set(x, "trust", value.asInstanceOf[js.Any])
  }
}

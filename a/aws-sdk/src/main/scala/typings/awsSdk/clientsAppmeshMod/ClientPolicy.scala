package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientPolicy extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[ClientPolicyTls] = js.undefined
}
object ClientPolicy {
  
  inline def apply(): ClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientPolicy] (val x: Self) extends AnyVal {
    
    inline def setTls(value: ClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}

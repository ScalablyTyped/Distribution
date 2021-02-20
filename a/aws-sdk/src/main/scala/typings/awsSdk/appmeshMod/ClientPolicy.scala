package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientPolicy extends StObject {
  
  /**
    * A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  var tls: js.UndefOr[ClientPolicyTls] = js.native
}
object ClientPolicy {
  
  @scala.inline
  def apply(): ClientPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientPolicy]
  }
  
  @scala.inline
  implicit class ClientPolicyMutableBuilder[Self <: ClientPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTls(value: ClientPolicyTls): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
  }
}

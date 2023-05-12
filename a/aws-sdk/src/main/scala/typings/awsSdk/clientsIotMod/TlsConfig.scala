package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlsConfig extends StObject {
  
  /**
    * The security policy for a domain configuration. For more information, see Security policies  in the Amazon Web Services IoT Core developer guide.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
}
object TlsConfig {
  
  inline def apply(): TlsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TlsConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TlsConfig] (val x: Self) extends AnyVal {
    
    inline def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}

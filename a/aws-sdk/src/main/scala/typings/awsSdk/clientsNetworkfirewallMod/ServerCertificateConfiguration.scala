package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerCertificateConfiguration extends StObject {
  
  /**
    * A list of a server certificate configuration's scopes.
    */
  var Scopes: js.UndefOr[ServerCertificateScopes] = js.undefined
  
  /**
    * The list of a server certificate configuration's Certificate Manager SSL/TLS certificates.
    */
  var ServerCertificates: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.ServerCertificates] = js.undefined
}
object ServerCertificateConfiguration {
  
  inline def apply(): ServerCertificateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerCertificateConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerCertificateConfiguration] (val x: Self) extends AnyVal {
    
    inline def setScopes(value: ServerCertificateScopes): Self = StObject.set(x, "Scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "Scopes", js.undefined)
    
    inline def setScopesVarargs(value: ServerCertificateScope*): Self = StObject.set(x, "Scopes", js.Array(value*))
    
    inline def setServerCertificates(value: ServerCertificates): Self = StObject.set(x, "ServerCertificates", value.asInstanceOf[js.Any])
    
    inline def setServerCertificatesUndefined: Self = StObject.set(x, "ServerCertificates", js.undefined)
    
    inline def setServerCertificatesVarargs(value: ServerCertificate*): Self = StObject.set(x, "ServerCertificates", js.Array(value*))
  }
}

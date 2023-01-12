package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthentication extends StObject {
  
  /**
    * The ARN of the client certificate. 
    */
  var ClientRootCertificateChain: js.UndefOr[String] = js.undefined
}
object CertificateAuthentication {
  
  inline def apply(): CertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateAuthentication] (val x: Self) extends AnyVal {
    
    inline def setClientRootCertificateChain(value: String): Self = StObject.set(x, "ClientRootCertificateChain", value.asInstanceOf[js.Any])
    
    inline def setClientRootCertificateChainUndefined: Self = StObject.set(x, "ClientRootCertificateChain", js.undefined)
  }
}

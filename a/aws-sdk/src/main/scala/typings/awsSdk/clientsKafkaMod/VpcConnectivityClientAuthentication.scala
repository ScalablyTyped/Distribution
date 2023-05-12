package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectivityClientAuthentication extends StObject {
  
  /**
    * 
    SASL authentication type details for VPC connectivity.
    
    */
  var Sasl: js.UndefOr[VpcConnectivitySasl] = js.undefined
  
  /**
    * 
    TLS authentication type details for VPC connectivity.
    
    */
  var Tls: js.UndefOr[VpcConnectivityTls] = js.undefined
}
object VpcConnectivityClientAuthentication {
  
  inline def apply(): VpcConnectivityClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectivityClientAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectivityClientAuthentication] (val x: Self) extends AnyVal {
    
    inline def setSasl(value: VpcConnectivitySasl): Self = StObject.set(x, "Sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "Sasl", js.undefined)
    
    inline def setTls(value: VpcConnectivityTls): Self = StObject.set(x, "Tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "Tls", js.undefined)
  }
}

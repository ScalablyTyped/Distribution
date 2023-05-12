package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectivity extends StObject {
  
  /**
    * 
    Includes all client authentication information for VPC connectivity.
    
    */
  var ClientAuthentication: js.UndefOr[VpcConnectivityClientAuthentication] = js.undefined
}
object VpcConnectivity {
  
  inline def apply(): VpcConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectivity] (val x: Self) extends AnyVal {
    
    inline def setClientAuthentication(value: VpcConnectivityClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
  }
}

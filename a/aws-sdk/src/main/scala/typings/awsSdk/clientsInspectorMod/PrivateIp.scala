package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateIp extends StObject {
  
  /**
    * The DNS name of the private IP address.
    */
  var privateDnsName: js.UndefOr[Text] = js.undefined
  
  /**
    * The full IP address of the network inteface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.undefined
}
object PrivateIp {
  
  inline def apply(): PrivateIp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateIp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateIp] (val x: Self) extends AnyVal {
    
    inline def setPrivateDnsName(value: Text): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsNameUndefined: Self = StObject.set(x, "privateDnsName", js.undefined)
    
    inline def setPrivateIpAddress(value: Text): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
  }
}

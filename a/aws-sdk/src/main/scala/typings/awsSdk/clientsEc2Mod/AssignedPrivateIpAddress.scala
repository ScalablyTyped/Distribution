package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedPrivateIpAddress extends StObject {
  
  /**
    * The private IP address assigned to the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
}
object AssignedPrivateIpAddress {
  
  inline def apply(): AssignedPrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedPrivateIpAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignedPrivateIpAddress] (val x: Self) extends AnyVal {
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
  }
}

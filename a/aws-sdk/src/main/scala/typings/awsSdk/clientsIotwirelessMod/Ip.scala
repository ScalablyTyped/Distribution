package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  /**
    * IP address information.
    */
  var IpAddress: IPAddress
}
object Ip {
  
  inline def apply(IpAddress: IPAddress): Ip = {
    val __obj = js.Dynamic.literal(IpAddress = IpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
    
    inline def setIpAddress(value: IPAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
  }
}

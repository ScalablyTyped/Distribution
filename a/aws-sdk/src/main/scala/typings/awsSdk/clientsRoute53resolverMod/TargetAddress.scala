package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetAddress extends StObject {
  
  /**
    * One IPv4 address that you want to forward DNS queries to.
    */
  var Ip: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ip] = js.undefined
  
  /**
    *  One IPv6 address that you want to forward DNS queries to. 
    */
  var Ipv6: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Ipv6] = js.undefined
  
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.Port] = js.undefined
}
object TargetAddress {
  
  inline def apply(): TargetAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetAddress] (val x: Self) extends AnyVal {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setIpUndefined: Self = StObject.set(x, "Ip", js.undefined)
    
    inline def setIpv6(value: Ipv6): Self = StObject.set(x, "Ipv6", value.asInstanceOf[js.Any])
    
    inline def setIpv6Undefined: Self = StObject.set(x, "Ipv6", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}

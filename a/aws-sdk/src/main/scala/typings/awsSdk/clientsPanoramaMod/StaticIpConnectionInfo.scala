package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticIpConnectionInfo extends StObject {
  
  /**
    * The connection's default gateway.
    */
  var DefaultGateway: typings.awsSdk.clientsPanoramaMod.DefaultGateway
  
  /**
    * The connection's DNS address.
    */
  var Dns: DnsList
  
  /**
    * The connection's IP address.
    */
  var IpAddress: typings.awsSdk.clientsPanoramaMod.IpAddress
  
  /**
    * The connection's DNS mask.
    */
  var Mask: typings.awsSdk.clientsPanoramaMod.Mask
}
object StaticIpConnectionInfo {
  
  inline def apply(DefaultGateway: DefaultGateway, Dns: DnsList, IpAddress: IpAddress, Mask: Mask): StaticIpConnectionInfo = {
    val __obj = js.Dynamic.literal(DefaultGateway = DefaultGateway.asInstanceOf[js.Any], Dns = Dns.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticIpConnectionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticIpConnectionInfo] (val x: Self) extends AnyVal {
    
    inline def setDefaultGateway(value: DefaultGateway): Self = StObject.set(x, "DefaultGateway", value.asInstanceOf[js.Any])
    
    inline def setDns(value: DnsList): Self = StObject.set(x, "Dns", value.asInstanceOf[js.Any])
    
    inline def setDnsVarargs(value: Dns*): Self = StObject.set(x, "Dns", js.Array(value*))
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Mask): Self = StObject.set(x, "Mask", value.asInstanceOf[js.Any])
  }
}

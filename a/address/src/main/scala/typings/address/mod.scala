package typings.address

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(callback: AddressCallback): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(interfaceName: String, callback: AddressCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(interfaceName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("address", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("address", "MAC_IP_RE")
  @js.native
  val MAC_IP_RE: RegExp = js.native
  
  @JSImport("address", "MAC_RE")
  @js.native
  val MAC_RE: RegExp = js.native
  
  inline def dns(callback: DnsCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dns")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def dns(filepath: String, callback: DnsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dns")(filepath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ip(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip")().asInstanceOf[js.Any]
  inline def ip(interfaceName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ip")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def ipv6(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ipv6")().asInstanceOf[js.Any]
  inline def ipv6(interfaceName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ipv6")(interfaceName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def mac(callback: MacCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mac")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mac(interfaceName: String, callback: MacCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mac")(interfaceName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Address extends StObject {
    
    var ip: String
    
    var ipv6: String
    
    var mac: String
  }
  object Address {
    
    inline def apply(ip: String, ipv6: String, mac: String): Address = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      inline def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  type AddressCallback = js.Function2[/* err */ Error, /* addr */ Address, Unit]
  
  type DnsCallback = js.Function2[/* err */ Error, /* servers */ js.Array[String], Unit]
  
  type MacCallback = js.Function2[/* err */ Error, /* addr */ String, Unit]
}

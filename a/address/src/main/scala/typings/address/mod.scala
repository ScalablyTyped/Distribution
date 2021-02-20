package typings.address

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("address", JSImport.Namespace)
  @js.native
  def apply(callback: AddressCallback): Unit = js.native
  @JSImport("address", JSImport.Namespace)
  @js.native
  def apply(interfaceName: String, callback: AddressCallback): Unit = js.native
  
  @JSImport("address", "MAC_IP_RE")
  @js.native
  val MAC_IP_RE: RegExp = js.native
  
  @JSImport("address", "MAC_RE")
  @js.native
  val MAC_RE: RegExp = js.native
  
  @JSImport("address", "dns")
  @js.native
  def dns(callback: DnsCallback): Unit = js.native
  @JSImport("address", "dns")
  @js.native
  def dns(filepath: String, callback: DnsCallback): Unit = js.native
  
  @JSImport("address", "ip")
  @js.native
  def ip(): js.Any = js.native
  @JSImport("address", "ip")
  @js.native
  def ip(interfaceName: String): js.Any = js.native
  
  @JSImport("address", "ipv6")
  @js.native
  def ipv6(): js.Any = js.native
  @JSImport("address", "ipv6")
  @js.native
  def ipv6(interfaceName: String): js.Any = js.native
  
  @JSImport("address", "mac")
  @js.native
  def mac(callback: MacCallback): Unit = js.native
  @JSImport("address", "mac")
  @js.native
  def mac(interfaceName: String, callback: MacCallback): Unit = js.native
  
  @js.native
  trait Address extends StObject {
    
    var ip: String = js.native
    
    var ipv6: String = js.native
    
    var mac: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(ip: String, ipv6: String, mac: String): Address = {
      val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], ipv6 = ipv6.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6(value: String): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    }
  }
  
  type AddressCallback = js.Function2[/* err */ Error, /* addr */ Address, Unit]
  
  type DnsCallback = js.Function2[/* err */ Error, /* servers */ js.Array[String], Unit]
  
  type MacCallback = js.Function2[/* err */ Error, /* addr */ String, Unit]
}

package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancePortState extends StObject {
  
  /**
    * An alias that defines access for a preconfigured range of IP addresses. The only alias currently supported is lightsail-connect, which allows IP addresses of the browser-based RDP/SSH client in the Lightsail console to connect to your instance.
    */
  var cidrListAliases: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed to connect to an instance through the ports, and the protocol.  The ipv6Cidrs parameter lists the IPv6 addresses that are allowed to connect to an instance.  For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var cidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * The first port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP type for IPv4 addresses. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.   ICMPv6 - The ICMP type for IPv6 addresses. For example, specify 128 as the fromPort (ICMPv6 type), and 0 as toPort (ICMPv6 code). For more information, see Internet Control Message Protocol for IPv6.  
    */
  var fromPort: js.UndefOr[Port] = js.undefined
  
  /**
    * The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are allowed to connect to an instance through the ports, and the protocol. Only devices with an IPv6 address can connect to an instance through IPv6; otherwise, IPv4 should be used.  The cidrs parameter lists the IPv4 addresses that are allowed to connect to an instance.  For more information about CIDR block notation, see Classless Inter-Domain Routing on Wikipedia.
    */
  var ipv6Cidrs: js.UndefOr[StringList] = js.undefined
  
  /**
    * The IP protocol name. The name can be one of the following:    tcp - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked delivery of streamed data between applications running on hosts communicating by an IP network. If you have an application that doesn't require reliable data stream service, use UDP instead.    all - All transport layer protocol types. For more general information, see Transport layer on Wikipedia.    udp - With User Datagram Protocol (UDP), computer applications can send messages (or datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not required to set up transmission channels or data paths. Applications that don't require reliable data stream service can use UDP, which provides a connectionless datagram service that emphasizes reduced latency over reliability. If you do require reliable data stream service, use TCP instead.    icmp - Internet Control Message Protocol (ICMP) is used to send error messages and operational information indicating success or failure when communicating with an instance. For example, an error is indicated when an instance could not be reached. When you specify icmp as the protocol, you must specify the ICMP type using the fromPort parameter, and ICMP code using the toPort parameter.  
    */
  var protocol: js.UndefOr[NetworkProtocol] = js.undefined
  
  /**
    * Specifies whether the instance port is open or closed.  The port state for Lightsail instances is always open. 
    */
  var state: js.UndefOr[PortState] = js.undefined
  
  /**
    * The last port in a range of open ports on an instance. Allowed ports:   TCP and UDP - 0 to 65535    ICMP - The ICMP code for IPv4 addresses. For example, specify 8 as the fromPort (ICMP type), and -1 as the toPort (ICMP code), to enable ICMP Ping. For more information, see Control Messages on Wikipedia.   ICMPv6 - The ICMP code for IPv6 addresses. For example, specify 128 as the fromPort (ICMPv6 type), and 0 as toPort (ICMPv6 code). For more information, see Internet Control Message Protocol for IPv6.  
    */
  var toPort: js.UndefOr[Port] = js.undefined
}
object InstancePortState {
  
  inline def apply(): InstancePortState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePortState]
  }
  
  extension [Self <: InstancePortState](x: Self) {
    
    inline def setCidrListAliases(value: StringList): Self = StObject.set(x, "cidrListAliases", value.asInstanceOf[js.Any])
    
    inline def setCidrListAliasesUndefined: Self = StObject.set(x, "cidrListAliases", js.undefined)
    
    inline def setCidrListAliasesVarargs(value: String*): Self = StObject.set(x, "cidrListAliases", js.Array(value*))
    
    inline def setCidrs(value: StringList): Self = StObject.set(x, "cidrs", value.asInstanceOf[js.Any])
    
    inline def setCidrsUndefined: Self = StObject.set(x, "cidrs", js.undefined)
    
    inline def setCidrsVarargs(value: String*): Self = StObject.set(x, "cidrs", js.Array(value*))
    
    inline def setFromPort(value: Port): Self = StObject.set(x, "fromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "fromPort", js.undefined)
    
    inline def setIpv6Cidrs(value: StringList): Self = StObject.set(x, "ipv6Cidrs", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrsUndefined: Self = StObject.set(x, "ipv6Cidrs", js.undefined)
    
    inline def setIpv6CidrsVarargs(value: String*): Self = StObject.set(x, "ipv6Cidrs", js.Array(value*))
    
    inline def setProtocol(value: NetworkProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setState(value: PortState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setToPort(value: Port): Self = StObject.set(x, "toPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "toPort", js.undefined)
  }
}

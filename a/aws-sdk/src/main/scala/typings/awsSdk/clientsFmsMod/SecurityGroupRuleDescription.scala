package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRuleDescription extends StObject {
  
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types.
    */
  var FromPort: js.UndefOr[IPPortNumber] = js.undefined
  
  /**
    * The IPv4 ranges for the security group rule.
    */
  var IPV4Range: js.UndefOr[CIDR] = js.undefined
  
  /**
    * The IPv6 ranges for the security group rule.
    */
  var IPV6Range: js.UndefOr[CIDR] = js.undefined
  
  /**
    * The ID of the prefix list for the security group rule.
    */
  var PrefixListId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number.
    */
  var Protocol: js.UndefOr[LengthBoundedString] = js.undefined
  
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes.
    */
  var ToPort: js.UndefOr[IPPortNumber] = js.undefined
}
object SecurityGroupRuleDescription {
  
  inline def apply(): SecurityGroupRuleDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRuleDescription]
  }
  
  extension [Self <: SecurityGroupRuleDescription](x: Self) {
    
    inline def setFromPort(value: IPPortNumber): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setIPV4Range(value: CIDR): Self = StObject.set(x, "IPV4Range", value.asInstanceOf[js.Any])
    
    inline def setIPV4RangeUndefined: Self = StObject.set(x, "IPV4Range", js.undefined)
    
    inline def setIPV6Range(value: CIDR): Self = StObject.set(x, "IPV6Range", value.asInstanceOf[js.Any])
    
    inline def setIPV6RangeUndefined: Self = StObject.set(x, "IPV6Range", js.undefined)
    
    inline def setPrefixListId(value: ResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setProtocol(value: LengthBoundedString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setToPort(value: IPPortNumber): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}

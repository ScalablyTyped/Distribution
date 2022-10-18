package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkAclEntry extends StObject {
  
  /**
    * The IPV4 network range for which to deny or allow access.
    */
  var CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the rule is an egress rule. An egress rule is a rule that applies to traffic that leaves the subnet.
    */
  var Egress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Internet Control Message Protocol (ICMP) type and code for which to deny or allow access.
    */
  var IcmpTypeCode: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.IcmpTypeCode] = js.undefined
  
  /**
    * The IPV6 network range for which to deny or allow access.
    */
  var Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For TCP or UDP protocols, the range of ports that the rule applies to.
    */
  var PortRange: js.UndefOr[PortRangeFromTo] = js.undefined
  
  /**
    * The protocol that the rule applies to. To deny or allow access to all protocols, use the value -1.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the rule is used to allow access or deny access.
    */
  var RuleAction: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The rule number. The rules are processed in order by their number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
}
object AwsEc2NetworkAclEntry {
  
  inline def apply(): AwsEc2NetworkAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkAclEntry]
  }
  
  extension [Self <: AwsEc2NetworkAclEntry](x: Self) {
    
    inline def setCidrBlock(value: NonEmptyString): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
    
    inline def setEgress(value: Boolean): Self = StObject.set(x, "Egress", value.asInstanceOf[js.Any])
    
    inline def setEgressUndefined: Self = StObject.set(x, "Egress", js.undefined)
    
    inline def setIcmpTypeCode(value: IcmpTypeCode): Self = StObject.set(x, "IcmpTypeCode", value.asInstanceOf[js.Any])
    
    inline def setIcmpTypeCodeUndefined: Self = StObject.set(x, "IcmpTypeCode", js.undefined)
    
    inline def setIpv6CidrBlock(value: NonEmptyString): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
    
    inline def setPortRange(value: PortRangeFromTo): Self = StObject.set(x, "PortRange", value.asInstanceOf[js.Any])
    
    inline def setPortRangeUndefined: Self = StObject.set(x, "PortRange", js.undefined)
    
    inline def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setRuleAction(value: NonEmptyString): Self = StObject.set(x, "RuleAction", value.asInstanceOf[js.Any])
    
    inline def setRuleActionUndefined: Self = StObject.set(x, "RuleAction", js.undefined)
    
    inline def setRuleNumber(value: Integer): Self = StObject.set(x, "RuleNumber", value.asInstanceOf[js.Any])
    
    inline def setRuleNumberUndefined: Self = StObject.set(x, "RuleNumber", js.undefined)
  }
}

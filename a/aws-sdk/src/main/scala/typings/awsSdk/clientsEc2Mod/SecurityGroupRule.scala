package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupRule extends StObject {
  
  /**
    * The IPv4 CIDR range.
    */
  var CidrIpv4: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 CIDR range.
    */
  var CidrIpv6: js.UndefOr[String] = js.undefined
  
  /**
    * The security group rule description.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The start of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the security group.
    */
  var GroupId: js.UndefOr[SecurityGroupId] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the security group. 
    */
  var GroupOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number (see Protocol Numbers).  Use -1 to specify all protocols.
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the security group rule is an outbound rule.
    */
  var IsEgress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * Describes the security group that is referenced in the rule.
    */
  var ReferencedGroupInfo: js.UndefOr[ReferencedSecurityGroup] = js.undefined
  
  /**
    * The ID of the security group rule.
    */
  var SecurityGroupRuleId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SecurityGroupRuleId] = js.undefined
  
  /**
    * The tags applied to the security group rule.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The end of port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes. 
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object SecurityGroupRule {
  
  inline def apply(): SecurityGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGroupRule] (val x: Self) extends AnyVal {
    
    inline def setCidrIpv4(value: String): Self = StObject.set(x, "CidrIpv4", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv4Undefined: Self = StObject.set(x, "CidrIpv4", js.undefined)
    
    inline def setCidrIpv6(value: String): Self = StObject.set(x, "CidrIpv6", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv6Undefined: Self = StObject.set(x, "CidrIpv6", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setGroupId(value: SecurityGroupId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setGroupOwnerId(value: String): Self = StObject.set(x, "GroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setGroupOwnerIdUndefined: Self = StObject.set(x, "GroupOwnerId", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setIsEgress(value: Boolean): Self = StObject.set(x, "IsEgress", value.asInstanceOf[js.Any])
    
    inline def setIsEgressUndefined: Self = StObject.set(x, "IsEgress", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setReferencedGroupInfo(value: ReferencedSecurityGroup): Self = StObject.set(x, "ReferencedGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setReferencedGroupInfoUndefined: Self = StObject.set(x, "ReferencedGroupInfo", js.undefined)
    
    inline def setSecurityGroupRuleId(value: SecurityGroupRuleId): Self = StObject.set(x, "SecurityGroupRuleId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupRuleIdUndefined: Self = StObject.set(x, "SecurityGroupRuleId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}

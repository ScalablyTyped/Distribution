package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupIpPermission extends StObject {
  
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 type number. A value of -1 indicates all ICMP/ICMPv6 types. If you specify all ICMP/ICMPv6 types, you must specify all codes. 
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IP protocol name (tcp, udp, icmp, icmpv6) or number. [VPC only] Use -1 to specify all protocols. When authorizing security group rules, specifying -1 or a protocol number other than tcp, udp, icmp, or icmpv6 allows traffic on all ports, regardless of any port range you specify. For tcp, udp, and icmp, you must specify a port range. For icmpv6, the port range is optional. If you omit the port range, traffic for all types and codes is allowed. 
    */
  var IpProtocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The IPv4 ranges.
    */
  var IpRanges: js.UndefOr[AwsEc2SecurityGroupIpRangeList] = js.undefined
  
  /**
    * The IPv6 ranges.
    */
  var Ipv6Ranges: js.UndefOr[AwsEc2SecurityGroupIpv6RangeList] = js.undefined
  
  /**
    * [VPC only] The prefix list IDs for an Amazon Web Services service. With outbound rules, this is the Amazon Web Services service to access through a VPC endpoint from instances associated with the security group.
    */
  var PrefixListIds: js.UndefOr[AwsEc2SecurityGroupPrefixListIdList] = js.undefined
  
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP/ICMPv6 code. A value of -1 indicates all ICMP/ICMPv6 codes. If you specify all ICMP/ICMPv6 types, you must specify all codes.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The security group and Amazon Web Services account ID pairs.
    */
  var UserIdGroupPairs: js.UndefOr[AwsEc2SecurityGroupUserIdGroupPairList] = js.undefined
}
object AwsEc2SecurityGroupIpPermission {
  
  inline def apply(): AwsEc2SecurityGroupIpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2SecurityGroupIpPermission] (val x: Self) extends AnyVal {
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setIpProtocol(value: NonEmptyString): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setIpRanges(value: AwsEc2SecurityGroupIpRangeList): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: AwsEc2SecurityGroupIpRange*): Self = StObject.set(x, "IpRanges", js.Array(value*))
    
    inline def setIpv6Ranges(value: AwsEc2SecurityGroupIpv6RangeList): Self = StObject.set(x, "Ipv6Ranges", value.asInstanceOf[js.Any])
    
    inline def setIpv6RangesUndefined: Self = StObject.set(x, "Ipv6Ranges", js.undefined)
    
    inline def setIpv6RangesVarargs(value: AwsEc2SecurityGroupIpv6Range*): Self = StObject.set(x, "Ipv6Ranges", js.Array(value*))
    
    inline def setPrefixListIds(value: AwsEc2SecurityGroupPrefixListIdList): Self = StObject.set(x, "PrefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsUndefined: Self = StObject.set(x, "PrefixListIds", js.undefined)
    
    inline def setPrefixListIdsVarargs(value: AwsEc2SecurityGroupPrefixListId*): Self = StObject.set(x, "PrefixListIds", js.Array(value*))
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
    
    inline def setUserIdGroupPairs(value: AwsEc2SecurityGroupUserIdGroupPairList): Self = StObject.set(x, "UserIdGroupPairs", value.asInstanceOf[js.Any])
    
    inline def setUserIdGroupPairsUndefined: Self = StObject.set(x, "UserIdGroupPairs", js.undefined)
    
    inline def setUserIdGroupPairsVarargs(value: AwsEc2SecurityGroupUserIdGroupPair*): Self = StObject.set(x, "UserIdGroupPairs", js.Array(value*))
  }
}

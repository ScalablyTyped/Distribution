package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaleIpPermission extends StObject {
  
  /**
    * The start of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IP protocol name (for tcp, udp, and icmp) or number (see Protocol Numbers).
    */
  var IpProtocol: js.UndefOr[String] = js.undefined
  
  /**
    * The IP ranges. Not applicable for stale security group rules.
    */
  var IpRanges: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpRanges] = js.undefined
  
  /**
    * The prefix list IDs. Not applicable for stale security group rules.
    */
  var PrefixListIds: js.UndefOr[PrefixListIdSet] = js.undefined
  
  /**
    * The end of the port range for the TCP and UDP protocols, or an ICMP type number. A value of -1 indicates all ICMP types. 
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The security group pairs. Returns the ID of the referenced security group and VPC, and the ID and status of the VPC peering connection.
    */
  var UserIdGroupPairs: js.UndefOr[UserIdGroupPairSet] = js.undefined
}
object StaleIpPermission {
  
  inline def apply(): StaleIpPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaleIpPermission]
  }
  
  extension [Self <: StaleIpPermission](x: Self) {
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setIpProtocol(value: String): Self = StObject.set(x, "IpProtocol", value.asInstanceOf[js.Any])
    
    inline def setIpProtocolUndefined: Self = StObject.set(x, "IpProtocol", js.undefined)
    
    inline def setIpRanges(value: IpRanges): Self = StObject.set(x, "IpRanges", value.asInstanceOf[js.Any])
    
    inline def setIpRangesUndefined: Self = StObject.set(x, "IpRanges", js.undefined)
    
    inline def setIpRangesVarargs(value: String*): Self = StObject.set(x, "IpRanges", js.Array(value*))
    
    inline def setPrefixListIds(value: PrefixListIdSet): Self = StObject.set(x, "PrefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsUndefined: Self = StObject.set(x, "PrefixListIds", js.undefined)
    
    inline def setPrefixListIdsVarargs(value: String*): Self = StObject.set(x, "PrefixListIds", js.Array(value*))
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
    
    inline def setUserIdGroupPairs(value: UserIdGroupPairSet): Self = StObject.set(x, "UserIdGroupPairs", value.asInstanceOf[js.Any])
    
    inline def setUserIdGroupPairsUndefined: Self = StObject.set(x, "UserIdGroupPairs", js.undefined)
    
    inline def setUserIdGroupPairsVarargs(value: UserIdGroupPair*): Self = StObject.set(x, "UserIdGroupPairs", js.Array(value*))
  }
}

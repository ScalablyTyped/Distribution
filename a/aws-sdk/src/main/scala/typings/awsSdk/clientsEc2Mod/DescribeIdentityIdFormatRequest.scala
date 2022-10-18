package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityIdFormatRequest extends StObject {
  
  /**
    * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
    */
  var PrincipalArn: String
  
  /**
    * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options | elastic-ip-allocation | elastic-ip-association | export-task | flow-log | image | import-task | instance | internet-gateway | network-acl | network-acl-association | network-interface | network-interface-attachment | prefix-list | reservation | route-table | route-table-association | security-group | snapshot | subnet | subnet-cidr-block-association | volume | vpc | vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway 
    */
  var Resource: js.UndefOr[String] = js.undefined
}
object DescribeIdentityIdFormatRequest {
  
  inline def apply(PrincipalArn: String): DescribeIdentityIdFormatRequest = {
    val __obj = js.Dynamic.literal(PrincipalArn = PrincipalArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityIdFormatRequest]
  }
  
  extension [Self <: DescribeIdentityIdFormatRequest](x: Self) {
    
    inline def setPrincipalArn(value: String): Self = StObject.set(x, "PrincipalArn", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
  }
}

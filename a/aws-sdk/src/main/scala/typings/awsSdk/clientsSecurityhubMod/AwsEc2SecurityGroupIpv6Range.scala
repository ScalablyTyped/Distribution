package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupIpv6Range extends StObject {
  
  /**
    * The IPv6 CIDR range. You can specify either a CIDR range or a source security group, but not both. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SecurityGroupIpv6Range {
  
  inline def apply(): AwsEc2SecurityGroupIpv6Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpv6Range]
  }
  
  extension [Self <: AwsEc2SecurityGroupIpv6Range](x: Self) {
    
    inline def setCidrIpv6(value: NonEmptyString): Self = StObject.set(x, "CidrIpv6", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv6Undefined: Self = StObject.set(x, "CidrIpv6", js.undefined)
  }
}

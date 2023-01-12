package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2SecurityGroupIpRange extends StObject {
  
  /**
    * The IPv4 CIDR range. You can specify either a CIDR range or a source security group, but not both. To specify a single IPv4 address, use the /32 prefix length.
    */
  var CidrIp: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2SecurityGroupIpRange {
  
  inline def apply(): AwsEc2SecurityGroupIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2SecurityGroupIpRange] (val x: Self) extends AnyVal {
    
    inline def setCidrIp(value: NonEmptyString): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    inline def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
  }
}

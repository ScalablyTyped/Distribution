package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6Range extends StObject {
  
  /**
    * The IPv6 CIDR range. You can either specify a CIDR range or a source security group, not both. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the security group rule that references this IPv6 address range. Constraints: Up to 255 characters in length. Allowed characters are a-z, A-Z, 0-9, spaces, and ._-:/()#,@[]+=&amp;;{}!$*
    */
  var Description: js.UndefOr[String] = js.undefined
}
object Ipv6Range {
  
  inline def apply(): Ipv6Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6Range]
  }
  
  extension [Self <: Ipv6Range](x: Self) {
    
    inline def setCidrIpv6(value: String): Self = StObject.set(x, "CidrIpv6", value.asInstanceOf[js.Any])
    
    inline def setCidrIpv6Undefined: Self = StObject.set(x, "CidrIpv6", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}

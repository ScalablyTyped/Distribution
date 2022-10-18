package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcInfoIpv6CidrBlockSetDetails extends StObject {
  
  /**
    * The IPv6 CIDR block for the VPC. 
    */
  var Ipv6CidrBlock: js.UndefOr[NonEmptyString] = js.undefined
}
object VpcInfoIpv6CidrBlockSetDetails {
  
  inline def apply(): VpcInfoIpv6CidrBlockSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcInfoIpv6CidrBlockSetDetails]
  }
  
  extension [Self <: VpcInfoIpv6CidrBlockSetDetails](x: Self) {
    
    inline def setIpv6CidrBlock(value: NonEmptyString): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
  }
}

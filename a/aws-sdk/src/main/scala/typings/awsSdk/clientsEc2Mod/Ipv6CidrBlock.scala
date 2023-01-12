package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ipv6CidrBlock extends StObject {
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.undefined
}
object Ipv6CidrBlock {
  
  inline def apply(): Ipv6CidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ipv6CidrBlock] (val x: Self) extends AnyVal {
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "Ipv6CidrBlock", js.undefined)
  }
}

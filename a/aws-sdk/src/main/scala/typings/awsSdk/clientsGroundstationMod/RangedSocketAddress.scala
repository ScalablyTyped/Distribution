package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedSocketAddress extends StObject {
  
  /**
    * IPv4 socket address.
    */
  var name: IpV4Address
  
  /**
    * Port range of a socket address.
    */
  var portRange: IntegerRange
}
object RangedSocketAddress {
  
  inline def apply(name: IpV4Address, portRange: IntegerRange): RangedSocketAddress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], portRange = portRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedSocketAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangedSocketAddress] (val x: Self) extends AnyVal {
    
    inline def setName(value: IpV4Address): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPortRange(value: IntegerRange): Self = StObject.set(x, "portRange", value.asInstanceOf[js.Any])
  }
}

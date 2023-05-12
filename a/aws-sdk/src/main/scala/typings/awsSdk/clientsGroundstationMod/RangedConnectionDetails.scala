package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangedConnectionDetails extends StObject {
  
  /**
    * Maximum transmission unit (MTU) size in bytes of a dataflow endpoint.
    */
  var mtu: js.UndefOr[RangedConnectionDetailsMtuInteger] = js.undefined
  
  /**
    * A ranged socket address.
    */
  var socketAddress: RangedSocketAddress
}
object RangedConnectionDetails {
  
  inline def apply(socketAddress: RangedSocketAddress): RangedConnectionDetails = {
    val __obj = js.Dynamic.literal(socketAddress = socketAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangedConnectionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangedConnectionDetails] (val x: Self) extends AnyVal {
    
    inline def setMtu(value: RangedConnectionDetailsMtuInteger): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setSocketAddress(value: RangedSocketAddress): Self = StObject.set(x, "socketAddress", value.asInstanceOf[js.Any])
  }
}

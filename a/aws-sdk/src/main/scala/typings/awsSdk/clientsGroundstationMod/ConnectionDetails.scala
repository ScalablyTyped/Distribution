package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionDetails extends StObject {
  
  /**
    * Maximum transmission unit (MTU) size in bytes of a dataflow endpoint.
    */
  var mtu: js.UndefOr[Integer] = js.undefined
  
  /**
    * A socket address.
    */
  var socketAddress: SocketAddress
}
object ConnectionDetails {
  
  inline def apply(socketAddress: SocketAddress): ConnectionDetails = {
    val __obj = js.Dynamic.literal(socketAddress = socketAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionDetails] (val x: Self) extends AnyVal {
    
    inline def setMtu(value: Integer): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setSocketAddress(value: SocketAddress): Self = StObject.set(x, "socketAddress", value.asInstanceOf[js.Any])
  }
}

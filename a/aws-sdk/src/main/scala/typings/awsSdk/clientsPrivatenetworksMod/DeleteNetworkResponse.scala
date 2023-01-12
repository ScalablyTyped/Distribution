package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkResponse extends StObject {
  
  /**
    * Information about the network.
    */
  var network: Network
}
object DeleteNetworkResponse {
  
  inline def apply(network: Network): DeleteNetworkResponse = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNetworkResponse] (val x: Self) extends AnyVal {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfaceResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the network interface.
    */
  var NetworkInterface: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInterface] = js.undefined
}
object CreateNetworkInterfaceResult {
  
  inline def apply(): CreateNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfaceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkInterfaceResult] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setNetworkInterface(value: NetworkInterface): Self = StObject.set(x, "NetworkInterface", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "NetworkInterface", js.undefined)
  }
}

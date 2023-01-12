package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkProfileResponse extends StObject {
  
  /**
    * The network profile associated with a device.
    */
  var NetworkProfile: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.NetworkProfile] = js.undefined
}
object GetNetworkProfileResponse {
  
  inline def apply(): GetNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "NetworkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "NetworkProfile", js.undefined)
  }
}

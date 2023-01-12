package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkProfileResult extends StObject {
  
  /**
    * The network profile that is returned by the create network profile request.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}
object CreateNetworkProfileResult {
  
  inline def apply(): CreateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkProfileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkProfileResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}

package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkProfileResult extends StObject {
  
  /**
    * The network profile.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}
object GetNetworkProfileResult {
  
  inline def apply(): GetNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkProfileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkProfileResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}

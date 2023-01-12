package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetwork] = js.undefined
}
object DeleteGlobalNetworkResponse {
  
  inline def apply(): DeleteGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalNetworkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalNetworkResponse] (val x: Self) extends AnyVal {
    
    inline def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}

package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetwork] = js.undefined
}
object CreateGlobalNetworkResponse {
  
  inline def apply(): CreateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalNetworkResponse]
  }
  
  extension [Self <: CreateGlobalNetworkResponse](x: Self) {
    
    inline def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}

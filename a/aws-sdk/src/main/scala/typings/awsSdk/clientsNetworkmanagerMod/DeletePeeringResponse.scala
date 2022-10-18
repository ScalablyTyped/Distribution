package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePeeringResponse extends StObject {
  
  /**
    * Information about a deleted peering connection.
    */
  var Peering: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.Peering] = js.undefined
}
object DeletePeeringResponse {
  
  inline def apply(): DeletePeeringResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletePeeringResponse]
  }
  
  extension [Self <: DeletePeeringResponse](x: Self) {
    
    inline def setPeering(value: Peering): Self = StObject.set(x, "Peering", value.asInstanceOf[js.Any])
    
    inline def setPeeringUndefined: Self = StObject.set(x, "Peering", js.undefined)
  }
}

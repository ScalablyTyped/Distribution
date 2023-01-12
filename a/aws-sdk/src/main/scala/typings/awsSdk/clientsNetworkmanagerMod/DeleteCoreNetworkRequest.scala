package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreNetworkRequest extends StObject {
  
  /**
    * The network ID of the deleted core network.
    */
  var CoreNetworkId: typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
}
object DeleteCoreNetworkRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId): DeleteCoreNetworkRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCoreNetworkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCoreNetworkRequest] (val x: Self) extends AnyVal {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
  }
}

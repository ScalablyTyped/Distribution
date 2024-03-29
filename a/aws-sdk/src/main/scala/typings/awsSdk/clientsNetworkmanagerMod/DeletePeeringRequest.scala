package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePeeringRequest extends StObject {
  
  /**
    * The ID of the peering connection to delete.
    */
  var PeeringId: typings.awsSdk.clientsNetworkmanagerMod.PeeringId
}
object DeletePeeringRequest {
  
  inline def apply(PeeringId: PeeringId): DeletePeeringRequest = {
    val __obj = js.Dynamic.literal(PeeringId = PeeringId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePeeringRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePeeringRequest] (val x: Self) extends AnyVal {
    
    inline def setPeeringId(value: PeeringId): Self = StObject.set(x, "PeeringId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOutboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the outbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.clientsEsMod.CrossClusterSearchConnectionId
}
object DeleteOutboundCrossClusterSearchConnectionRequest {
  
  inline def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteOutboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOutboundCrossClusterSearchConnectionRequest]
  }
  
  extension [Self <: DeleteOutboundCrossClusterSearchConnectionRequest](x: Self) {
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}

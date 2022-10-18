package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundCrossClusterSearchConnectionRequest extends StObject {
  
  /**
    * The id of the inbound connection that you want to permanently delete.
    */
  var CrossClusterSearchConnectionId: typings.awsSdk.clientsEsMod.CrossClusterSearchConnectionId
}
object DeleteInboundCrossClusterSearchConnectionRequest {
  
  inline def apply(CrossClusterSearchConnectionId: CrossClusterSearchConnectionId): DeleteInboundCrossClusterSearchConnectionRequest = {
    val __obj = js.Dynamic.literal(CrossClusterSearchConnectionId = CrossClusterSearchConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionRequest]
  }
  
  extension [Self <: DeleteInboundCrossClusterSearchConnectionRequest](x: Self) {
    
    inline def setCrossClusterSearchConnectionId(value: CrossClusterSearchConnectionId): Self = StObject.set(x, "CrossClusterSearchConnectionId", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnection of deleted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
}
object DeleteInboundCrossClusterSearchConnectionResponse {
  
  inline def apply(): DeleteInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInboundCrossClusterSearchConnectionResponse]
  }
  
  extension [Self <: DeleteInboundCrossClusterSearchConnectionResponse](x: Self) {
    
    inline def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}

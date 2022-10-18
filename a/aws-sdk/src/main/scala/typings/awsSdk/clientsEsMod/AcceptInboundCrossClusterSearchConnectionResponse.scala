package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptInboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnection of accepted inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
}
object AcceptInboundCrossClusterSearchConnectionResponse {
  
  inline def apply(): AcceptInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptInboundCrossClusterSearchConnectionResponse]
  }
  
  extension [Self <: AcceptInboundCrossClusterSearchConnectionResponse](x: Self) {
    
    inline def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}

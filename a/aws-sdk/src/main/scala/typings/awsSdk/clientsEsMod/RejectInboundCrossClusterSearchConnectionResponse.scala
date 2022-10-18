package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectInboundCrossClusterSearchConnectionResponse extends StObject {
  
  /**
    * Specifies the InboundCrossClusterSearchConnection of rejected inbound connection. 
    */
  var CrossClusterSearchConnection: js.UndefOr[InboundCrossClusterSearchConnection] = js.undefined
}
object RejectInboundCrossClusterSearchConnectionResponse {
  
  inline def apply(): RejectInboundCrossClusterSearchConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectInboundCrossClusterSearchConnectionResponse]
  }
  
  extension [Self <: RejectInboundCrossClusterSearchConnectionResponse](x: Self) {
    
    inline def setCrossClusterSearchConnection(value: InboundCrossClusterSearchConnection): Self = StObject.set(x, "CrossClusterSearchConnection", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionUndefined: Self = StObject.set(x, "CrossClusterSearchConnection", js.undefined)
  }
}

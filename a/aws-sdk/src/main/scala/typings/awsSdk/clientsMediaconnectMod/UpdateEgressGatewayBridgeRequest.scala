package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEgressGatewayBridgeRequest extends StObject {
  
  /**
    * Update an existing egress-type bridge.
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
}
object UpdateEgressGatewayBridgeRequest {
  
  inline def apply(): UpdateEgressGatewayBridgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEgressGatewayBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEgressGatewayBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
  }
}

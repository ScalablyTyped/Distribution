package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIngressGatewayBridgeRequest extends StObject {
  
  /**
    * The maximum expected bitrate (in bps).
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum number of expected outputs.
    */
  var MaxOutputs: js.UndefOr[integer] = js.undefined
}
object UpdateIngressGatewayBridgeRequest {
  
  inline def apply(): UpdateIngressGatewayBridgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIngressGatewayBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateIngressGatewayBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMaxOutputs(value: integer): Self = StObject.set(x, "MaxOutputs", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputsUndefined: Self = StObject.set(x, "MaxOutputs", js.undefined)
  }
}

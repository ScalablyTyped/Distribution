package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddIngressGatewayBridgeRequest extends StObject {
  
  /**
    * The maximum expected bitrate (in bps).
    */
  var MaxBitrate: integer
  
  /**
    * The maximum number of expected outputs.
    */
  var MaxOutputs: integer
}
object AddIngressGatewayBridgeRequest {
  
  inline def apply(MaxBitrate: integer, MaxOutputs: integer): AddIngressGatewayBridgeRequest = {
    val __obj = js.Dynamic.literal(MaxBitrate = MaxBitrate.asInstanceOf[js.Any], MaxOutputs = MaxOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddIngressGatewayBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddIngressGatewayBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputs(value: integer): Self = StObject.set(x, "MaxOutputs", value.asInstanceOf[js.Any])
  }
}

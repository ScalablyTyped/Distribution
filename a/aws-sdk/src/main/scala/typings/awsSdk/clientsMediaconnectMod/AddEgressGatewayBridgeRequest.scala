package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddEgressGatewayBridgeRequest extends StObject {
  
  /**
    * The maximum expected bitrate (in bps).
    */
  var MaxBitrate: integer
}
object AddEgressGatewayBridgeRequest {
  
  inline def apply(MaxBitrate: integer): AddEgressGatewayBridgeRequest = {
    val __obj = js.Dynamic.literal(MaxBitrate = MaxBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddEgressGatewayBridgeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddEgressGatewayBridgeRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
  }
}

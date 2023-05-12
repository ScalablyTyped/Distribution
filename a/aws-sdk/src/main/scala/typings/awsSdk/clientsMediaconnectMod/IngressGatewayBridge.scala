package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngressGatewayBridge extends StObject {
  
  /**
    * The ID of the instance running this bridge.
    */
  var InstanceId: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum expected bitrate (in bps) of the ingress bridge.
    */
  var MaxBitrate: integer
  
  /**
    * The maximum number of outputs on the ingress bridge.
    */
  var MaxOutputs: integer
}
object IngressGatewayBridge {
  
  inline def apply(MaxBitrate: integer, MaxOutputs: integer): IngressGatewayBridge = {
    val __obj = js.Dynamic.literal(MaxBitrate = MaxBitrate.asInstanceOf[js.Any], MaxOutputs = MaxOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngressGatewayBridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngressGatewayBridge] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: string): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxOutputs(value: integer): Self = StObject.set(x, "MaxOutputs", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EgressGatewayBridge extends StObject {
  
  /**
    * The ID of the instance running this bridge.
    */
  var InstanceId: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum expected bitrate (in bps) of the egress bridge.
    */
  var MaxBitrate: integer
}
object EgressGatewayBridge {
  
  inline def apply(MaxBitrate: integer): EgressGatewayBridge = {
    val __obj = js.Dynamic.literal(MaxBitrate = MaxBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressGatewayBridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EgressGatewayBridge] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: string): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
  }
}

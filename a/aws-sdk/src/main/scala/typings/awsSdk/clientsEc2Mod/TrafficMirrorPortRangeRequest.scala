package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorPortRangeRequest extends StObject {
  
  /**
    * The first port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var FromPort: js.UndefOr[Integer] = js.undefined
  
  /**
    * The last port in the Traffic Mirror port range. This applies to the TCP and UDP protocols.
    */
  var ToPort: js.UndefOr[Integer] = js.undefined
}
object TrafficMirrorPortRangeRequest {
  
  inline def apply(): TrafficMirrorPortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorPortRangeRequest]
  }
  
  extension [Self <: TrafficMirrorPortRangeRequest](x: Self) {
    
    inline def setFromPort(value: Integer): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setToPort(value: Integer): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}

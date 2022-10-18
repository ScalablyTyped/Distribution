package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficMirrorTargetResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Traffic Mirror target.
    */
  var TrafficMirrorTarget: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficMirrorTarget] = js.undefined
}
object CreateTrafficMirrorTargetResult {
  
  inline def apply(): CreateTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorTargetResult]
  }
  
  extension [Self <: CreateTrafficMirrorTargetResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setTrafficMirrorTarget(value: TrafficMirrorTarget): Self = StObject.set(x, "TrafficMirrorTarget", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorTargetUndefined: Self = StObject.set(x, "TrafficMirrorTarget", js.undefined)
  }
}

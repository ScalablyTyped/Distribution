package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTrafficMirrorSessionResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to ensure idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficMirrorSession] = js.undefined
}
object CreateTrafficMirrorSessionResult {
  
  inline def apply(): CreateTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTrafficMirrorSessionResult]
  }
  
  extension [Self <: CreateTrafficMirrorSessionResult](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setTrafficMirrorSession(value: TrafficMirrorSession): Self = StObject.set(x, "TrafficMirrorSession", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorSessionUndefined: Self = StObject.set(x, "TrafficMirrorSession", js.undefined)
  }
}

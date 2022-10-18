package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTrafficMirrorSessionResult extends StObject {
  
  /**
    * Information about the Traffic Mirror session.
    */
  var TrafficMirrorSession: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficMirrorSession] = js.undefined
}
object ModifyTrafficMirrorSessionResult {
  
  inline def apply(): ModifyTrafficMirrorSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorSessionResult]
  }
  
  extension [Self <: ModifyTrafficMirrorSessionResult](x: Self) {
    
    inline def setTrafficMirrorSession(value: TrafficMirrorSession): Self = StObject.set(x, "TrafficMirrorSession", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorSessionUndefined: Self = StObject.set(x, "TrafficMirrorSession", js.undefined)
  }
}

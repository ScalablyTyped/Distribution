package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTrafficMirrorTargetResult extends StObject {
  
  /**
    * The ID of the deleted Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
}
object DeleteTrafficMirrorTargetResult {
  
  inline def apply(): DeleteTrafficMirrorTargetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorTargetResult]
  }
  
  extension [Self <: DeleteTrafficMirrorTargetResult](x: Self) {
    
    inline def setTrafficMirrorTargetId(value: String): Self = StObject.set(x, "TrafficMirrorTargetId", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorTargetIdUndefined: Self = StObject.set(x, "TrafficMirrorTargetId", js.undefined)
  }
}

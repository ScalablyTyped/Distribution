package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReasonType extends StObject {
  
  var reason: Any
  
  var `type`: error
}
object ReasonType {
  
  inline def apply(reason: Any): ReasonType = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[ReasonType]
  }
  
  extension [Self <: ReasonType](x: Self) {
    
    inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

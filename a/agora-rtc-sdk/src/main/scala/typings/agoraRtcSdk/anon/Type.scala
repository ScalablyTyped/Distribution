package typings.agoraRtcSdk.anon

import typings.agoraRtcSdk.agoraRtcSdkStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var reason: js.Any
  
  var `type`: error
}
object Type {
  
  inline def apply(reason: js.Any): Type = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

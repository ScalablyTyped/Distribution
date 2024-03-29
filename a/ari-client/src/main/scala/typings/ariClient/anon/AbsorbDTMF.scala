package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsorbDTMF extends StObject {
  
  var absorbDTMF: js.UndefOr[Boolean] = js.undefined
  
  var bridgeId: String
  
  var channel: String | js.Array[String]
  
  var mute: js.UndefOr[Boolean] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
}
object AbsorbDTMF {
  
  inline def apply(bridgeId: String, channel: String | js.Array[String]): AbsorbDTMF = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsorbDTMF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbsorbDTMF] (val x: Self) extends AnyVal {
    
    inline def setAbsorbDTMF(value: Boolean): Self = StObject.set(x, "absorbDTMF", value.asInstanceOf[js.Any])
    
    inline def setAbsorbDTMFUndefined: Self = StObject.set(x, "absorbDTMF", js.undefined)
    
    inline def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    inline def setChannel(value: String | js.Array[String]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelVarargs(value: String*): Self = StObject.set(x, "channel", js.Array(value*))
    
    inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}

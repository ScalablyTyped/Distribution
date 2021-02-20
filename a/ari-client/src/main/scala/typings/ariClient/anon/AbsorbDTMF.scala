package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsorbDTMF extends StObject {
  
  var absorbDTMF: js.UndefOr[Boolean] = js.native
  
  var bridgeId: String = js.native
  
  var channel: String | js.Array[String] = js.native
  
  var mute: js.UndefOr[Boolean] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object AbsorbDTMF {
  
  @scala.inline
  def apply(bridgeId: String, channel: String | js.Array[String]): AbsorbDTMF = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsorbDTMF]
  }
  
  @scala.inline
  implicit class AbsorbDTMFMutableBuilder[Self <: AbsorbDTMF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsorbDTMF(value: Boolean): Self = StObject.set(x, "absorbDTMF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsorbDTMFUndefined: Self = StObject.set(x, "absorbDTMF", js.undefined)
    
    @scala.inline
    def setBridgeId(value: String): Self = StObject.set(x, "bridgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String | js.Array[String]): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelVarargs(value: String*): Self = StObject.set(x, "channel", js.Array(value :_*))
    
    @scala.inline
    def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}

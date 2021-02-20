package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mute extends StObject {
  
  var absorbDTMF: js.UndefOr[Boolean] = js.native
  
  var channel: String | js.Array[String] = js.native
  
  var mute: js.UndefOr[Boolean] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object Mute {
  
  @scala.inline
  def apply(channel: String | js.Array[String]): Mute = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mute]
  }
  
  @scala.inline
  implicit class MuteMutableBuilder[Self <: Mute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsorbDTMF(value: Boolean): Self = StObject.set(x, "absorbDTMF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsorbDTMFUndefined: Self = StObject.set(x, "absorbDTMF", js.undefined)
    
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

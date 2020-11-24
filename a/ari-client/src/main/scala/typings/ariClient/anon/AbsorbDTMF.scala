package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsorbDTMF extends js.Object {
  
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
  implicit class AbsorbDTMFOps[Self <: AbsorbDTMF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBridgeId(value: String): Self = this.set("bridgeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelVarargs(value: String*): Self = this.set("channel", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: String | js.Array[String]): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsorbDTMF(value: Boolean): Self = this.set("absorbDTMF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsorbDTMF: Self = this.set("absorbDTMF", js.undefined)
    
    @scala.inline
    def setMute(value: Boolean): Self = this.set("mute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMute: Self = this.set("mute", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}

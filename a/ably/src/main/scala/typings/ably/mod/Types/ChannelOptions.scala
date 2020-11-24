package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelOptions extends js.Object {
  
  var cipher: js.UndefOr[CipherParamOptions | CipherParams] = js.native
  
  var modes: js.UndefOr[ChannelModes] = js.native
  
  var params: js.UndefOr[ChannelParams] = js.native
}
object ChannelOptions {
  
  @scala.inline
  def apply(): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelOptions]
  }
  
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
    
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
    def setCipher(value: CipherParamOptions | CipherParams): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setModesVarargs(value: ChannelMode*): Self = this.set("modes", js.Array(value :_*))
    
    @scala.inline
    def setModes(value: ChannelModes): Self = this.set("modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModes: Self = this.set("modes", js.undefined)
    
    @scala.inline
    def setParams(value: ChannelParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}

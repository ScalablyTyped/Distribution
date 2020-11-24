package typings.autoprefixerCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var browsers: js.UndefOr[js.Array[String]] = js.native
  
  var cascade: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setBrowsersVarargs(value: String*): Self = this.set("browsers", js.Array(value :_*))
    
    @scala.inline
    def setBrowsers(value: js.Array[String]): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowsers: Self = this.set("browsers", js.undefined)
    
    @scala.inline
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCascade: Self = this.set("cascade", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
  }
}

package typings.anyproxy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebInterfaceOptions extends js.Object {
  
  /** If enable web interface, default to false */
  var enable: js.UndefOr[Boolean] = js.native
  
  /** Port number for web interface */
  var webPort: js.UndefOr[Double] = js.native
}
object WebInterfaceOptions {
  
  @scala.inline
  def apply(): WebInterfaceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebInterfaceOptions]
  }
  
  @scala.inline
  implicit class WebInterfaceOptionsOps[Self <: WebInterfaceOptions] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
    
    @scala.inline
    def setWebPort(value: Double): Self = this.set("webPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPort: Self = this.set("webPort", js.undefined)
  }
}

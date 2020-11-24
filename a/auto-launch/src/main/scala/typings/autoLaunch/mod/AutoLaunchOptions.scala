package typings.autoLaunch.mod

import typings.autoLaunch.anon.UseLaunchAgent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoLaunchOptions extends js.Object {
  
  /**
    * Hidden on launch. Default is `false`.
    */
  var isHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * For Mac-only options.
    */
  var mac: js.UndefOr[UseLaunchAgent] = js.native
  
  /**
    * Application name.
    */
  var name: String = js.native
  
  /**
    * Path to application. Default is `process.execPath`.
    */
  var path: js.UndefOr[String] = js.native
}
object AutoLaunchOptions {
  
  @scala.inline
  def apply(name: String): AutoLaunchOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoLaunchOptions]
  }
  
  @scala.inline
  implicit class AutoLaunchOptionsOps[Self <: AutoLaunchOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHidden: Self = this.set("isHidden", js.undefined)
    
    @scala.inline
    def setMac(value: UseLaunchAgent): Self = this.set("mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}

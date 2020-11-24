package typings.appBuilderLib.electronOsxSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSignOptions extends js.Object {
  
  var app: String = js.native
  
  var identity: js.UndefOr[String] = js.native
  
  var keychain: js.UndefOr[String] = js.native
  
  var platform: js.UndefOr[String] = js.native
}
object BaseSignOptions {
  
  @scala.inline
  def apply(app: String): BaseSignOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSignOptions]
  }
  
  @scala.inline
  implicit class BaseSignOptionsOps[Self <: BaseSignOptions] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    
    @scala.inline
    def setKeychain(value: String): Self = this.set("keychain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeychain: Self = this.set("keychain", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
  }
}

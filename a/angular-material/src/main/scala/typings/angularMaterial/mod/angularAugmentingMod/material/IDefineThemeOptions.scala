package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDefineThemeOptions extends js.Object {
  
  var accent: js.UndefOr[String] = js.native
  
  var background: js.UndefOr[String] = js.native
  
  var dark: js.UndefOr[Boolean] = js.native
  
  var primary: js.UndefOr[String] = js.native
  
  var warn: js.UndefOr[String] = js.native
}
object IDefineThemeOptions {
  
  @scala.inline
  def apply(): IDefineThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDefineThemeOptions]
  }
  
  @scala.inline
  implicit class IDefineThemeOptionsOps[Self <: IDefineThemeOptions] (val x: Self) extends AnyVal {
    
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
    def setAccent(value: String): Self = this.set("accent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccent: Self = this.set("accent", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setDark(value: Boolean): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setWarn(value: String): Self = this.set("warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarn: Self = this.set("warn", js.undefined)
  }
}

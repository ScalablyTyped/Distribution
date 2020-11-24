package typings.angularMaterial.mod.angularAugmentingMod.material

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThemeConfig extends js.Object {
  
  var alwaysWatchTheme: Boolean = js.native
  
  var defaultTheme: String = js.native
  
  var disableTheming: Boolean = js.native
  
  var generateOnDemand: Boolean = js.native
  
  var nonce: String = js.native
  
  var registeredStyles: js.Array[String] = js.native
}
object IThemeConfig {
  
  @scala.inline
  def apply(
    alwaysWatchTheme: Boolean,
    defaultTheme: String,
    disableTheming: Boolean,
    generateOnDemand: Boolean,
    nonce: String,
    registeredStyles: js.Array[String]
  ): IThemeConfig = {
    val __obj = js.Dynamic.literal(alwaysWatchTheme = alwaysWatchTheme.asInstanceOf[js.Any], defaultTheme = defaultTheme.asInstanceOf[js.Any], disableTheming = disableTheming.asInstanceOf[js.Any], generateOnDemand = generateOnDemand.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], registeredStyles = registeredStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeConfig]
  }
  
  @scala.inline
  implicit class IThemeConfigOps[Self <: IThemeConfig] (val x: Self) extends AnyVal {
    
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
    def setAlwaysWatchTheme(value: Boolean): Self = this.set("alwaysWatchTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTheme(value: String): Self = this.set("defaultTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTheming(value: Boolean): Self = this.set("disableTheming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateOnDemand(value: Boolean): Self = this.set("generateOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredStylesVarargs(value: String*): Self = this.set("registeredStyles", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredStyles(value: js.Array[String]): Self = this.set("registeredStyles", value.asInstanceOf[js.Any])
  }
}

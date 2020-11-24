package typings.adobeEsModulesMiddleware.mod.karmaAugmentingMod

import typings.adobeEsModulesMiddleware.mod.MiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigOptions extends js.Object {
  
  /**
    * used in Karma to aid in testing es-modules in the browser
    * see {@link https://github.com/adobe/es-modules-middleware}
    */
  var esModulesMiddleware: js.UndefOr[MiddlewareOptions] = js.native
}
object ConfigOptions {
  
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setEsModulesMiddleware(value: MiddlewareOptions): Self = this.set("esModulesMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsModulesMiddleware: Self = this.set("esModulesMiddleware", js.undefined)
  }
}

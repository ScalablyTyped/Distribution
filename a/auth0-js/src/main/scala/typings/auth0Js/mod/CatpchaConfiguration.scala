package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatpchaConfiguration extends js.Object {
  
  /**
    * The ISO code of the language for recaptcha
    * @default 'en'
    */
  var lang: js.UndefOr[String] = js.native
  
  /**
    *  An object containaing templates for each captcha provider
    */
  var templates: js.UndefOr[CaptchaTemplates] = js.native
}
object CatpchaConfiguration {
  
  @scala.inline
  def apply(): CatpchaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatpchaConfiguration]
  }
  
  @scala.inline
  implicit class CatpchaConfigurationOps[Self <: CatpchaConfiguration] (val x: Self) extends AnyVal {
    
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
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setTemplates(value: CaptchaTemplates): Self = this.set("templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
}

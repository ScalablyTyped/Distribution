package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatpchaConfiguration extends StObject {
  
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
  implicit class CatpchaConfigurationMutableBuilder[Self <: CatpchaConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setTemplates(value: CaptchaTemplates): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
  }
}

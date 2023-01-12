package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatpchaConfiguration extends StObject {
  
  /**
    * The ISO code of the language for recaptcha
    * @default 'en'
    */
  var lang: js.UndefOr[String] = js.undefined
  
  /**
    *  An object containaing templates for each captcha provider
    */
  var templates: js.UndefOr[CaptchaTemplates] = js.undefined
}
object CatpchaConfiguration {
  
  inline def apply(): CatpchaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatpchaConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatpchaConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setTemplates(value: CaptchaTemplates): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
    
    inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
  }
}

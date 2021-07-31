package typings.auth0Js.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptchaTemplates extends StObject {
  
  /**
    * Template function receiving the challenge and returning an string
    */
  var auth0: js.UndefOr[js.Function1[/* challenge */ Auth0Challenge, String]] = js.undefined
  
  def error(error: Error): String
  
  /**
    * Template function receiving the challenge and returning an string
    */
  var recaptcha_v2: js.UndefOr[js.Function1[/* challenge */ Auth0Challenge, String]] = js.undefined
}
object CaptchaTemplates {
  
  @scala.inline
  def apply(error: Error => String): CaptchaTemplates = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[CaptchaTemplates]
  }
  
  @scala.inline
  implicit class CaptchaTemplatesMutableBuilder[Self <: CaptchaTemplates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth0(value: /* challenge */ Auth0Challenge => String): Self = StObject.set(x, "auth0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuth0Undefined: Self = StObject.set(x, "auth0", js.undefined)
    
    @scala.inline
    def setError(value: Error => String): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecaptcha_v2(value: /* challenge */ Auth0Challenge => String): Self = StObject.set(x, "recaptcha_v2", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRecaptcha_v2Undefined: Self = StObject.set(x, "recaptcha_v2", js.undefined)
  }
}

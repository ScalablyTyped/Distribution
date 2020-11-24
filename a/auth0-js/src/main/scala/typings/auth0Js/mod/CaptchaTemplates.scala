package typings.auth0Js.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CaptchaTemplates extends js.Object {
  
  /**
    * Template function receiving the challenge and returning an string
    */
  var auth0: js.UndefOr[js.Function1[/* challenge */ Auth0Challenge, String]] = js.native
  
  def error(error: Error): String = js.native
  
  /**
    * Template function receiving the challenge and returning an string
    */
  var recaptcha_v2: js.UndefOr[js.Function1[/* challenge */ Auth0Challenge, String]] = js.native
}
object CaptchaTemplates {
  
  @scala.inline
  def apply(error: Error => String): CaptchaTemplates = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
    __obj.asInstanceOf[CaptchaTemplates]
  }
  
  @scala.inline
  implicit class CaptchaTemplatesOps[Self <: CaptchaTemplates] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error => String): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuth0(value: /* challenge */ Auth0Challenge => String): Self = this.set("auth0", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAuth0: Self = this.set("auth0", js.undefined)
    
    @scala.inline
    def setRecaptcha_v2(value: /* challenge */ Auth0Challenge => String): Self = this.set("recaptcha_v2", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRecaptcha_v2: Self = this.set("recaptcha_v2", js.undefined)
  }
}

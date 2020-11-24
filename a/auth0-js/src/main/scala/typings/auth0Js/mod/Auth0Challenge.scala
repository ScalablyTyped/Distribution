package typings.auth0Js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.auth0Js.auth0JsStrings.auth0
import typings.auth0Js.auth0JsStrings.code
import typings.auth0Js.auth0JsStrings.recaptcha_v2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0Challenge
  extends /* other */ StringDictionary[js.Any] {
  
  var image: String = js.native
  
  var provider: auth0 | recaptcha_v2 = js.native
  
  var required: Boolean = js.native
  
  var `type`: code = js.native
}
object Auth0Challenge {
  
  @scala.inline
  def apply(image: String, provider: auth0 | recaptcha_v2, required: Boolean, `type`: code): Auth0Challenge = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Challenge]
  }
  
  @scala.inline
  implicit class Auth0ChallengeOps[Self <: Auth0Challenge] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: auth0 | recaptcha_v2): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

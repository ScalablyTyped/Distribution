package typings.auth0Lock

import typings.auth0Lock.anon.Hint
import typings.auth0Lock.auth0LockStrings.`false`
import typings.auth0Lock.auth0LockStrings.`true`
import typings.auth0Lock.auth0LockStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockAdditionalCheckboxSignUpField extends Auth0LockAdditionalSignUpField {
  
  var icon: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var placeholder: String = js.native
  
  var prefill: `true` | `false` = js.native
  
  var `type`: js.UndefOr[checkbox] = js.native
  
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.native
}
object Auth0LockAdditionalCheckboxSignUpField {
  
  @scala.inline
  def apply(name: String, placeholder: String, prefill: `true` | `false`): Auth0LockAdditionalCheckboxSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], prefill = prefill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalCheckboxSignUpField]
  }
  
  @scala.inline
  implicit class Auth0LockAdditionalCheckboxSignUpFieldOps[Self <: Auth0LockAdditionalCheckboxSignUpField] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefill(value: `true` | `false`): Self = this.set("prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setType(value: checkbox): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidator(value: /* input */ String => Hint): Self = this.set("validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}

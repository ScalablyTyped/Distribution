package typings.auth0Lock

import typings.auth0Lock.anon.Hint
import typings.auth0Lock.auth0LockStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockAdditionalSelectSignUpField extends Auth0LockAdditionalSignUpField {
  
  var icon: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.native
  
  var placeholder: String = js.native
  
  var prefill: js.UndefOr[String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.native
  
  var `type`: js.UndefOr[select] = js.native
  
  var validator: js.UndefOr[js.Function1[/* input */ String, Hint]] = js.native
}
object Auth0LockAdditionalSelectSignUpField {
  
  @scala.inline
  def apply(name: String, placeholder: String): Auth0LockAdditionalSelectSignUpField = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0LockAdditionalSelectSignUpField]
  }
  
  @scala.inline
  implicit class Auth0LockAdditionalSelectSignUpFieldOps[Self <: Auth0LockAdditionalSelectSignUpField] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: Auth0LockAdditionalSignUpFieldOption*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptionsFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback => Unit): Self = this.set("options", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptions(
      value: js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setPrefillFunction1(value: /* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback => Unit): Self = this.set("prefill", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPrefill(value: String | Auth0LockAdditionalSignUpFieldPrefillFunction): Self = this.set("prefill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefill: Self = this.set("prefill", js.undefined)
    
    @scala.inline
    def setType(value: select): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidator(value: /* input */ String => Hint): Self = this.set("validator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
}

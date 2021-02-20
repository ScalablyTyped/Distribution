package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Auth0LockThemeOptions extends StObject {
  
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.native
  
  var hideMainScreenTitle: js.UndefOr[Boolean] = js.native
  
  var labeledSubmitButton: js.UndefOr[Boolean] = js.native
  
  var logo: js.UndefOr[String] = js.native
  
  var primaryColor: js.UndefOr[String] = js.native
}
object Auth0LockThemeOptions {
  
  @scala.inline
  def apply(): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
  
  @scala.inline
  implicit class Auth0LockThemeOptionsMutableBuilder[Self <: Auth0LockThemeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthButtons(value: Auth0LockThemeButtonOptions): Self = StObject.set(x, "authButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthButtonsUndefined: Self = StObject.set(x, "authButtons", js.undefined)
    
    @scala.inline
    def setHideMainScreenTitle(value: Boolean): Self = StObject.set(x, "hideMainScreenTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideMainScreenTitleUndefined: Self = StObject.set(x, "hideMainScreenTitle", js.undefined)
    
    @scala.inline
    def setLabeledSubmitButton(value: Boolean): Self = StObject.set(x, "labeledSubmitButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabeledSubmitButtonUndefined: Self = StObject.set(x, "labeledSubmitButton", js.undefined)
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    @scala.inline
    def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
  }
}

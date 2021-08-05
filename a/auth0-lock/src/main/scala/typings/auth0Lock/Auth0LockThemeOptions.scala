package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0LockThemeOptions extends StObject {
  
  var authButtons: js.UndefOr[Auth0LockThemeButtonOptions] = js.undefined
  
  var hideMainScreenTitle: js.UndefOr[Boolean] = js.undefined
  
  var labeledSubmitButton: js.UndefOr[Boolean] = js.undefined
  
  var logo: js.UndefOr[String] = js.undefined
  
  var primaryColor: js.UndefOr[String] = js.undefined
}
object Auth0LockThemeOptions {
  
  inline def apply(): Auth0LockThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockThemeOptions]
  }
  
  extension [Self <: Auth0LockThemeOptions](x: Self) {
    
    inline def setAuthButtons(value: Auth0LockThemeButtonOptions): Self = StObject.set(x, "authButtons", value.asInstanceOf[js.Any])
    
    inline def setAuthButtonsUndefined: Self = StObject.set(x, "authButtons", js.undefined)
    
    inline def setHideMainScreenTitle(value: Boolean): Self = StObject.set(x, "hideMainScreenTitle", value.asInstanceOf[js.Any])
    
    inline def setHideMainScreenTitleUndefined: Self = StObject.set(x, "hideMainScreenTitle", js.undefined)
    
    inline def setLabeledSubmitButton(value: Boolean): Self = StObject.set(x, "labeledSubmitButton", value.asInstanceOf[js.Any])
    
    inline def setLabeledSubmitButtonUndefined: Self = StObject.set(x, "labeledSubmitButton", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
  }
}

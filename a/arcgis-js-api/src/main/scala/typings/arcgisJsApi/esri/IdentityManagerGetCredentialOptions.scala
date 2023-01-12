package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerGetCredentialOptions extends StObject {
  
  /**
    * Error object returned by the server from a previous attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var error: js.UndefOr[Error] = js.undefined
  
  /**
    * If set to *false*, the user will not be shown a dialog before the OAuth popup window is opened.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var oAuthPopupConfirmation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Token used for a previous unsuccessful attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var token: js.UndefOr[String] = js.undefined
}
object IdentityManagerGetCredentialOptions {
  
  inline def apply(): IdentityManagerGetCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityManagerGetCredentialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityManagerGetCredentialOptions] (val x: Self) extends AnyVal {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOAuthPopupConfirmation(value: Boolean): Self = StObject.set(x, "oAuthPopupConfirmation", value.asInstanceOf[js.Any])
    
    inline def setOAuthPopupConfirmationUndefined: Self = StObject.set(x, "oAuthPopupConfirmation", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

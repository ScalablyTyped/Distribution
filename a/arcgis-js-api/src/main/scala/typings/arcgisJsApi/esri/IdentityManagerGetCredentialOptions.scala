package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerGetCredentialOptions
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IdentityManagerGetCredentialOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[IdentityManagerGetCredentialOptions]
  }
  
  extension [Self <: IdentityManagerGetCredentialOptions](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOAuthPopupConfirmation(value: Boolean): Self = StObject.set(x, "oAuthPopupConfirmation", value.asInstanceOf[js.Any])
    
    inline def setOAuthPopupConfirmationUndefined: Self = StObject.set(x, "oAuthPopupConfirmation", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}

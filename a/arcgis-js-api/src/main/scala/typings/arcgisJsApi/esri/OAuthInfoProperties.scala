package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`authorization-code`
import typings.arcgisJsApi.arcgisJsApiStrings.`implicit`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthInfoProperties extends StObject {
  
  /**
    * The registered application id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#appId)
    */
  var appId: js.UndefOr[String] = js.undefined
  
  /**
    * Applications with the same value will share the stored token on the same host.
    *
    * @default / (forward slash)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
    */
  var authNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * The number of minutes that the token is valid.
    *
    * @default 20160 (two weeks)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    */
  var expiration: js.UndefOr[Double] = js.undefined
  
  /**
    * Set this property to specify the type of authentication to use.
    *
    * @default auto
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#flowType)
    */
  var flowType: js.UndefOr[auto | `authorization-code` | `implicit`] = js.undefined
  
  /**
    * Set this property to `true` to force the user to sign in with the id in [userId](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#userId).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#forceUserId)
    */
  var forceUserId: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The locale for the OAuth sign-in page.
    *
    * @default Based on your browser/OS and the organization locale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum time in minutes before a saved token is due to expire that should still be considered valid for use.
    *
    * @default 30
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    */
  var minTimeUntilExpiration: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to `true` to show the OAuth sign-in page in a popup window.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    */
  var popup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable if working with the popup user-login workflow.
    *
    * @default "oauth-callback.html"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    */
  var popupCallbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * @default height=490,width=800,resizable,scrollbars,status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    */
  var popupWindowFeatures: js.UndefOr[String] = js.undefined
  
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * @default "https://www.arcgis.com"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    */
  var portalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Set this property to `true` when [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup) is `false` in order to have the window's location hash value restored after signing in.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#preserveUrlHash)
    */
  var preserveUrlHash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The user id used when `forceUserId` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#userId)
    */
  var userId: js.UndefOr[String] = js.undefined
}
object OAuthInfoProperties {
  
  inline def apply(): OAuthInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAuthNamespace(value: String): Self = StObject.set(x, "authNamespace", value.asInstanceOf[js.Any])
    
    inline def setAuthNamespaceUndefined: Self = StObject.set(x, "authNamespace", js.undefined)
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setFlowType(value: auto | `authorization-code` | `implicit`): Self = StObject.set(x, "flowType", value.asInstanceOf[js.Any])
    
    inline def setFlowTypeUndefined: Self = StObject.set(x, "flowType", js.undefined)
    
    inline def setForceUserId(value: Boolean): Self = StObject.set(x, "forceUserId", value.asInstanceOf[js.Any])
    
    inline def setForceUserIdUndefined: Self = StObject.set(x, "forceUserId", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMinTimeUntilExpiration(value: Double): Self = StObject.set(x, "minTimeUntilExpiration", value.asInstanceOf[js.Any])
    
    inline def setMinTimeUntilExpirationUndefined: Self = StObject.set(x, "minTimeUntilExpiration", js.undefined)
    
    inline def setPopup(value: Boolean): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    inline def setPopupCallbackUrl(value: String): Self = StObject.set(x, "popupCallbackUrl", value.asInstanceOf[js.Any])
    
    inline def setPopupCallbackUrlUndefined: Self = StObject.set(x, "popupCallbackUrl", js.undefined)
    
    inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
    
    inline def setPopupWindowFeatures(value: String): Self = StObject.set(x, "popupWindowFeatures", value.asInstanceOf[js.Any])
    
    inline def setPopupWindowFeaturesUndefined: Self = StObject.set(x, "popupWindowFeatures", js.undefined)
    
    inline def setPortalUrl(value: String): Self = StObject.set(x, "portalUrl", value.asInstanceOf[js.Any])
    
    inline def setPortalUrlUndefined: Self = StObject.set(x, "portalUrl", js.undefined)
    
    inline def setPreserveUrlHash(value: Boolean): Self = StObject.set(x, "preserveUrlHash", value.asInstanceOf[js.Any])
    
    inline def setPreserveUrlHashUndefined: Self = StObject.set(x, "preserveUrlHash", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}

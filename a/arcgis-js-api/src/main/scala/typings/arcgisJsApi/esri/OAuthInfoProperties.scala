package typings.arcgisJsApi.esri

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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
    */
  var authNamespace: js.UndefOr[String] = js.undefined
  
  /**
    * The number of minutes that the token is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    */
  var expiration: js.UndefOr[Double] = js.undefined
  
  /**
    * The locale for the OAuth sign in page.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum time in minutes before a saved token is due to expire that it should still be considered valid for use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    */
  var minTimeUntilExpiration: js.UndefOr[Double] = js.undefined
  
  /**
    * Set to `true` to show the OAuth sign in page in a popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    */
  var popup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Applicable if working with the popup user-login workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    */
  var popupCallbackUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    */
  var popupWindowFeatures: js.UndefOr[String] = js.undefined
  
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    */
  var portalUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Set this property to `true` when [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup) is `false` in order to have the window's location hash value restored after signing in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#preserveUrlHash)
    */
  var preserveUrlHash: js.UndefOr[Boolean] = js.undefined
}
object OAuthInfoProperties {
  
  inline def apply(): OAuthInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthInfoProperties]
  }
  
  extension [Self <: OAuthInfoProperties](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAuthNamespace(value: String): Self = StObject.set(x, "authNamespace", value.asInstanceOf[js.Any])
    
    inline def setAuthNamespaceUndefined: Self = StObject.set(x, "authNamespace", js.undefined)
    
    inline def setExpiration(value: Double): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
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
  }
}

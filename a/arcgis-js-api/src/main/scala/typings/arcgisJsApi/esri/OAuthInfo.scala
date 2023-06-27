package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`authorization-code`
import typings.arcgisJsApi.arcgisJsApiStrings.`implicit`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuthInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The registered application id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#appId)
  		 */
  var appId: String = js.native
  
  /**
  		 * Applications with the same value will share the stored token on the same host.
  		 *
  		 * @default / (forward slash)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
  		 */
  var authNamespace: String = js.native
  
  /**
  		 * The number of minutes that the token is valid.
  		 *
  		 * @default 20160 (two weeks)
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
  		 */
  var expiration: Double = js.native
  
  /**
  		 * Set this property to specify the type of authentication to use.
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#flowType)
  		 */
  var flowType: auto | `authorization-code` | `implicit` = js.native
  
  /**
  		 * Set this property to `true` to force the user to sign in with the id in [userId](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#userId).
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#forceUserId)
  		 */
  var forceUserId: Boolean = js.native
  
  /**
  		 * The locale for the OAuth sign-in page.
  		 *
  		 * @default Based on your browser/OS and the organization locale.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
  		 */
  var locale: String = js.native
  
  /**
  		 * The minimum time in minutes before a saved token is due to expire that should still be considered valid for use.
  		 *
  		 * @default 30
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
  		 */
  var minTimeUntilExpiration: Double = js.native
  
  /**
  		 * Set to `true` to show the OAuth sign-in page in a popup window.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
  		 */
  var popup: Boolean = js.native
  
  /**
  		 * Applicable if working with the popup user-login workflow.
  		 *
  		 * @default "oauth-callback.html"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
  		 */
  var popupCallbackUrl: String = js.native
  
  /**
  		 * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
  		 *
  		 * @default height=490,width=800,resizable,scrollbars,status
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
  		 */
  var popupWindowFeatures: String = js.native
  
  /**
  		 * The ArcGIS Enterprise portal URL.
  		 *
  		 * @default "https://www.arcgis.com"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
  		 */
  var portalUrl: String = js.native
  
  /**
  		 * Set this property to `true` when [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup) is `false` in order to have the window's location hash value restored after signing in.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#preserveUrlHash)
  		 */
  var preserveUrlHash: Boolean = js.native
  
  /**
  		 * The user id used when `forceUserId` is `true`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#userId)
  		 */
  var userId: String = js.native
}

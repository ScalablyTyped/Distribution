package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthInfoProperties extends js.Object {
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
    *
    * @default / (forward slash)
    */
  var authNamespace: js.UndefOr[String] = js.undefined
  /**
    * The number of minutes that the token is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    *
    * @default 20160 (two weeks)
    */
  var expiration: js.UndefOr[Double] = js.undefined
  /**
    * The locale for the OAuth sign in page. The default locale is based on your browser/OS and the organization locale. You can use the locale property to change this. The locale needs to follow the language dash country code syntax supported by ArcGIS.com.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    *
    * @default Based on your browser/OS and the organization locale.
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * The minimum time in minutes before a saved token is due to expire that it should still be considered valid for use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    *
    * @default 30
    */
  var minTimeUntilExpiration: js.UndefOr[Double] = js.undefined
  /**
    * Set to `true` to show the OAuth sign in page in a popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    *
    * @default false
    */
  var popup: js.UndefOr[Boolean] = js.undefined
  /**
    * Applicable if working with the popup user-login workflow. This is a relative page URL that redirects the user back to the secured application after successful login.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    *
    * @default "oauth-callback.html"
    */
  var popupCallbackUrl: js.UndefOr[String] = js.undefined
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    *
    * @default height=490,width=800,resizable,scrollbars,status
    */
  var popupWindowFeatures: js.UndefOr[String] = js.undefined
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: js.UndefOr[String] = js.undefined
}

object OAuthInfoProperties {
  @scala.inline
  def apply(
    appId: String = null,
    authNamespace: String = null,
    expiration: Int | Double = null,
    locale: String = null,
    minTimeUntilExpiration: Int | Double = null,
    popup: js.UndefOr[Boolean] = js.undefined,
    popupCallbackUrl: String = null,
    popupWindowFeatures: String = null,
    portalUrl: String = null
  ): OAuthInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (authNamespace != null) __obj.updateDynamic("authNamespace")(authNamespace)
    if (expiration != null) __obj.updateDynamic("expiration")(expiration.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (minTimeUntilExpiration != null) __obj.updateDynamic("minTimeUntilExpiration")(minTimeUntilExpiration.asInstanceOf[js.Any])
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    if (popupCallbackUrl != null) __obj.updateDynamic("popupCallbackUrl")(popupCallbackUrl)
    if (popupWindowFeatures != null) __obj.updateDynamic("popupWindowFeatures")(popupWindowFeatures)
    if (portalUrl != null) __obj.updateDynamic("portalUrl")(portalUrl)
    __obj.asInstanceOf[OAuthInfoProperties]
  }
}


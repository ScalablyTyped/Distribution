package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthInfoProperties extends js.Object {
  /**
    * The registered application id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#appId)
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Applications with the same value will share the stored token on the same host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
    *
    * @default / (forward slash)
    */
  var authNamespace: js.UndefOr[String] = js.native
  /**
    * The number of minutes that the token is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    *
    * @default 20160 (two weeks)
    */
  var expiration: js.UndefOr[Double] = js.native
  /**
    * The locale for the OAuth sign in page. The default locale is based on your browser/OS and the organization locale. You can use the locale property to change this. The locale needs to follow the language dash country code syntax supported by ArcGIS.com.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    *
    * @default Based on your browser/OS and the organization locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The minimum time in minutes before a saved token is due to expire that it should still be considered valid for use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    *
    * @default 30
    */
  var minTimeUntilExpiration: js.UndefOr[Double] = js.native
  /**
    * Set to `true` to show the OAuth sign in page in a popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    *
    * @default false
    */
  var popup: js.UndefOr[Boolean] = js.native
  /**
    * Applicable if working with the popup user-login workflow. This is a relative page URL that redirects the user back to the secured application after successful login.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    *
    * @default "oauth-callback.html"
    */
  var popupCallbackUrl: js.UndefOr[String] = js.native
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    *
    * @default height=490,width=800,resizable,scrollbars,status
    */
  var popupWindowFeatures: js.UndefOr[String] = js.native
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: js.UndefOr[String] = js.native
  /**
    * Set this property to `true` when [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup) is `false` in order to have the window's location hash value restored after signing in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#preserveUrlHash)
    *
    * @default false
    */
  var preserveUrlHash: js.UndefOr[Boolean] = js.native
}

object OAuthInfoProperties {
  @scala.inline
  def apply(): OAuthInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthInfoProperties]
  }
  @scala.inline
  implicit class OAuthInfoPropertiesOps[Self <: OAuthInfoProperties] (val x: Self) extends AnyVal {
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
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    @scala.inline
    def setAuthNamespace(value: String): Self = this.set("authNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthNamespace: Self = this.set("authNamespace", js.undefined)
    @scala.inline
    def setExpiration(value: Double): Self = this.set("expiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiration: Self = this.set("expiration", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMinTimeUntilExpiration(value: Double): Self = this.set("minTimeUntilExpiration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinTimeUntilExpiration: Self = this.set("minTimeUntilExpiration", js.undefined)
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
    @scala.inline
    def setPopupCallbackUrl(value: String): Self = this.set("popupCallbackUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupCallbackUrl: Self = this.set("popupCallbackUrl", js.undefined)
    @scala.inline
    def setPopupWindowFeatures(value: String): Self = this.set("popupWindowFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupWindowFeatures: Self = this.set("popupWindowFeatures", js.undefined)
    @scala.inline
    def setPortalUrl(value: String): Self = this.set("portalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePortalUrl: Self = this.set("portalUrl", js.undefined)
    @scala.inline
    def setPreserveUrlHash(value: Boolean): Self = this.set("preserveUrlHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveUrlHash: Self = this.set("preserveUrlHash", js.undefined)
  }
  
}


package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthInfo
  extends Accessor
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
    *
    * @default / (forward slash)
    */
  var authNamespace: String = js.native
  /**
    * The number of minutes that the token is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    *
    * @default 20160 (two weeks)
    */
  var expiration: Double = js.native
  /**
    * The locale for the OAuth sign in page. The default locale is based on your browser/OS and the organization locale. You can use the locale property to change this. The locale needs to follow the language dash country code syntax supported by ArcGIS.com.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    *
    * @default Based on your browser/OS and the organization locale.
    */
  var locale: String = js.native
  /**
    * The minimum time in minutes before a saved token is due to expire that it should still be considered valid for use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    *
    * @default 30
    */
  var minTimeUntilExpiration: Double = js.native
  /**
    * Set to `true` to show the OAuth sign in page in a popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    *
    * @default false
    */
  var popup: Boolean = js.native
  /**
    * Applicable if working with the popup user-login workflow. This is a relative page URL that redirects the user back to the secured application after successful login.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    *
    * @default "oauth-callback.html"
    */
  var popupCallbackUrl: String = js.native
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    *
    * @default height=490,width=800,resizable,scrollbars,status
    */
  var popupWindowFeatures: String = js.native
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: String = js.native
}

@JSGlobal("__esri.OAuthInfo")
@js.native
class OAuthInfoCls () extends OAuthInfo {
  def this(properties: OAuthInfoProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}


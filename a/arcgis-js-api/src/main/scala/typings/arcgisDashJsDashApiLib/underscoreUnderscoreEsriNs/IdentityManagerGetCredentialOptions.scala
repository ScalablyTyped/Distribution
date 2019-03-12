package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityManagerGetCredentialOptions
  extends stdLib.Object {
  /**
    * Error object returned by the server from a previous attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var error: js.UndefOr[Error] = js.undefined
  /**
    * If set to *false*, the user will not be shown a dialog before the OAuth popup window is opened.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    *
    * @default true
    */
  var oAuthPopupConfirmation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Token used for a previous unsuccessful attempt to fetch the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#getCredential)
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

object IdentityManagerGetCredentialOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    error: Error = null,
    oAuthPopupConfirmation: js.UndefOr[scala.Boolean] = js.undefined,
    token: java.lang.String = null
  ): IdentityManagerGetCredentialOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(oAuthPopupConfirmation)) __obj.updateDynamic("oAuthPopupConfirmation")(oAuthPopupConfirmation)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[IdentityManagerGetCredentialOptions]
  }
}


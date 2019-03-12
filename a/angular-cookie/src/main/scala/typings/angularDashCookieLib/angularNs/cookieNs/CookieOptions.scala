package typings
package angularDashCookieLib.angularNs.cookieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  /**
    * The method that will be used to decode extracted cookie values (should be passed when using Get).
    */
  var decode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * The domain tells the browser to which domain the cookie should be sent. If you don't specify it, it becomes the domain of the page that sets the cookie.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The method that will be used to encode the cookie value (should be passed when using Set).
    */
  var encode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Allows you to set the expiration time in hours, minutes, seconds, or `milliseconds. If this is not specified, any expiration time specified will default to days.
    */
  var expirationUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Each cookie has an expiry date after which it is trashed. If you don't specify the expiry date the cookie is trashed when you close the browser.
    */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /**
    * The path gives you the chance to specify a directory where the cookie is active.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Secure attribute is meant to keep cookie communication limited to encrypted transmission, directing browsers to use cookies only via secure/encrypted connections.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    decode: /* value */ js.Any => _ = null,
    domain: java.lang.String = null,
    encode: /* value */ js.Any => _ = null,
    expirationUnit: java.lang.String = null,
    expires: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction1(decode))
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1(encode))
    if (expirationUnit != null) __obj.updateDynamic("expirationUnit")(expirationUnit)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieOptions]
  }
}


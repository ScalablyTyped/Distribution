package typings.akamaiEdgeworkers.anon

import typings.akamaiEdgeworkers.akamaiEdgeworkersBooleans.`true`
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Lax
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.None
import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[ToUTCString] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[Strict | Lax | None | `true`] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Domain {
  @scala.inline
  def apply(
    domain: String = null,
    expires: ToUTCString = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    name: String = null,
    path: String = null,
    sameSite: Strict | Lax | None | `true` = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}


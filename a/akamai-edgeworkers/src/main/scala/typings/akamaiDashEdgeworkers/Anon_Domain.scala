package typings.akamaiDashEdgeworkers

import typings.akamaiDashEdgeworkers.akamaiDashEdgeworkersBooleans.`true`
import typings.akamaiDashEdgeworkers.akamaiDashEdgeworkersStrings.Lax
import typings.akamaiDashEdgeworkers.akamaiDashEdgeworkersStrings.None
import typings.akamaiDashEdgeworkers.akamaiDashEdgeworkersStrings.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Domain extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Anon_ToUTCString] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[Strict | Lax | None | `true`] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_Domain {
  @scala.inline
  def apply(
    domain: String = null,
    expires: Anon_ToUTCString = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    name: String = null,
    path: String = null,
    sameSite: Strict | Lax | None | `true` = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): Anon_Domain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Domain]
  }
}


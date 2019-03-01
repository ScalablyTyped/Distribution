package typings
package arangodbLib.atArangodbFoxxSessionsTransportsCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieTransportOptions extends js.Object {
  var algorithm: js.UndefOr[arangodbLib.ArangoDBNs.HashAlgorithm] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var httpOnly: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[java.lang.String] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object CookieTransportOptions {
  @scala.inline
  def apply(
    algorithm: arangodbLib.ArangoDBNs.HashAlgorithm = null,
    domain: java.lang.String = null,
    httpOnly: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    secret: java.lang.String = null,
    secure: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): CookieTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (secure != null) __obj.updateDynamic("secure")(secure)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieTransportOptions]
  }
}


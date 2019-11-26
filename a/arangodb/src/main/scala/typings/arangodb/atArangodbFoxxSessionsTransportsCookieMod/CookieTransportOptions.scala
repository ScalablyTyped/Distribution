package typings.arangodb.atArangodbFoxxSessionsTransportsCookieMod

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieTransportOptions extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var httpOnly: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[String] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object CookieTransportOptions {
  @scala.inline
  def apply(
    algorithm: HashAlgorithm = null,
    domain: String = null,
    httpOnly: String = null,
    name: String = null,
    path: String = null,
    secret: String = null,
    secure: String = null,
    ttl: Int | Double = null
  ): CookieTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (httpOnly != null) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieTransportOptions]
  }
}


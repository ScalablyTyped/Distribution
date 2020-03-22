package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
  var domain: js.UndefOr[String] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object AnonDomain {
  @scala.inline
  def apply(
    algorithm: HashAlgorithm = null,
    domain: String = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secret: String = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    ttl: Int | Double = null
  ): AnonDomain = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
}


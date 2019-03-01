package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgorithmDomain extends js.Object {
  var algorithm: js.UndefOr[arangodbLib.ArangoDBNs.HashAlgorithm] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AlgorithmDomain {
  @scala.inline
  def apply(
    algorithm: arangodbLib.ArangoDBNs.HashAlgorithm = null,
    domain: java.lang.String = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secret: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null
  ): Anon_AlgorithmDomain = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlgorithmDomain]
  }
}


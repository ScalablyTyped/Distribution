package typings.auth0Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jwksuri extends js.Object {
  var __jwks_uri: js.UndefOr[String] = js.undefined
  var __tenant: js.UndefOr[String] = js.undefined
  var __token_issuer: js.UndefOr[String] = js.undefined
}

object Jwksuri {
  @scala.inline
  def apply(__jwks_uri: String = null, __tenant: String = null, __token_issuer: String = null): Jwksuri = {
    val __obj = js.Dynamic.literal()
    if (__jwks_uri != null) __obj.updateDynamic("__jwks_uri")(__jwks_uri.asInstanceOf[js.Any])
    if (__tenant != null) __obj.updateDynamic("__tenant")(__tenant.asInstanceOf[js.Any])
    if (__token_issuer != null) __obj.updateDynamic("__token_issuer")(__token_issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jwksuri]
  }
}


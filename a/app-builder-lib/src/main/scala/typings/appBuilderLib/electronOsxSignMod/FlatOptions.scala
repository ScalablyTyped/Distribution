package typings.appBuilderLib.electronOsxSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlatOptions extends BaseSignOptions {
  var `identity-validation`: js.UndefOr[Boolean] = js.undefined
  var install: js.UndefOr[String] = js.undefined
  var pkg: js.UndefOr[String] = js.undefined
  var scripts: js.UndefOr[String] = js.undefined
}

object FlatOptions {
  @scala.inline
  def apply(
    app: String,
    identity: String = null,
    `identity-validation`: js.UndefOr[Boolean] = js.undefined,
    install: String = null,
    keychain: String = null,
    pkg: String = null,
    platform: String = null,
    scripts: String = null
  ): FlatOptions = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (!js.isUndefined(`identity-validation`)) __obj.updateDynamic("identity-validation")(`identity-validation`.asInstanceOf[js.Any])
    if (install != null) __obj.updateDynamic("install")(install.asInstanceOf[js.Any])
    if (keychain != null) __obj.updateDynamic("keychain")(keychain.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlatOptions]
  }
}


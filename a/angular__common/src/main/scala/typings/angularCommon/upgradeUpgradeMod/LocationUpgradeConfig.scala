package typings.angularCommon.upgradeUpgradeMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationUpgradeConfig extends js.Object {
  /**
    * Configures the base href when used in client-side rendered applications
    */
  var appBaseHref: js.UndefOr[String] = js.undefined
  /**
    * Configures the hash prefix used in the URL when using the `HashLocationStrategy`
    */
  var hashPrefix: js.UndefOr[String] = js.undefined
  /**
    * Configures the base href when used in server-side rendered applications
    */
  var serverBaseHref: js.UndefOr[String] = js.undefined
  /**
    * Configures the URL codec for encoding and decoding URLs. Default is the `AngularJSCodec`
    */
  var urlCodec: js.UndefOr[Instantiable0[UrlCodec]] = js.undefined
  /**
    * Configures whether the location upgrade module should use the `HashLocationStrategy`
    * or the `PathLocationStrategy`
    */
  var useHash: js.UndefOr[Boolean] = js.undefined
}

object LocationUpgradeConfig {
  @scala.inline
  def apply(
    appBaseHref: String = null,
    hashPrefix: String = null,
    serverBaseHref: String = null,
    urlCodec: Instantiable0[UrlCodec] = null,
    useHash: js.UndefOr[Boolean] = js.undefined
  ): LocationUpgradeConfig = {
    val __obj = js.Dynamic.literal()
    if (appBaseHref != null) __obj.updateDynamic("appBaseHref")(appBaseHref.asInstanceOf[js.Any])
    if (hashPrefix != null) __obj.updateDynamic("hashPrefix")(hashPrefix.asInstanceOf[js.Any])
    if (serverBaseHref != null) __obj.updateDynamic("serverBaseHref")(serverBaseHref.asInstanceOf[js.Any])
    if (urlCodec != null) __obj.updateDynamic("urlCodec")(urlCodec.asInstanceOf[js.Any])
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationUpgradeConfig]
  }
}


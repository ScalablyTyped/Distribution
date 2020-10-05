package typings.angularCommon.upgradeUpgradeMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationUpgradeConfig extends js.Object {
  /**
    * Configures the base href when used in client-side rendered applications
    */
  var appBaseHref: js.UndefOr[String] = js.native
  /**
    * Configures the hash prefix used in the URL when using the `HashLocationStrategy`
    */
  var hashPrefix: js.UndefOr[String] = js.native
  /**
    * Configures the base href when used in server-side rendered applications
    */
  var serverBaseHref: js.UndefOr[String] = js.native
  /**
    * Configures the URL codec for encoding and decoding URLs. Default is the `AngularJSCodec`
    */
  var urlCodec: js.UndefOr[Instantiable0[UrlCodec]] = js.native
  /**
    * Configures whether the location upgrade module should use the `HashLocationStrategy`
    * or the `PathLocationStrategy`
    */
  var useHash: js.UndefOr[Boolean] = js.native
}

object LocationUpgradeConfig {
  @scala.inline
  def apply(): LocationUpgradeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationUpgradeConfig]
  }
  @scala.inline
  implicit class LocationUpgradeConfigOps[Self <: LocationUpgradeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppBaseHref(value: String): Self = this.set("appBaseHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppBaseHref: Self = this.set("appBaseHref", js.undefined)
    @scala.inline
    def setHashPrefix(value: String): Self = this.set("hashPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashPrefix: Self = this.set("hashPrefix", js.undefined)
    @scala.inline
    def setServerBaseHref(value: String): Self = this.set("serverBaseHref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerBaseHref: Self = this.set("serverBaseHref", js.undefined)
    @scala.inline
    def setUrlCodec(value: Instantiable0[UrlCodec]): Self = this.set("urlCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrlCodec: Self = this.set("urlCodec", js.undefined)
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
  }
  
}


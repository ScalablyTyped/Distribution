package typings.appDashBuilderDashLib.outElectronElectronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElectronDownloadOptions extends js.Object {
  var arch: js.UndefOr[String] = js.undefined
  /**
    * The [cache location](https://github.com/electron-userland/electron-download#cache-location).
    */
  var cache: js.UndefOr[String | Null] = js.undefined
  /** @private */
  var customDir: js.UndefOr[String | Null] = js.undefined
  /** @private */
  var customFilename: js.UndefOr[String | Null] = js.undefined
  var isVerifyChecksum: js.UndefOr[Boolean] = js.undefined
  /**
    * The mirror.
    */
  var mirror: js.UndefOr[String | Null] = js.undefined
  var platform: js.UndefOr[ElectronPlatformName] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ElectronDownloadOptions {
  @scala.inline
  def apply(
    arch: String = null,
    cache: String = null,
    customDir: String = null,
    customFilename: String = null,
    isVerifyChecksum: js.UndefOr[Boolean] = js.undefined,
    mirror: String = null,
    platform: ElectronPlatformName = null,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): ElectronDownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (customDir != null) __obj.updateDynamic("customDir")(customDir.asInstanceOf[js.Any])
    if (customFilename != null) __obj.updateDynamic("customFilename")(customFilename.asInstanceOf[js.Any])
    if (!js.isUndefined(isVerifyChecksum)) __obj.updateDynamic("isVerifyChecksum")(isVerifyChecksum.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronDownloadOptions]
  }
}


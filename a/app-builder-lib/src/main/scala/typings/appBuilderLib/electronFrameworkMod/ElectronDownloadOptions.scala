package typings.appBuilderLib.electronFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronDownloadOptions extends js.Object {
  var arch: js.UndefOr[String] = js.native
  /**
    * The [cache location](https://github.com/electron-userland/electron-download#cache-location).
    */
  var cache: js.UndefOr[String | Null] = js.native
  /** @private */
  var customDir: js.UndefOr[String | Null] = js.native
  /** @private */
  var customFilename: js.UndefOr[String | Null] = js.native
  var isVerifyChecksum: js.UndefOr[Boolean] = js.native
  /**
    * The mirror.
    */
  var mirror: js.UndefOr[String | Null] = js.native
  var platform: js.UndefOr[ElectronPlatformName] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var version: js.UndefOr[String] = js.native
}

object ElectronDownloadOptions {
  @scala.inline
  def apply(): ElectronDownloadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectronDownloadOptions]
  }
  @scala.inline
  implicit class ElectronDownloadOptionsOps[Self <: ElectronDownloadOptions] (val x: Self) extends AnyVal {
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
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    @scala.inline
    def setCache(value: String): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCacheNull: Self = this.set("cache", null)
    @scala.inline
    def setCustomDir(value: String): Self = this.set("customDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDir: Self = this.set("customDir", js.undefined)
    @scala.inline
    def setCustomDirNull: Self = this.set("customDir", null)
    @scala.inline
    def setCustomFilename(value: String): Self = this.set("customFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFilename: Self = this.set("customFilename", js.undefined)
    @scala.inline
    def setCustomFilenameNull: Self = this.set("customFilename", null)
    @scala.inline
    def setIsVerifyChecksum(value: Boolean): Self = this.set("isVerifyChecksum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVerifyChecksum: Self = this.set("isVerifyChecksum", js.undefined)
    @scala.inline
    def setMirror(value: String): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setMirrorNull: Self = this.set("mirror", null)
    @scala.inline
    def setPlatform(value: ElectronPlatformName): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    @scala.inline
    def setStrictSSL(value: Boolean): Self = this.set("strictSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictSSL: Self = this.set("strictSSL", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


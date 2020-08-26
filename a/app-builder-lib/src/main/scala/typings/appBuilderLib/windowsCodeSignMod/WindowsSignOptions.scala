package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsSignOptions extends js.Object {
  val cscInfo: js.UndefOr[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.native
  val name: js.UndefOr[String | Null] = js.native
  val options: WindowsConfiguration = js.native
  val path: String = js.native
  val site: js.UndefOr[String | Null] = js.native
}

object WindowsSignOptions {
  @scala.inline
  def apply(options: WindowsConfiguration, path: String): WindowsSignOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSignOptions]
  }
  @scala.inline
  implicit class WindowsSignOptionsOps[Self <: WindowsSignOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: WindowsConfiguration): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setCscInfo(value: FileCodeSigningInfo | CertificateFromStoreInfo): Self = this.set("cscInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCscInfo: Self = this.set("cscInfo", js.undefined)
    @scala.inline
    def setCscInfoNull: Self = this.set("cscInfo", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    @scala.inline
    def setSiteNull: Self = this.set("site", null)
  }
  
}


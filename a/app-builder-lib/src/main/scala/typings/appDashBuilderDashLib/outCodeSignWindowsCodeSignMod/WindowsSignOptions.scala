package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSignOptions extends js.Object {
  val cscInfo: js.UndefOr[FileCodeSigningInfo | CertificateFromStoreInfo | Null] = js.undefined
  val name: js.UndefOr[String | Null] = js.undefined
  val options: WindowsConfiguration
  val path: String
  val site: js.UndefOr[String | Null] = js.undefined
}

object WindowsSignOptions {
  @scala.inline
  def apply(
    options: WindowsConfiguration,
    path: String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: String = null,
    site: String = null
  ): WindowsSignOptions = {
    val __obj = js.Dynamic.literal(options = options, path = path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[WindowsSignOptions]
  }
}


package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSignTaskConfiguration extends WindowsSignOptions {
  var hash: String
  var isNest: Boolean
  var resultOutputPath: js.UndefOr[String] = js.undefined
}

object WindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    hash: String,
    isNest: Boolean,
    options: WindowsConfiguration,
    path: String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: String = null,
    resultOutputPath: String = null,
    site: String = null
  ): WindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(hash = hash, isNest = isNest, options = options, path = path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
}


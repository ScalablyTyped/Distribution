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
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
}


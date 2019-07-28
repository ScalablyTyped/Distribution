package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import typings.appDashBuilderDashLib.outOptionsWinOptionsMod.WindowsConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomWindowsSignTaskConfiguration extends WindowsSignTaskConfiguration {
  def computeSignToolArgs(isWin: Boolean): js.Array[String]
}

object CustomWindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    computeSignToolArgs: Boolean => js.Array[String],
    hash: String,
    isNest: Boolean,
    options: WindowsConfiguration,
    path: String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: String = null,
    resultOutputPath: String = null,
    site: String = null
  ): CustomWindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(computeSignToolArgs = js.Any.fromFunction1(computeSignToolArgs), hash = hash, isNest = isNest, options = options, path = path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
  }
}


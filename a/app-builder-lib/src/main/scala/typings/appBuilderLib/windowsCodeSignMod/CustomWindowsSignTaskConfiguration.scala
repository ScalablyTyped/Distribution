package typings.appBuilderLib.windowsCodeSignMod

import typings.appBuilderLib.winOptionsMod.WindowsConfiguration
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
    val __obj = js.Dynamic.literal(computeSignToolArgs = js.Any.fromFunction1(computeSignToolArgs), hash = hash.asInstanceOf[js.Any], isNest = isNest.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath.asInstanceOf[js.Any])
    if (site != null) __obj.updateDynamic("site")(site.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
  }
}


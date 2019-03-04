package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomWindowsSignTaskConfiguration extends WindowsSignTaskConfiguration {
  def computeSignToolArgs(isWin: scala.Boolean): js.Array[java.lang.String]
}

object CustomWindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    computeSignToolArgs: js.Function1[scala.Boolean, js.Array[java.lang.String]],
    hash: java.lang.String,
    isNest: scala.Boolean,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WindowsConfiguration */ js.Any,
    path: java.lang.String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: java.lang.String = null,
    resultOutputPath: java.lang.String = null,
    site: java.lang.String = null
  ): CustomWindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal(computeSignToolArgs = computeSignToolArgs, hash = hash, isNest = isNest, options = options, path = path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[CustomWindowsSignTaskConfiguration]
  }
}


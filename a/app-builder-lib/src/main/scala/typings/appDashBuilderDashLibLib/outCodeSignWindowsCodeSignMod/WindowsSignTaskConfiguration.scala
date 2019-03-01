package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSignTaskConfiguration extends WindowsSignOptions {
  var hash: java.lang.String
  var isNest: scala.Boolean
  var resultOutputPath: js.UndefOr[java.lang.String] = js.undefined
}

object WindowsSignTaskConfiguration {
  @scala.inline
  def apply(
    hash: java.lang.String,
    isNest: scala.Boolean,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WindowsConfiguration */ js.Any,
    path: java.lang.String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: java.lang.String = null,
    resultOutputPath: java.lang.String = null,
    site: java.lang.String = null
  ): WindowsSignTaskConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("isNest")(isNest)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("path")(path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resultOutputPath != null) __obj.updateDynamic("resultOutputPath")(resultOutputPath)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[WindowsSignTaskConfiguration]
  }
}


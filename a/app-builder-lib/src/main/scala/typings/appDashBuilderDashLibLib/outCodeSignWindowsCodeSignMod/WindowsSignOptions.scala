package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsSignOptions extends js.Object {
  val cscInfo: js.UndefOr[FileCodeSigningInfo | CertificateFromStoreInfo | scala.Null] = js.undefined
  val name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  val options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WindowsConfiguration */ js.Any
  val path: java.lang.String
  val site: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object WindowsSignOptions {
  @scala.inline
  def apply(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify WindowsConfiguration */ js.Any,
    path: java.lang.String,
    cscInfo: FileCodeSigningInfo | CertificateFromStoreInfo = null,
    name: java.lang.String = null,
    site: java.lang.String = null
  ): WindowsSignOptions = {
    val __obj = js.Dynamic.literal(options = options, path = path)
    if (cscInfo != null) __obj.updateDynamic("cscInfo")(cscInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (site != null) __obj.updateDynamic("site")(site)
    __obj.asInstanceOf[WindowsSignOptions]
  }
}


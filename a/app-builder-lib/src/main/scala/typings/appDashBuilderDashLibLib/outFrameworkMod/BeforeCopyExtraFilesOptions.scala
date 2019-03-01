package typings
package appDashBuilderDashLibLib.outFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCopyExtraFilesOptions extends js.Object {
  var appOutDir: java.lang.String
  var asarIntegrity: appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrity | scala.Null
  var packager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlatformPackager<any> */ js.Any
  var platformName: java.lang.String
}

object BeforeCopyExtraFilesOptions {
  @scala.inline
  def apply(
    appOutDir: java.lang.String,
    packager: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PlatformPackager<any> */ js.Any,
    platformName: java.lang.String,
    asarIntegrity: appDashBuilderDashLibLib.outAsarIntegrityMod.AsarIntegrity = null
  ): BeforeCopyExtraFilesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appOutDir")(appOutDir)
    __obj.updateDynamic("packager")(packager)
    __obj.updateDynamic("platformName")(platformName)
    if (asarIntegrity != null) __obj.updateDynamic("asarIntegrity")(asarIntegrity)
    __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
  }
}


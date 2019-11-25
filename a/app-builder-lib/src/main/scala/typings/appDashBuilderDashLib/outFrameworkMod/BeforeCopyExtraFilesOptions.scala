package typings.appDashBuilderDashLib.outFrameworkMod

import typings.appDashBuilderDashLib.outAsarIntegrityMod.AsarIntegrity
import typings.appDashBuilderDashLib.outMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeCopyExtraFilesOptions extends js.Object {
  var appOutDir: String
  var asarIntegrity: AsarIntegrity | Null
  var packager: PlatformPackager[_]
  var platformName: String
}

object BeforeCopyExtraFilesOptions {
  @scala.inline
  def apply(
    appOutDir: String,
    packager: PlatformPackager[_],
    platformName: String,
    asarIntegrity: AsarIntegrity = null
  ): BeforeCopyExtraFilesOptions = {
    val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any])
    if (asarIntegrity != null) __obj.updateDynamic("asarIntegrity")(asarIntegrity.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
  }
}


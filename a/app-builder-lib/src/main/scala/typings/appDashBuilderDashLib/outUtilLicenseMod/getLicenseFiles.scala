package typings.appDashBuilderDashLib.outUtilLicenseMod

import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/license", "getLicenseFiles")
@js.native
object getLicenseFiles extends js.Object {
  def apply(packager: PlatformPackager[_]): js.Promise[js.Array[LicenseFile]] = js.native
}


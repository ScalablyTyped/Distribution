package typings.appBuilderLib.licenseMod

import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/util/license", "getLicenseFiles")
@js.native
object getLicenseFiles extends js.Object {
  
  def apply(packager: PlatformPackager[_]): js.Promise[js.Array[LicenseFile]] = js.native
}

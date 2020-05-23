package typings.appBuilderLib.licenseMod

import typings.appBuilderLib.anon.File
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/license", "getLicenseAssets")
@js.native
object getLicenseAssets extends js.Object {
  def apply(fileNames: js.Array[String], packager: PlatformPackager[_]): js.Array[File] = js.native
}


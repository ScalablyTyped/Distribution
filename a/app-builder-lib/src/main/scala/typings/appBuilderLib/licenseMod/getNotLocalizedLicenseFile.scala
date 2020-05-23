package typings.appBuilderLib.licenseMod

import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/util/license", "getNotLocalizedLicenseFile")
@js.native
object getNotLocalizedLicenseFile extends js.Object {
  def apply(custom: js.UndefOr[Null | String], packager: PlatformPackager[_]): js.Promise[String | Null] = js.native
  def apply(
    custom: js.UndefOr[Null | String],
    packager: PlatformPackager[_],
    supportedExtension: js.Array[String]
  ): js.Promise[String | Null] = js.native
}


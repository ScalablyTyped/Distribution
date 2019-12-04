package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outCodeSignMacCodeSignMod.Identity
import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outMacPackagerMod.default
import typings.appDashBuilderDashLib.outOptionsPkgOptionsMod.PkgOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/pkg", JSImport.Namespace)
@js.native
object outTargetsPkgMod extends js.Object {
  @js.native
  class PkgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    var buildComponentPackage: js.Any = js.native
    var customizeDistributionConfiguration: js.Any = js.native
    @JSName("options")
    val options_PkgTarget: PkgOptions = js.native
    val packager: js.Any = js.native
  }
  
  def prepareProductBuildArgs(): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Null, keychain: String): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Identity): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Identity, keychain: String): js.Array[String] = js.native
}


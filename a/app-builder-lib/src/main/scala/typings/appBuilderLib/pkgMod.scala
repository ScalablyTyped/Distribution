package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.macCodeSignMod.Identity
import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.pkgOptionsMod.PkgOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/pkg", JSImport.Namespace)
@js.native
object pkgMod extends js.Object {
  
  def prepareProductBuildArgs(): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Null, keychain: String): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Identity): js.Array[String] = js.native
  def prepareProductBuildArgs(identity: Identity, keychain: String): js.Array[String] = js.native
  
  @js.native
  class PkgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    var buildComponentPackage: js.Any = js.native
    
    var customizeDistributionConfiguration: js.Any = js.native
    
    @JSName("options")
    val options_PkgTarget: PkgOptions = js.native
    
    val packager: js.Any = js.native
  }
}

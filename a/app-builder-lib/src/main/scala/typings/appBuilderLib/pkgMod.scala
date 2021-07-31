package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.macCodeSignMod.Identity
import typings.appBuilderLib.macPackagerMod.default
import typings.appBuilderLib.pkgOptionsMod.PkgOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkgMod {
  
  @JSImport("app-builder-lib/out/targets/pkg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/pkg", "PkgTarget")
  @js.native
  class PkgTarget protected () extends Target {
    def this(packager: default, outDir: String) = this()
    
    var buildComponentPackage: js.Any = js.native
    
    var customizeDistributionConfiguration: js.Any = js.native
    
    @JSName("options")
    val options_PkgTarget: PkgOptions = js.native
    
    val packager: js.Any = js.native
  }
  
  @scala.inline
  def prepareProductBuildArgs(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareProductBuildArgs")().asInstanceOf[js.Array[String]]
  @scala.inline
  def prepareProductBuildArgs(identity: Null, keychain: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareProductBuildArgs")(identity.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def prepareProductBuildArgs(identity: Identity): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareProductBuildArgs")(identity.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def prepareProductBuildArgs(identity: Identity, keychain: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareProductBuildArgs")(identity.asInstanceOf[js.Any], keychain.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}

package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outCoreMod.TargetSpecificOptions
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/ArchiveTarget", JSImport.Namespace)
@js.native
object outTargetsArchiveTargetMod extends js.Object {
  @js.native
  class ArchiveTarget protected () extends Target {
    def this(name: String, outDir: String, packager: PlatformPackager[_]) = this()
    def this(name: String, outDir: String, packager: PlatformPackager[_], isWriteUpdateInfo: Boolean) = this()
    val isWriteUpdateInfo: js.Any = js.native
    @JSName("options")
    val options_ArchiveTarget: TargetSpecificOptions = js.native
    val packager: js.Any = js.native
  }
  
}


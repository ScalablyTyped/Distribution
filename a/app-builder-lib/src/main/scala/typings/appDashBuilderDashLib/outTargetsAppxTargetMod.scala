package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.outCoreMod.Target
import typings.appDashBuilderDashLib.outOptionsAppXOptionsMod.AppXOptions
import typings.appDashBuilderDashLib.outWinPackagerMod.WinPackager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Namespace)
@js.native
object outTargetsAppxTargetMod extends js.Object {
  @js.native
  trait AppXTarget extends Target {
    var computePublisherName: js.Any = js.native
    var getExtensions: js.Any = js.native
    @JSName("options")
    val options_AppXTarget: AppXOptions = js.native
    val packager: js.Any = js.native
    var writeManifest: js.Any = js.native
  }
  
  @js.native
  class default protected () extends AppXTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var computeUserAssets: js.Any = js.native
  }
  
}


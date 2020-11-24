package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.linuxOptionsMod.AppImageOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Namespace)
@js.native
object appImageTargetMod extends js.Object {
  
  @js.native
  trait AppImageTarget extends Target {
    
    val desktopEntry: js.Any = js.native
    
    val helper: js.Any = js.native
    
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    
    val packager: js.Any = js.native
  }
  
  @js.native
  class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
}

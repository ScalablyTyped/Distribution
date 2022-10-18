package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outLinuxPackagerMod.LinuxPackager
import typings.appBuilderLib.outOptionsLinuxOptionsMod.AppImageOptions
import typings.appBuilderLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsAppImageTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Default)
  @js.native
  open class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait AppImageTarget extends Target {
    
    /* private */ val desktopEntry: Any = js.native
    
    /* private */ val helper: Any = js.native
    
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    
    /* private */ val packager: Any = js.native
  }
}

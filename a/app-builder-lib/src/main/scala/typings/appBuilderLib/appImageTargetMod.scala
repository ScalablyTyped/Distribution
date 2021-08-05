package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.linuxOptionsMod.AppImageOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appImageTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppImageTarget", JSImport.Default)
  @js.native
  class default protected () extends AppImageTarget {
    def this(ignored: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait AppImageTarget extends Target {
    
    /* private */ val desktopEntry: js.Any = js.native
    
    /* private */ val helper: js.Any = js.native
    
    @JSName("options")
    val options_AppImageTarget: AppImageOptions = js.native
    
    /* private */ val packager: js.Any = js.native
  }
}

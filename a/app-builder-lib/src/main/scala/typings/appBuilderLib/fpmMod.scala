package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.linuxOptionsMod.LinuxTargetSpecificOptions
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpmMod {
  
  @JSImport("app-builder-lib/out/targets/fpm", JSImport.Default)
  @js.native
  open class default protected () extends FpmTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait FpmTarget extends Target {
    
    /* private */ var computeFpmMetaInfoOptions: Any = js.native
    
    /* private */ var createScripts: Any = js.native
    
    /* private */ val helper: Any = js.native
    
    @JSName("options")
    val options_FpmTarget: LinuxTargetSpecificOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ val scriptFiles: Any = js.native
  }
}

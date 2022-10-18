package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outLinuxPackagerMod.LinuxPackager
import typings.appBuilderLib.outOptionsLinuxOptionsMod.FlatpakOptions
import typings.appBuilderLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsFlatpakTargetMod {
  
  @JSImport("app-builder-lib/out/targets/FlatpakTarget", JSImport.Default)
  @js.native
  open class default protected () extends FlatpakTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait FlatpakTarget extends Target {
    
    def appId: String = js.native
    
    /* private */ var copyIcons: Any = js.native
    
    /* private */ var copyLicenseFile: Any = js.native
    
    /* private */ var createDesktopFile: Any = js.native
    
    /* private */ var createSandboxBinWrapper: Any = js.native
    
    /* private */ var getFlatpakBuilderOptions: Any = js.native
    
    /* private */ var helper: Any = js.native
    
    @JSName("options")
    val options_FlatpakTarget: FlatpakOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ var prepareStageDir: Any = js.native
  }
}

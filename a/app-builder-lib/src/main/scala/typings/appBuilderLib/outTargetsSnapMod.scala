package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outLinuxPackagerMod.LinuxPackager
import typings.appBuilderLib.outOptionsSnapOptionsMod.SnapOptions
import typings.appBuilderLib.outTargetsLinuxTargetHelperMod.LinuxTargetHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsSnapMod {
  
  @JSImport("app-builder-lib/out/targets/snap", JSImport.Default)
  @js.native
  open class default protected () extends SnapTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait SnapTarget extends Target {
    
    /* private */ var createDescriptor: Any = js.native
    
    /* private */ val helper: Any = js.native
    
    /* private */ var isElectronVersionGreaterOrEqualThan: Any = js.native
    
    var isUseTemplateApp: Boolean = js.native
    
    @JSName("options")
    val options_SnapTarget: SnapOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ var replaceDefault: Any = js.native
  }
}

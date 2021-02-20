package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.linuxPackagerMod.LinuxPackager
import typings.appBuilderLib.linuxTargetHelperMod.LinuxTargetHelper
import typings.appBuilderLib.snapOptionsMod.SnapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapMod {
  
  @JSImport("app-builder-lib/out/targets/snap", JSImport.Default)
  @js.native
  class default protected () extends SnapTarget {
    def this(name: String, packager: LinuxPackager, helper: LinuxTargetHelper, outDir: String) = this()
  }
  
  @js.native
  trait SnapTarget extends Target {
    
    var createDescriptor: js.Any = js.native
    
    val helper: js.Any = js.native
    
    var isElectronVersionGreaterOrEqualThen: js.Any = js.native
    
    var isUseTemplateApp: Boolean = js.native
    
    @JSName("options")
    val options_SnapTarget: SnapOptions = js.native
    
    val packager: js.Any = js.native
    
    var replaceDefault: js.Any = js.native
  }
}

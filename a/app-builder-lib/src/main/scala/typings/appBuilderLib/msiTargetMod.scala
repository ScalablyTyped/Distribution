package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.msiOptionsMod.MsiOptions
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msiTargetMod {
  
  @JSImport("app-builder-lib/out/targets/MsiTarget", JSImport.Default)
  @js.native
  class default protected () extends MsiTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  
  @js.native
  trait MsiTarget extends Target {
    
    var computeFileDeclaration: js.Any = js.native
    
    var getCommonWixArgs: js.Any = js.native
    
    var light: js.Any = js.native
    
    @JSName("options")
    val options_MsiTarget: MsiOptions = js.native
    
    val packager: js.Any = js.native
    
    val vm: js.Any = js.native
    
    var writeManifest: js.Any = js.native
  }
}

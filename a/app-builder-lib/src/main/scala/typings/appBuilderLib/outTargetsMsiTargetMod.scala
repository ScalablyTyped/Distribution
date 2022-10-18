package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outOptionsMsiOptionsMod.MsiOptions
import typings.appBuilderLib.outWinPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsMsiTargetMod {
  
  @JSImport("app-builder-lib/out/targets/MsiTarget", JSImport.Default)
  @js.native
  open class default protected () extends MsiTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  
  @js.native
  trait MsiTarget extends Target {
    
    /* private */ var computeFileDeclaration: Any = js.native
    
    /* private */ var getCommonWixArgs: Any = js.native
    
    /* private */ def iconId: Any = js.native
    
    /* private */ var light: Any = js.native
    
    @JSName("options")
    val options_MsiTarget: MsiOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /**
      * A product-specific string that can be used in an [MSI Identifier](https://docs.microsoft.com/en-us/windows/win32/msi/identifier).
      */
    /* private */ def productMsiIdPrefix: Any = js.native
    
    /* private */ def upgradeCode: Any = js.native
    
    /* private */ val vm: Any = js.native
    
    /* private */ var writeManifest: Any = js.native
  }
}

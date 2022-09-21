package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.msiOptionsMod.MsiOptions
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object msiTargetMod {
  
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

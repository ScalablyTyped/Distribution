package typings.appBuilderLib

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appxTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Default)
  @js.native
  open class default protected () extends AppXTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/targets/AppxTarget", "default.computeUserAssets")
    @js.native
    def computeUserAssets: Any = js.native
    inline def computeUserAssets_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computeUserAssets")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AppXTarget extends Target {
    
    /* private */ var computePublisherName: Any = js.native
    
    /* private */ var getExtensions: Any = js.native
    
    @JSName("options")
    val options_AppXTarget: AppXOptions = js.native
    
    /* private */ val packager: Any = js.native
    
    /* private */ var writeManifest: Any = js.native
  }
}

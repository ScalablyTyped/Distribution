package typings.appBuilderLib

import typings.appBuilderLib.appXOptionsMod.AppXOptions
import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.winPackagerMod.WinPackager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appxTargetMod {
  
  @JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Default)
  @js.native
  class default protected () extends AppXTarget {
    def this(packager: WinPackager, outDir: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/targets/AppxTarget", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/targets/AppxTarget", "default.computeUserAssets")
    @js.native
    def computeUserAssets: js.Any = js.native
    @scala.inline
    def computeUserAssets_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computeUserAssets")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AppXTarget extends Target {
    
    var computePublisherName: js.Any = js.native
    
    var getExtensions: js.Any = js.native
    
    @JSName("options")
    val options_AppXTarget: AppXOptions = js.native
    
    val packager: js.Any = js.native
    
    var writeManifest: js.Any = js.native
  }
}

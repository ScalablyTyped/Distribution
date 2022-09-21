package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.libUiFrameworkMod.LibUiFramework
import typings.builderUtil.fsMod.FileTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protonFrameworkMod {
  
  @JSImport("app-builder-lib/out/ProtonFramework", "ProtonFramework")
  @js.native
  open class ProtonFramework protected () extends LibUiFramework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    
    @JSName("createTransformer")
    def createTransformer_MProtonFramework(): FileTransformer | Null = js.native
    
    @JSName("getDefaultIcon")
    def getDefaultIcon_MProtonFramework(platform: Platform): String = js.native
  }
}

package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Platform
import typings.appBuilderLib.outFrameworksLibUiFrameworkMod.LibUiFramework
import typings.builderUtil.outFsMod.FileTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProtonFrameworkMod {
  
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

package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.frameworkMod.Framework
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUiFrameworkMod {
  
  @JSImport("app-builder-lib/out/frameworks/LibUiFramework", "LibUiFramework")
  @js.native
  class LibUiFramework protected () extends Framework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    
    @JSName("afterPack")
    def afterPack_MLibUiFramework(context: AfterPackContext): js.Promise[Unit] = js.native
    
    @JSName("getExcludedDependencies")
    def getExcludedDependencies_MLibUiFramework(platform: Platform): js.Array[String] | Null = js.native
    
    @JSName("getMainFile")
    def getMainFile_MLibUiFramework(platform: Platform): String | Null = js.native
    
    val isUseLaunchUi: Boolean = js.native
    
    var isUseLaunchUiForPlatform: js.Any = js.native
    
    var prepareLinuxApplicationStageDirectory: js.Any = js.native
    
    var prepareMacosApplicationStageDirectory: js.Any = js.native
  }
}

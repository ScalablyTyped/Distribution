package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.frameworkMod.Framework
import typings.appBuilderLib.frameworkMod.PrepareApplicationStageDirectoryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUiFrameworkMod {
  
  @JSImport("app-builder-lib/out/frameworks/LibUiFramework", "LibUiFramework")
  @js.native
  open class LibUiFramework protected ()
    extends StObject
       with Framework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    
    @JSName("afterPack")
    def afterPack_MLibUiFramework(context: AfterPackContext): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override val defaultAppIdPrefix: String = js.native
    
    /* CompleteClass */
    override val distMacOsAppName: String = js.native
    
    @JSName("getExcludedDependencies")
    def getExcludedDependencies_MLibUiFramework(platform: Platform): js.Array[String] | Null = js.native
    
    @JSName("getMainFile")
    def getMainFile_MLibUiFramework(platform: Platform): String | Null = js.native
    
    /* CompleteClass */
    override val isCopyElevateHelper: Boolean = js.native
    
    /* CompleteClass */
    override val isNpmRebuildRequired: Boolean = js.native
    
    /* protected */ val isUseLaunchUi: Boolean = js.native
    
    /* private */ var isUseLaunchUiForPlatform: Any = js.native
    
    /* CompleteClass */
    override val macOsDefaultTargets: js.Array[String] = js.native
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[Any] = js.native
    
    /* private */ var prepareLinuxApplicationStageDirectory: Any = js.native
    
    /* private */ var prepareMacosApplicationStageDirectory: Any = js.native
    
    /* CompleteClass */
    override val version: String = js.native
  }
}

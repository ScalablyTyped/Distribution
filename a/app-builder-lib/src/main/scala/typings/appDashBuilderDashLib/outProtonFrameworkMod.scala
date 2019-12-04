package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.`comDOTproton-nativeDOT`
import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.proton
import typings.appDashBuilderDashLib.outCoreMod.Platform
import typings.appDashBuilderDashLib.outFrameworksLibUiFrameworkMod.LibUiFramework
import typings.builderDashUtil.outFsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/ProtonFramework", JSImport.Namespace)
@js.native
object outProtonFrameworkMod extends js.Object {
  @js.native
  class ProtonFramework protected () extends LibUiFramework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    @JSName("defaultAppIdPrefix")
    val defaultAppIdPrefix_ProtonFramework: `comDOTproton-nativeDOT` = js.native
    @JSName("name")
    val name_ProtonFramework: proton = js.native
    @JSName("createTransformer")
    def createTransformer_MProtonFramework(): FileTransformer | Null = js.native
    @JSName("getDefaultIcon")
    def getDefaultIcon_MProtonFramework(platform: Platform): String = js.native
  }
  
}


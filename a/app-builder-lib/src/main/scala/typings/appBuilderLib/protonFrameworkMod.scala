package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.`comDotproton-nativeDot`
import typings.appBuilderLib.appBuilderLibStrings.proton
import typings.appBuilderLib.coreMod.Platform
import typings.appBuilderLib.libUiFrameworkMod.LibUiFramework
import typings.builderUtil.fsMod.FileTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/ProtonFramework", JSImport.Namespace)
@js.native
object protonFrameworkMod extends js.Object {
  @js.native
  class ProtonFramework protected () extends LibUiFramework {
    def this(version: String, distMacOsAppName: String, isUseLaunchUi: Boolean) = this()
    @JSName("defaultAppIdPrefix")
    val defaultAppIdPrefix_ProtonFramework: `comDotproton-nativeDot` = js.native
    @JSName("name")
    val name_ProtonFramework: proton = js.native
    @JSName("createTransformer")
    def createTransformer_MProtonFramework(): FileTransformer | Null = js.native
    @JSName("getDefaultIcon")
    def getDefaultIcon_MProtonFramework(platform: Platform): String = js.native
  }
  
}


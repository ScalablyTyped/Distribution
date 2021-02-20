package typings.appBuilderLib

import typings.appBuilderLib.mod.AppInfo
import typings.appBuilderLib.mod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetUtilMod {
  
  @JSImport("app-builder-lib/out/targets/targetUtil", "StageDir")
  @js.native
  class StageDir protected () extends StObject {
    def this(dir: String) = this()
    
    def cleanup(): js.Promise[Unit] = js.native
    
    val dir: String = js.native
    
    def getTempFile(name: String): String = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/targetUtil", "createStageDir")
  @js.native
  def createStageDir(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[StageDir] = js.native
  
  @JSImport("app-builder-lib/out/targets/targetUtil", "createStageDirPath")
  @js.native
  def createStageDirPath(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/targets/targetUtil", "getWindowsInstallationDirName")
  @js.native
  def getWindowsInstallationDirName(appInfo: AppInfo, isTryToUseProductName: Boolean): String = js.native
}

package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.AppInfo
import typings.appDashBuilderDashLib.appDashBuilderDashLibMod.Target
import typings.appDashBuilderDashLib.outPlatformPackagerMod.PlatformPackager
import typings.appDashBuilderDashLib.outTargetsTargetUtilMod.StageDir
import typings.builderDashUtil.outArchMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/targetUtil", JSImport.Namespace)
@js.native
object outTargetsTargetUtilMod extends js.Object {
  @js.native
  class StageDir protected () extends js.Object {
    def this(dir: String) = this()
    val dir: String = js.native
    def cleanup(): js.Promise[Unit] = js.native
    def getTempFile(name: String): String = js.native
  }
  
  def createStageDir(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[StageDir] = js.native
  def createStageDirPath(target: Target, packager: PlatformPackager[_], arch: Arch): js.Promise[String] = js.native
  def getWindowsInstallationDirName(appInfo: AppInfo, isTryToUseProductName: Boolean): String = js.native
}


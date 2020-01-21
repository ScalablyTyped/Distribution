package typings.appBuilderLib

import typings.appBuilderLib.mod.AppInfo
import typings.appBuilderLib.mod.Target
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/targetUtil", JSImport.Namespace)
@js.native
object targetUtilMod extends js.Object {
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


package typings.appBuilderLib

import typings.appBuilderLib.nsisTargetMod.NsisTarget
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import typings.lazyVal.mod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/targets/nsis/nsisUtil", JSImport.Namespace)
@js.native
object nsisUtilMod extends js.Object {
  @js.native
  class AppPackageHelper protected () extends js.Object {
    def this(elevateHelper: CopyElevateHelper) = this()
    val archToFileInfo: js.Any = js.native
    val elevateHelper: js.Any = js.native
    val infoToIsDelete: js.Any = js.native
    /** @private */
    var refCount: Double = js.native
    def finishBuild(): js.Promise[_] = js.native
    def packArch(arch: Arch, target: NsisTarget): js.Promise[PackageFileInfo] = js.native
  }
  
  @js.native
  class CopyElevateHelper () extends js.Object {
    val copied: js.Any = js.native
    def copy(appOutDir: String, target: NsisTarget): js.Promise[_] = js.native
  }
  
  @js.native
  class UninstallerReader () extends js.Object
  
  val NSIS_PATH: Lazy[String] = js.native
  val nsisTemplatesDir: String = js.native
  /* static members */
  @js.native
  object UninstallerReader extends js.Object {
    def exec(installerPath: String, uninstallerPath: String): Unit = js.native
  }
  
}


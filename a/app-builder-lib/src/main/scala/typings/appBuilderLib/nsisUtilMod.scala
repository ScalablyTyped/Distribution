package typings.appBuilderLib

import typings.appBuilderLib.nsisTargetMod.NsisTarget
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisUtilMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "AppPackageHelper")
  @js.native
  class AppPackageHelper protected () extends StObject {
    def this(elevateHelper: CopyElevateHelper) = this()
    
    val archToFileInfo: js.Any = js.native
    
    val elevateHelper: js.Any = js.native
    
    def finishBuild(): js.Promise[js.Any] = js.native
    
    val infoToIsDelete: js.Any = js.native
    
    def packArch(arch: Arch, target: NsisTarget): js.Promise[PackageFileInfo] = js.native
    
    /** @private */
    var refCount: Double = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "CopyElevateHelper")
  @js.native
  class CopyElevateHelper () extends StObject {
    
    val copied: js.Any = js.native
    
    def copy(appOutDir: String, target: NsisTarget): js.Promise[js.Any] = js.native
  }
  
  @scala.inline
  def NSIS_PATH(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("NSIS_PATH")().asInstanceOf[js.Promise[String]]
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader")
  @js.native
  class UninstallerReader () extends StObject
  /* static members */
  object UninstallerReader {
    
    @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def exec(installerPath: String, uninstallerPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(installerPath.asInstanceOf[js.Any], uninstallerPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "nsisTemplatesDir")
  @js.native
  val nsisTemplatesDir: String = js.native
}

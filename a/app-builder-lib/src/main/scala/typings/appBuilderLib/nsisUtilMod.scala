package typings.appBuilderLib

import typings.appBuilderLib.nsisTargetMod.NsisTarget
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisUtilMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "AppPackageHelper")
  @js.native
  class AppPackageHelper protected () extends StObject {
    def this(elevateHelper: CopyElevateHelper) = this()
    
    val archToFileInfo: js.Any = js.native
    
    val elevateHelper: js.Any = js.native
    
    def finishBuild(): js.Promise[_] = js.native
    
    val infoToIsDelete: js.Any = js.native
    
    def packArch(arch: Arch, target: NsisTarget): js.Promise[PackageFileInfo] = js.native
    
    /** @private */
    var refCount: Double = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "CopyElevateHelper")
  @js.native
  class CopyElevateHelper () extends StObject {
    
    val copied: js.Any = js.native
    
    def copy(appOutDir: String, target: NsisTarget): js.Promise[_] = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "NSIS_PATH")
  @js.native
  def NSIS_PATH(): js.Promise[String] = js.native
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader")
  @js.native
  class UninstallerReader () extends StObject
  /* static members */
  object UninstallerReader {
    
    @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader.exec")
    @js.native
    def exec(installerPath: String, uninstallerPath: String): Unit = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "nsisTemplatesDir")
  @js.native
  val nsisTemplatesDir: String = js.native
}

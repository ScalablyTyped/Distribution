package typings.appBuilderLib

import typings.appBuilderLib.nsisOptionsMod.NsisOptions
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
  open class AppPackageHelper protected () extends StObject {
    def this(elevateHelper: CopyElevateHelper) = this()
    
    /* private */ val archToFileInfo: Any = js.native
    
    /* private */ val elevateHelper: Any = js.native
    
    def finishBuild(): js.Promise[Any] = js.native
    
    /* private */ val infoToIsDelete: Any = js.native
    
    def packArch(arch: Arch, target: NsisTarget): js.Promise[PackageFileInfo] = js.native
    
    /** @private */
    var refCount: Double = js.native
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "CopyElevateHelper")
  @js.native
  open class CopyElevateHelper () extends StObject {
    
    /* private */ val copied: Any = js.native
    
    def copy(appOutDir: String, target: NsisTarget): js.Promise[Any] = js.native
  }
  
  inline def NSIS_PATH(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("NSIS_PATH")().asInstanceOf[js.Promise[String]]
  
  object NsisTargetOptions {
    
    @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "NsisTargetOptions")
    @js.native
    val ^ : js.Any = js.native
    
    inline def resolve(options: NsisOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def `then`(callback: js.Function1[/* options */ NsisOptions, Any]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("then")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader")
  @js.native
  open class UninstallerReader () extends StObject
  /* static members */
  object UninstallerReader {
    
    @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "UninstallerReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def exec(installerPath: String, uninstallerPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("exec")(installerPath.asInstanceOf[js.Any], uninstallerPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @JSImport("app-builder-lib/out/targets/nsis/nsisUtil", "nsisTemplatesDir")
  @js.native
  val nsisTemplatesDir: String = js.native
}

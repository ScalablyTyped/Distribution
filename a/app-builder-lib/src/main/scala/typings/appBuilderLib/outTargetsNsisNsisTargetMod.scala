package typings.appBuilderLib

import typings.appBuilderLib.outCoreMod.Target
import typings.appBuilderLib.outTargetsNsisDefinesMod.Defines
import typings.appBuilderLib.outTargetsNsisNsisOptionsMod.NsisOptions
import typings.appBuilderLib.outTargetsNsisNsisUtilMod.AppPackageHelper
import typings.appBuilderLib.outWinPackagerMod.WinPackager
import typings.builderUtil.outArchMod.Arch
import typings.builderUtilRuntime.outUpdateInfoMod.PackageFileInfo
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisNsisTargetMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/NsisTarget", "NsisTarget")
  @js.native
  open class NsisTarget protected () extends Target {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
    
    /** @private */
    val archs: Map[Arch, String] = js.native
    
    /** @private */
    def buildAppPackage(appOutDir: String, arch: Arch): js.Promise[PackageFileInfo] = js.native
    
    /* private */ var buildInstaller: Any = js.native
    
    /* private */ var computeCommonInstallerScriptHeader: Any = js.native
    
    /* private */ var computeFinalScript: Any = js.native
    
    /* private */ var computeScriptAndSignUninstaller: Any = js.native
    
    /* private */ var computeVersionKey: Any = js.native
    
    /* protected */ def configureDefines(oneClick: Boolean, defines: Defines): js.Promise[Any] = js.native
    
    /* private */ var configureDefinesForAllTypeOfInstaller: Any = js.native
    
    /* private */ var executeMakensis: Any = js.native
    
    /* protected */ def generateGitHubInstallerName(): String = js.native
    
    /* private */ var getPreCompressedFileExtensions: Any = js.native
    
    /* protected */ def installerFilenamePattern: String = js.native
    
    def isBuildDifferentialAware: Boolean = js.native
    
    /* private */ def isPortable: Any = js.native
    
    /* private */ def isUnicodeEnabled: Any = js.native
    
    def isWebInstaller: Boolean = js.native
    
    @JSName("options")
    val options_NsisTarget: NsisOptions = js.native
    
    /* protected */ val packageHelper: AppPackageHelper = js.native
    
    val packager: WinPackager = js.native
  }
}

package typings.appBuilderLib

import typings.appBuilderLib.coreMod.Target
import typings.appBuilderLib.nsisOptionsMod.NsisOptions
import typings.appBuilderLib.nsisUtilMod.AppPackageHelper
import typings.appBuilderLib.winPackagerMod.WinPackager
import typings.builderUtil.archMod.Arch
import typings.builderUtilRuntime.updateInfoMod.PackageFileInfo
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nsisTargetMod {
  
  @JSImport("app-builder-lib/out/targets/nsis/NsisTarget", "NsisTarget")
  @js.native
  class NsisTarget protected () extends Target {
    def this(packager: WinPackager, outDir: String, targetName: String, packageHelper: AppPackageHelper) = this()
    
    /** @private */
    val archs: Map[Arch, String] = js.native
    
    /** @private */
    def buildAppPackage(appOutDir: String, arch: Arch): js.Promise[PackageFileInfo] = js.native
    
    /* private */ var buildInstaller: js.Any = js.native
    
    /* private */ var computeCommonInstallerScriptHeader: js.Any = js.native
    
    /* private */ var computeFinalScript: js.Any = js.native
    
    /* private */ var computeScriptAndSignUninstaller: js.Any = js.native
    
    /* private */ var computeVersionKey: js.Any = js.native
    
    /* protected */ def configureDefines(oneClick: Boolean, defines: js.Any): js.Promise[js.Any] = js.native
    
    /* private */ var configureDefinesForAllTypeOfInstaller: js.Any = js.native
    
    /* private */ var executeMakensis: js.Any = js.native
    
    /* protected */ def generateGitHubInstallerName(): String = js.native
    
    /* private */ var getPreCompressedFileExtensions: js.Any = js.native
    
    /* protected */ def installerFilenamePattern: String = js.native
    
    def isBuildDifferentialAware: Boolean = js.native
    
    /* private */ def isPortable: js.Any = js.native
    
    /* private */ def isUnicodeEnabled: js.Any = js.native
    
    def isWebInstaller: Boolean = js.native
    
    @JSName("options")
    val options_NsisTarget: NsisOptions = js.native
    
    /* protected */ val packageHelper: AppPackageHelper = js.native
    
    val packager: WinPackager = js.native
  }
}

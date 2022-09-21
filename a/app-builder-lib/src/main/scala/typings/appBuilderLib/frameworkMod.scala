package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typings.appBuilderLib.integrityMod.AsarIntegrity
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.PlatformPackager
import typings.builderUtil.fsMod.FileTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkMod {
  
  @JSImport("app-builder-lib/out/Framework", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isElectronBased(framework: Framework): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElectronBased")(framework.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait BeforeCopyExtraFilesOptions extends StObject {
    
    var appOutDir: String
    
    var asarIntegrity: AsarIntegrity | Null
    
    var packager: PlatformPackager[Any]
    
    var platformName: String
  }
  object BeforeCopyExtraFilesOptions {
    
    inline def apply(appOutDir: String, packager: PlatformPackager[Any], platformName: String): BeforeCopyExtraFilesOptions = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], asarIntegrity = null)
      __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
    }
    
    extension [Self <: BeforeCopyExtraFilesOptions](x: Self) {
      
      inline def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      inline def setAsarIntegrity(value: AsarIntegrity): Self = StObject.set(x, "asarIntegrity", value.asInstanceOf[js.Any])
      
      inline def setAsarIntegrityNull: Self = StObject.set(x, "asarIntegrity", null)
      
      inline def setPackager(value: PlatformPackager[Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Framework extends StObject {
    
    var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[Any]]] = js.undefined
    
    var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[Any]]] = js.undefined
    
    var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.undefined
    
    val defaultAppIdPrefix: String
    
    val distMacOsAppName: String
    
    var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
    
    var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.undefined
    
    var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.undefined
    
    val isCopyElevateHelper: Boolean
    
    val isNpmRebuildRequired: Boolean
    
    val macOsDefaultTargets: js.Array[String]
    
    val name: String
    
    def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[Any]
    
    val version: String
  }
  object Framework {
    
    inline def apply(
      defaultAppIdPrefix: String,
      distMacOsAppName: String,
      isCopyElevateHelper: Boolean,
      isNpmRebuildRequired: Boolean,
      macOsDefaultTargets: js.Array[String],
      name: String,
      prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => js.Promise[Any],
      version: String
    ): Framework = {
      val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prepareApplicationStageDirectory = js.Any.fromFunction1(prepareApplicationStageDirectory), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Framework]
    }
    
    extension [Self <: Framework](x: Self) {
      
      inline def setAfterPack(value: /* context */ AfterPackContext => js.Promise[Any]): Self = StObject.set(x, "afterPack", js.Any.fromFunction1(value))
      
      inline def setAfterPackUndefined: Self = StObject.set(x, "afterPack", js.undefined)
      
      inline def setBeforeCopyExtraFiles(value: /* options */ BeforeCopyExtraFilesOptions => js.Promise[Any]): Self = StObject.set(x, "beforeCopyExtraFiles", js.Any.fromFunction1(value))
      
      inline def setBeforeCopyExtraFilesUndefined: Self = StObject.set(x, "beforeCopyExtraFiles", js.undefined)
      
      inline def setCreateTransformer(value: () => FileTransformer | Null): Self = StObject.set(x, "createTransformer", js.Any.fromFunction0(value))
      
      inline def setCreateTransformerUndefined: Self = StObject.set(x, "createTransformer", js.undefined)
      
      inline def setDefaultAppIdPrefix(value: String): Self = StObject.set(x, "defaultAppIdPrefix", value.asInstanceOf[js.Any])
      
      inline def setDistMacOsAppName(value: String): Self = StObject.set(x, "distMacOsAppName", value.asInstanceOf[js.Any])
      
      inline def setGetDefaultIcon(value: /* platform */ Platform => String | Null): Self = StObject.set(x, "getDefaultIcon", js.Any.fromFunction1(value))
      
      inline def setGetDefaultIconUndefined: Self = StObject.set(x, "getDefaultIcon", js.undefined)
      
      inline def setGetExcludedDependencies(value: /* platform */ Platform => js.Array[String] | Null): Self = StObject.set(x, "getExcludedDependencies", js.Any.fromFunction1(value))
      
      inline def setGetExcludedDependenciesUndefined: Self = StObject.set(x, "getExcludedDependencies", js.undefined)
      
      inline def setGetMainFile(value: /* platform */ Platform => String | Null): Self = StObject.set(x, "getMainFile", js.Any.fromFunction1(value))
      
      inline def setGetMainFileUndefined: Self = StObject.set(x, "getMainFile", js.undefined)
      
      inline def setIsCopyElevateHelper(value: Boolean): Self = StObject.set(x, "isCopyElevateHelper", value.asInstanceOf[js.Any])
      
      inline def setIsNpmRebuildRequired(value: Boolean): Self = StObject.set(x, "isNpmRebuildRequired", value.asInstanceOf[js.Any])
      
      inline def setMacOsDefaultTargets(value: js.Array[String]): Self = StObject.set(x, "macOsDefaultTargets", value.asInstanceOf[js.Any])
      
      inline def setMacOsDefaultTargetsVarargs(value: String*): Self = StObject.set(x, "macOsDefaultTargets", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPrepareApplicationStageDirectory(value: PrepareApplicationStageDirectoryOptions => js.Promise[Any]): Self = StObject.set(x, "prepareApplicationStageDirectory", js.Any.fromFunction1(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrepareApplicationStageDirectoryOptions extends StObject {
    
    /**
      * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
      */
    val appOutDir: String
    
    val arch: String
    
    val packager: PlatformPackager[Any]
    
    val platformName: ElectronPlatformName
    
    val version: String
  }
  object PrepareApplicationStageDirectoryOptions {
    
    inline def apply(
      appOutDir: String,
      arch: String,
      packager: PlatformPackager[Any],
      platformName: ElectronPlatformName,
      version: String
    ): PrepareApplicationStageDirectoryOptions = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
    }
    
    extension [Self <: PrepareApplicationStageDirectoryOptions](x: Self) {
      
      inline def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setPackager(value: PlatformPackager[Any]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPlatformName(value: ElectronPlatformName): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

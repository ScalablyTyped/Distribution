package typings.appBuilderLib

import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typings.appBuilderLib.integrityMod.AsarIntegrity
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.PlatformPackager
import typings.builderUtil.fsMod.FileTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameworkMod {
  
  @JSImport("app-builder-lib/out/Framework", "isElectronBased")
  @js.native
  def isElectronBased(framework: Framework): Boolean = js.native
  
  @js.native
  trait BeforeCopyExtraFilesOptions extends StObject {
    
    var appOutDir: String = js.native
    
    var asarIntegrity: AsarIntegrity | Null = js.native
    
    var packager: PlatformPackager[_] = js.native
    
    var platformName: String = js.native
  }
  object BeforeCopyExtraFilesOptions {
    
    @scala.inline
    def apply(appOutDir: String, packager: PlatformPackager[_], platformName: String): BeforeCopyExtraFilesOptions = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeCopyExtraFilesOptions]
    }
    
    @scala.inline
    implicit class BeforeCopyExtraFilesOptionsMutableBuilder[Self <: BeforeCopyExtraFilesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsarIntegrity(value: AsarIntegrity): Self = StObject.set(x, "asarIntegrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsarIntegrityNull: Self = StObject.set(x, "asarIntegrity", null)
      
      @scala.inline
      def setPackager(value: PlatformPackager[_]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformName(value: String): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Framework extends StObject {
    
    var afterPack: js.UndefOr[js.Function1[/* context */ AfterPackContext, js.Promise[_]]] = js.native
    
    var beforeCopyExtraFiles: js.UndefOr[js.Function1[/* options */ BeforeCopyExtraFilesOptions, js.Promise[_]]] = js.native
    
    var createTransformer: js.UndefOr[js.Function0[FileTransformer | Null]] = js.native
    
    val defaultAppIdPrefix: String = js.native
    
    val distMacOsAppName: String = js.native
    
    var getDefaultIcon: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
    
    var getExcludedDependencies: js.UndefOr[js.Function1[/* platform */ Platform, js.Array[String] | Null]] = js.native
    
    var getMainFile: js.UndefOr[js.Function1[/* platform */ Platform, String | Null]] = js.native
    
    val isCopyElevateHelper: Boolean = js.native
    
    val isNpmRebuildRequired: Boolean = js.native
    
    val macOsDefaultTargets: js.Array[String] = js.native
    
    val name: String = js.native
    
    def prepareApplicationStageDirectory(options: PrepareApplicationStageDirectoryOptions): js.Promise[_] = js.native
    
    val version: String = js.native
  }
  object Framework {
    
    @scala.inline
    def apply(
      defaultAppIdPrefix: String,
      distMacOsAppName: String,
      isCopyElevateHelper: Boolean,
      isNpmRebuildRequired: Boolean,
      macOsDefaultTargets: js.Array[String],
      name: String,
      prepareApplicationStageDirectory: PrepareApplicationStageDirectoryOptions => js.Promise[_],
      version: String
    ): Framework = {
      val __obj = js.Dynamic.literal(defaultAppIdPrefix = defaultAppIdPrefix.asInstanceOf[js.Any], distMacOsAppName = distMacOsAppName.asInstanceOf[js.Any], isCopyElevateHelper = isCopyElevateHelper.asInstanceOf[js.Any], isNpmRebuildRequired = isNpmRebuildRequired.asInstanceOf[js.Any], macOsDefaultTargets = macOsDefaultTargets.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prepareApplicationStageDirectory = js.Any.fromFunction1(prepareApplicationStageDirectory), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Framework]
    }
    
    @scala.inline
    implicit class FrameworkMutableBuilder[Self <: Framework] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterPack(value: /* context */ AfterPackContext => js.Promise[_]): Self = StObject.set(x, "afterPack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPackUndefined: Self = StObject.set(x, "afterPack", js.undefined)
      
      @scala.inline
      def setBeforeCopyExtraFiles(value: /* options */ BeforeCopyExtraFilesOptions => js.Promise[_]): Self = StObject.set(x, "beforeCopyExtraFiles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCopyExtraFilesUndefined: Self = StObject.set(x, "beforeCopyExtraFiles", js.undefined)
      
      @scala.inline
      def setCreateTransformer(value: () => FileTransformer | Null): Self = StObject.set(x, "createTransformer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCreateTransformerUndefined: Self = StObject.set(x, "createTransformer", js.undefined)
      
      @scala.inline
      def setDefaultAppIdPrefix(value: String): Self = StObject.set(x, "defaultAppIdPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistMacOsAppName(value: String): Self = StObject.set(x, "distMacOsAppName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetDefaultIcon(value: /* platform */ Platform => String | Null): Self = StObject.set(x, "getDefaultIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDefaultIconUndefined: Self = StObject.set(x, "getDefaultIcon", js.undefined)
      
      @scala.inline
      def setGetExcludedDependencies(value: /* platform */ Platform => js.Array[String] | Null): Self = StObject.set(x, "getExcludedDependencies", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetExcludedDependenciesUndefined: Self = StObject.set(x, "getExcludedDependencies", js.undefined)
      
      @scala.inline
      def setGetMainFile(value: /* platform */ Platform => String | Null): Self = StObject.set(x, "getMainFile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetMainFileUndefined: Self = StObject.set(x, "getMainFile", js.undefined)
      
      @scala.inline
      def setIsCopyElevateHelper(value: Boolean): Self = StObject.set(x, "isCopyElevateHelper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNpmRebuildRequired(value: Boolean): Self = StObject.set(x, "isNpmRebuildRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacOsDefaultTargets(value: js.Array[String]): Self = StObject.set(x, "macOsDefaultTargets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacOsDefaultTargetsVarargs(value: String*): Self = StObject.set(x, "macOsDefaultTargets", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrepareApplicationStageDirectory(value: PrepareApplicationStageDirectoryOptions => js.Promise[_]): Self = StObject.set(x, "prepareApplicationStageDirectory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrepareApplicationStageDirectoryOptions extends StObject {
    
    /**
      * Platform doesn't process application output directory in any way. Unpack implementation must create or empty dir if need.
      */
    val appOutDir: String = js.native
    
    val arch: String = js.native
    
    val packager: PlatformPackager[_] = js.native
    
    val platformName: ElectronPlatformName = js.native
    
    val version: String = js.native
  }
  object PrepareApplicationStageDirectoryOptions {
    
    @scala.inline
    def apply(
      appOutDir: String,
      arch: String,
      packager: PlatformPackager[_],
      platformName: ElectronPlatformName,
      version: String
    ): PrepareApplicationStageDirectoryOptions = {
      val __obj = js.Dynamic.literal(appOutDir = appOutDir.asInstanceOf[js.Any], arch = arch.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], platformName = platformName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrepareApplicationStageDirectoryOptions]
    }
    
    @scala.inline
    implicit class PrepareApplicationStageDirectoryOptionsMutableBuilder[Self <: PrepareApplicationStageDirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppOutDir(value: String): Self = StObject.set(x, "appOutDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPackager(value: PlatformPackager[_]): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformName(value: ElectronPlatformName): Self = StObject.set(x, "platformName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

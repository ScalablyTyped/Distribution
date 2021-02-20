package typings.appBuilderLib

import typings.appBuilderLib.appInfoMod.AppInfo
import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.coreMod.CompressionLevel
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import typings.appBuilderLib.electronFrameworkMod.ElectronPlatformName
import typings.appBuilderLib.fileAssociationMod.FileAssociation
import typings.appBuilderLib.fileMatcherMod.GetFileMatchersOptions
import typings.appBuilderLib.mod.Packager
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.Target
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.platformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
import typings.builderUtil.archMod.Arch
import typings.builderUtil.fsMod.FileTransformer
import typings.builderUtil.mod.AsyncTaskManager
import typings.builderUtil.mod.DebugLogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformPackagerMod {
  
  @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
  @js.native
  abstract class PlatformPackager[DC /* <: PlatformSpecificBuildOptions */] protected () extends StObject {
    protected def this(info: Packager, platform: Platform) = this()
    
    val _resourceList: js.Any = js.native
    
    val appInfo: AppInfo = js.native
    
    def buildResourcesDir: String = js.native
    
    var checkFileInPackage: js.Any = js.native
    
    def compression: CompressionLevel = js.native
    
    /* protected */ def computeAppOutDir(outDir: String, arch: Arch): String = js.native
    
    var computeArtifactName: js.Any = js.native
    
    var computeAsarOptions: js.Any = js.native
    
    def computeSafeArtifactName(suggestedName: String, ext: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: js.UndefOr[scala.Nothing], skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Null,
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Null, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: String,
      ext: String,
      arch: Arch,
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: String, ext: String, arch: Arch, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: js.UndefOr[scala.Nothing], skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean,
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Null,
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Null, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch): String | Null = js.native
    def computeSafeArtifactName(
      suggestedName: Null,
      ext: String,
      arch: Arch,
      skipArchIfX64: js.UndefOr[scala.Nothing],
      safePattern: String
    ): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipArchIfX64: Boolean): String | Null = js.native
    def computeSafeArtifactName(suggestedName: Null, ext: String, arch: Arch, skipArchIfX64: Boolean, safePattern: String): String | Null = js.native
    
    def config: Configuration = js.native
    
    var copyAppFiles: js.Any = js.native
    
    def createGetFileMatchersOptions(outDir: String, arch: Arch, customBuildOptions: PlatformSpecificBuildOptions): GetFileMatchersOptions = js.native
    
    def createTargets(
      targets: js.Array[String],
      mapper: js.Function2[/* name */ String, /* factory */ js.Function1[/* outDir */ String, Target], Unit]
    ): Unit = js.native
    
    /* protected */ def createTransformerForExtraFiles(packContext: AfterPackContext): FileTransformer | Null = js.native
    
    def debugLogger: DebugLogger = js.native
    
    def defaultTarget: js.Array[String] = js.native
    
    def dispatchArtifactCreated(file: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Arch): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Null, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Null, safeArtifactName: String): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Arch): js.Promise[Unit] = js.native
    def dispatchArtifactCreated(file: String, target: Target, arch: Arch, safeArtifactName: String): js.Promise[Unit] = js.native
    
    /* protected */ def doGetCscPassword(): js.UndefOr[String | Null] = js.native
    
    /* protected */ def doPack(
      outDir: String,
      appOutDir: String,
      platformName: ElectronPlatformName,
      arch: Arch,
      platformSpecificBuildOptions: DC,
      targets: js.Array[Target]
    ): js.Promise[Unit] = js.native
    
    def expandArtifactBeautyNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String): String = js.native
    def expandArtifactBeautyNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch): String = js.native
    
    def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: String
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: Null,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Null, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: Null,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: Arch,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: String, arch: Arch, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: js.UndefOr[scala.Nothing],
      ext: String,
      arch: Arch,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: js.UndefOr[scala.Nothing], defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: Null,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Null, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: Null,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: Arch,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: Null, ext: String, arch: Arch, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: Null,
      ext: String,
      arch: Arch,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: String
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: js.UndefOr[scala.Nothing],
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: Null,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Null, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: Null,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: Arch,
      defaultPattern: js.UndefOr[scala.Nothing],
      skipArchIfX64: Boolean
    ): String = js.native
    def expandArtifactNamePattern(targetSpecificOptions: TargetSpecificOptions, ext: String, arch: Arch, defaultPattern: String): String = js.native
    def expandArtifactNamePattern(
      targetSpecificOptions: TargetSpecificOptions,
      ext: String,
      arch: Arch,
      defaultPattern: String,
      skipArchIfX64: Boolean
    ): String = js.native
    
    def expandMacro(pattern: String): String = js.native
    def expandMacro(
      pattern: String,
      arch: js.UndefOr[scala.Nothing],
      extra: js.UndefOr[scala.Nothing],
      isProductNameSanitized: Boolean
    ): String = js.native
    def expandMacro(pattern: String, arch: js.UndefOr[scala.Nothing], extra: js.Any): String = js.native
    def expandMacro(pattern: String, arch: js.UndefOr[scala.Nothing], extra: js.Any, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: String): String = js.native
    def expandMacro(pattern: String, arch: String, extra: js.UndefOr[scala.Nothing], isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: String, extra: js.Any): String = js.native
    def expandMacro(pattern: String, arch: String, extra: js.Any, isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: js.UndefOr[scala.Nothing], isProductNameSanitized: Boolean): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: js.Any): String = js.native
    def expandMacro(pattern: String, arch: Null, extra: js.Any, isProductNameSanitized: Boolean): String = js.native
    
    def fileAssociations: js.Array[FileAssociation] = js.native
    
    def forceCodeSigning: Boolean = js.native
    
    def generateName2(ext: String, classifier: js.UndefOr[scala.Nothing], deployment: Boolean): String = js.native
    def generateName2(ext: String, classifier: String, deployment: Boolean): String = js.native
    def generateName2(ext: String, classifier: Null, deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: js.UndefOr[scala.Nothing], deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: String, deployment: Boolean): String = js.native
    def generateName2(ext: Null, classifier: Null, deployment: Boolean): String = js.native
    
    /* protected */ def getCscLink(): js.UndefOr[String | Null] = js.native
    /* protected */ def getCscLink(extraEnvName: String): js.UndefOr[String | Null] = js.native
    
    /* protected */ def getCscPassword(): String = js.native
    
    def getDefaultFrameworkIcon(): String | Null = js.native
    
    def getElectronDestinationDir(appOutDir: String): String = js.native
    
    def getElectronSrcDir(dist: String): String = js.native
    
    var getExtraFileMatchers: js.Any = js.native
    
    def getIconPath(): js.Promise[String | Null] = js.native
    
    def getMacOsResourcesDir(appOutDir: String): String = js.native
    
    /* protected */ def getOrConvertIcon(format: IconFormat): js.Promise[String | Null] = js.native
    
    def getResource(custom: js.UndefOr[scala.Nothing], names: String*): js.Promise[String | Null] = js.native
    def getResource(custom: String, names: String*): js.Promise[String | Null] = js.native
    def getResource(custom: Null, names: String*): js.Promise[String | Null] = js.native
    
    def getResourcesDir(appOutDir: String): String = js.native
    
    def getTempFile(suffix: String): js.Promise[String] = js.native
    
    val info: Packager = js.native
    
    def pack(outDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): js.Promise[_] = js.native
    
    /* protected */ def packageInDistributableFormat(appOutDir: String, arch: Arch, targets: js.Array[Target], taskManager: AsyncTaskManager): Unit = js.native
    
    def packagerOptions: PackagerOptions = js.native
    
    val platform: Platform = js.native
    
    val platformSpecificBuildOptions: DC = js.native
    
    /* protected */ def prepareAppInfo(appInfo: AppInfo): AppInfo = js.native
    
    def projectDir: String = js.native
    
    def resolveIcon(sources: js.Array[String], fallbackSources: js.Array[String], outputFormat: IconFormat): js.Promise[js.Array[IconInfo]] = js.native
    
    def resourceList: js.Promise[js.Array[String]] = js.native
    
    var sanityCheckPackage: js.Any = js.native
    
    /* protected */ def signApp(packContext: AfterPackContext, isAsar: Boolean): js.Promise[_] = js.native
  }
  /* static members */
  object PlatformPackager {
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager.buildAsyncTargets")
    @js.native
    def buildAsyncTargets: js.Any = js.native
    @scala.inline
    def buildAsyncTargets_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildAsyncTargets")(x.asInstanceOf[js.Any])
    
    @JSImport("app-builder-lib/out/platformPackager", "PlatformPackager.normalizePlatformSpecificBuildOptions")
    @js.native
    def normalizePlatformSpecificBuildOptions: js.Any = js.native
    @scala.inline
    def normalizePlatformSpecificBuildOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normalizePlatformSpecificBuildOptions")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("app-builder-lib/out/platformPackager", "chooseNotNull")
  @js.native
  def chooseNotNull(): js.UndefOr[String | Null] = js.native
  @JSImport("app-builder-lib/out/platformPackager", "chooseNotNull")
  @js.native
  def chooseNotNull(v1: js.UndefOr[scala.Nothing], v2: String): js.UndefOr[String | Null] = js.native
  @JSImport("app-builder-lib/out/platformPackager", "chooseNotNull")
  @js.native
  def chooseNotNull(v1: String): js.UndefOr[String | Null] = js.native
  @JSImport("app-builder-lib/out/platformPackager", "chooseNotNull")
  @js.native
  def chooseNotNull(v1: String, v2: String): js.UndefOr[String | Null] = js.native
  @JSImport("app-builder-lib/out/platformPackager", "chooseNotNull")
  @js.native
  def chooseNotNull(v1: Null, v2: String): js.UndefOr[String | Null] = js.native
  
  @JSImport("app-builder-lib/out/platformPackager", "computeSafeArtifactNameIfNeeded")
  @js.native
  def computeSafeArtifactNameIfNeeded(suggestedName: String, safeNameProducer: js.Function0[String]): String | Null = js.native
  @JSImport("app-builder-lib/out/platformPackager", "computeSafeArtifactNameIfNeeded")
  @js.native
  def computeSafeArtifactNameIfNeeded(suggestedName: Null, safeNameProducer: js.Function0[String]): String | Null = js.native
  
  @JSImport("app-builder-lib/out/platformPackager", "isSafeGithubName")
  @js.native
  def isSafeGithubName(name: String): Boolean = js.native
  
  @JSImport("app-builder-lib/out/platformPackager", "isSafeToUnpackElectronOnRemoteBuildServer")
  @js.native
  def isSafeToUnpackElectronOnRemoteBuildServer(packager: PlatformPackager[_]): Boolean = js.native
  
  @JSImport("app-builder-lib/out/platformPackager", "normalizeExt")
  @js.native
  def normalizeExt(ext: String): String = js.native
  
  @JSImport("app-builder-lib/out/platformPackager", "resolveFunction")
  @js.native
  def resolveFunction[T](executor: T, name: String): T = js.native
  @JSImport("app-builder-lib/out/platformPackager", "resolveFunction")
  @js.native
  def resolveFunction[T](executor: String, name: String): T = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.appBuilderLib.appBuilderLibStrings.icns
    - typings.appBuilderLib.appBuilderLibStrings.ico
    - typings.appBuilderLib.appBuilderLibStrings.set
  */
  trait IconFormat extends StObject
  object IconFormat {
    
    @scala.inline
    def icns: typings.appBuilderLib.appBuilderLibStrings.icns = "icns".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.icns]
    
    @scala.inline
    def ico: typings.appBuilderLib.appBuilderLibStrings.ico = "ico".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.ico]
    
    @scala.inline
    def set: typings.appBuilderLib.appBuilderLibStrings.set = "set".asInstanceOf[typings.appBuilderLib.appBuilderLibStrings.set]
  }
  
  @js.native
  trait IconInfo extends StObject {
    
    var file: String = js.native
    
    var size: Double = js.native
  }
  object IconInfo {
    
    @scala.inline
    def apply(file: String, size: Double): IconInfo = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconInfo]
    }
    
    @scala.inline
    implicit class IconInfoMutableBuilder[Self <: IconInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}

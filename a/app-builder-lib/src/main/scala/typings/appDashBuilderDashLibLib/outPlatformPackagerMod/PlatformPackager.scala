package typings
package appDashBuilderDashLibLib.outPlatformPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
@js.native
abstract class PlatformPackager[DC /* <: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions */] protected () extends js.Object {
  protected def this(info: appDashBuilderDashLibLib.outMod.Packager, platform: appDashBuilderDashLibLib.outMod.Platform) = this()
  val _resourceList: js.Any = js.native
  val appInfo: appDashBuilderDashLibLib.outAppInfoMod.AppInfo = js.native
  val buildResourcesDir: java.lang.String = js.native
  var checkFileInPackage: js.Any = js.native
  val compression: appDashBuilderDashLibLib.outCoreMod.CompressionLevel = js.native
  var computeArtifactName: js.Any = js.native
  var computeAsarOptions: js.Any = js.native
  val config: appDashBuilderDashLibLib.outConfigurationMod.Configuration = js.native
  var copyAppFiles: js.Any = js.native
  val debugLogger: builderDashUtilLib.builderDashUtilMod.DebugLogger = js.native
  val defaultTarget: js.Array[java.lang.String] = js.native
  val electronDistExecutableName: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.electron | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.brave = js.native
  val electronDistMacOsExecutableName: appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Electron | appDashBuilderDashLibLib.appDashBuilderDashLibLibStrings.Brave = js.native
  val fileAssociations: js.Array[appDashBuilderDashLibLib.outOptionsFileAssociationMod.FileAssociation] = js.native
  val forceCodeSigning: scala.Boolean = js.native
  var getExtraFileMatchers: js.Any = js.native
  val info: appDashBuilderDashLibLib.outMod.Packager = js.native
  val packagerOptions: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions = js.native
  val platform: appDashBuilderDashLibLib.outMod.Platform = js.native
  val platformSpecificBuildOptions: DC = js.native
  val projectDir: java.lang.String = js.native
  val resourceList: stdLib.Promise[js.Array[java.lang.String]] = js.native
  var sanityCheckPackage: js.Any = js.native
  /* protected */ def computeAppOutDir(outDir: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
  def computeSafeArtifactName(suggestedName: java.lang.String, ext: java.lang.String): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(suggestedName: java.lang.String, ext: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: java.lang.String,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    skipArchIfX64: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: java.lang.String,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    skipArchIfX64: scala.Boolean,
    safePattern: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: java.lang.String,
    ext: java.lang.String,
    arch: scala.Null,
    skipArchIfX64: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: java.lang.String,
    ext: java.lang.String,
    arch: scala.Null,
    skipArchIfX64: scala.Boolean,
    safePattern: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(suggestedName: scala.Null, ext: java.lang.String): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(suggestedName: scala.Null, ext: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: scala.Null,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    skipArchIfX64: scala.Boolean
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: scala.Null,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    skipArchIfX64: scala.Boolean,
    safePattern: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(suggestedName: scala.Null, ext: java.lang.String, arch: scala.Null, skipArchIfX64: scala.Boolean): java.lang.String | scala.Null = js.native
  def computeSafeArtifactName(
    suggestedName: scala.Null,
    ext: java.lang.String,
    arch: scala.Null,
    skipArchIfX64: scala.Boolean,
    safePattern: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def createGetFileMatchersOptions(
    outDir: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    customBuildOptions: appDashBuilderDashLibLib.outOptionsPlatformSpecificBuildOptionsMod.PlatformSpecificBuildOptions
  ): appDashBuilderDashLibLib.outFileMatcherMod.GetFileMatchersOptions = js.native
  def createTargets(
    targets: js.Array[java.lang.String],
    mapper: js.Function2[
      /* name */ java.lang.String, 
      /* factory */ js.Function1[/* outDir */ java.lang.String, appDashBuilderDashLibLib.outMod.Target], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* protected */ def createTransformerForExtraFiles(packContext: appDashBuilderDashLibLib.outConfigurationMod.AfterPackContext): builderDashUtilLib.outFsMod.FileTransformer | scala.Null = js.native
  def dispatchArtifactCreated(file: java.lang.String): scala.Unit = js.native
  def dispatchArtifactCreated(file: java.lang.String, target: appDashBuilderDashLibLib.outMod.Target): scala.Unit = js.native
  def dispatchArtifactCreated(
    file: java.lang.String,
    target: appDashBuilderDashLibLib.outMod.Target,
    arch: builderDashUtilLib.outArchMod.Arch
  ): scala.Unit = js.native
  def dispatchArtifactCreated(
    file: java.lang.String,
    target: appDashBuilderDashLibLib.outMod.Target,
    arch: builderDashUtilLib.outArchMod.Arch,
    safeArtifactName: java.lang.String
  ): scala.Unit = js.native
  def dispatchArtifactCreated(
    file: java.lang.String,
    target: appDashBuilderDashLibLib.outMod.Target,
    arch: scala.Null,
    safeArtifactName: java.lang.String
  ): scala.Unit = js.native
  def dispatchArtifactCreated(file: java.lang.String, target: scala.Null, arch: builderDashUtilLib.outArchMod.Arch): scala.Unit = js.native
  def dispatchArtifactCreated(
    file: java.lang.String,
    target: scala.Null,
    arch: builderDashUtilLib.outArchMod.Arch,
    safeArtifactName: java.lang.String
  ): scala.Unit = js.native
  def dispatchArtifactCreated(file: java.lang.String, target: scala.Null, arch: scala.Null, safeArtifactName: java.lang.String): scala.Unit = js.native
  /* protected */ def doGetCscPassword(): js.UndefOr[java.lang.String | scala.Null] = js.native
  /* protected */ def doPack(
    outDir: java.lang.String,
    appOutDir: java.lang.String,
    platformName: appDashBuilderDashLibLib.outElectronElectronFrameworkMod.ElectronPlatformName,
    arch: builderDashUtilLib.outArchMod.Arch,
    platformSpecificBuildOptions: DC,
    targets: js.Array[appDashBuilderDashLibLib.outMod.Target]
  ): stdLib.Promise[scala.Unit] = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: appDashBuilderDashLibLib.outCoreMod.TargetSpecificOptions,
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: js.UndefOr[scala.Nothing], ext: java.lang.String): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: js.UndefOr[scala.Nothing],
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: scala.Null, ext: java.lang.String): java.lang.String = js.native
  def expandArtifactNamePattern(targetSpecificOptions: scala.Null, ext: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: scala.Null,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: scala.Null,
    ext: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: scala.Null,
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String
  ): java.lang.String = js.native
  def expandArtifactNamePattern(
    targetSpecificOptions: scala.Null,
    ext: java.lang.String,
    arch: scala.Null,
    defaultPattern: java.lang.String,
    skipArchIfX64: scala.Boolean
  ): java.lang.String = js.native
  def expandMacro(pattern: java.lang.String): java.lang.String = js.native
  def expandMacro(pattern: java.lang.String, arch: java.lang.String): java.lang.String = js.native
  def expandMacro(pattern: java.lang.String, arch: java.lang.String, extra: js.Any): java.lang.String = js.native
  def expandMacro(
    pattern: java.lang.String,
    arch: java.lang.String,
    extra: js.Any,
    isProductNameSanitized: scala.Boolean
  ): java.lang.String = js.native
  def expandMacro(pattern: java.lang.String, arch: scala.Null, extra: js.Any): java.lang.String = js.native
  def expandMacro(pattern: java.lang.String, arch: scala.Null, extra: js.Any, isProductNameSanitized: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: java.lang.String, classifier: java.lang.String, deployment: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: java.lang.String, classifier: js.UndefOr[scala.Nothing], deployment: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: java.lang.String, classifier: scala.Null, deployment: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: scala.Null, classifier: java.lang.String, deployment: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: scala.Null, classifier: js.UndefOr[scala.Nothing], deployment: scala.Boolean): java.lang.String = js.native
  def generateName2(ext: scala.Null, classifier: scala.Null, deployment: scala.Boolean): java.lang.String = js.native
  /* protected */ def getCscLink(): js.UndefOr[java.lang.String | scala.Null] = js.native
  /* protected */ def getCscLink(extraEnvName: java.lang.String): js.UndefOr[java.lang.String | scala.Null] = js.native
  /* protected */ def getCscPassword(): java.lang.String = js.native
  def getElectronDestinationDir(appOutDir: java.lang.String): java.lang.String = js.native
  def getElectronSrcDir(dist: java.lang.String): java.lang.String = js.native
  def getIconPath(): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getMacOsResourcesDir(appOutDir: java.lang.String): java.lang.String = js.native
  /* protected */ def getOrConvertIcon(format: IconFormat): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getResource(custom: java.lang.String, names: java.lang.String*): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getResource(names: java.lang.String*): stdLib.Promise[java.lang.String | scala.Null] = js.native
  def getResourcesDir(appOutDir: java.lang.String): java.lang.String = js.native
  def getTempFile(suffix: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def pack(
    outDir: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    targets: js.Array[appDashBuilderDashLibLib.outMod.Target],
    taskManager: builderDashUtilLib.builderDashUtilMod.AsyncTaskManager
  ): stdLib.Promise[_] = js.native
  /* protected */ def packageInDistributableFormat(
    appOutDir: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    targets: js.Array[appDashBuilderDashLibLib.outMod.Target],
    taskManager: builderDashUtilLib.builderDashUtilMod.AsyncTaskManager
  ): scala.Unit = js.native
  /* protected */ def prepareAppInfo(appInfo: appDashBuilderDashLibLib.outAppInfoMod.AppInfo): appDashBuilderDashLibLib.outAppInfoMod.AppInfo = js.native
  def resolveIcon(sources: js.Array[java.lang.String], outputFormat: IconFormat): stdLib.Promise[js.Array[IconInfo]] = js.native
  /* protected */ def signApp(packContext: appDashBuilderDashLibLib.outConfigurationMod.AfterPackContext, isAsar: scala.Boolean): stdLib.Promise[_] = js.native
}

@JSImport("app-builder-lib/out/platformPackager", "PlatformPackager")
@js.native
object PlatformPackager extends js.Object {
  var buildAsyncTargets: js.Any = js.native
  var normalizePlatformSpecificBuildOptions: js.Any = js.native
}


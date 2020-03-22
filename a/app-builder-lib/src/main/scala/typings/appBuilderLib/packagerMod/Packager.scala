package typings.appBuilderLib.packagerMod

import typings.appBuilderLib.appInfoMod.AppInfo
import typings.appBuilderLib.configurationMod.AfterPackContext
import typings.appBuilderLib.configurationMod.Configuration
import typings.appBuilderLib.coreMod.SourceRepositoryInfo
import typings.appBuilderLib.frameworkMod.Framework
import typings.appBuilderLib.metadataMod.Metadata
import typings.appBuilderLib.mod.Platform
import typings.appBuilderLib.mod.Target
import typings.appBuilderLib.packageDependenciesMod.NodeModuleDirInfo
import typings.appBuilderLib.packagerApiMod.ArtifactBuildStarted
import typings.appBuilderLib.packagerApiMod.ArtifactCreated
import typings.appBuilderLib.packagerApiMod.PackagerOptions
import typings.appBuilderLib.platformPackagerMod.PlatformPackager
import typings.builderUtil.archMod.Arch
import typings.builderUtil.mod.DebugLogger
import typings.builderUtil.mod.TmpDir
import typings.builderUtilRuntime.mod.CancellationToken
import typings.lazyVal.mod.Lazy
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/packager", "Packager")
@js.native
class Packager protected () extends js.Object {
  def this(options: PackagerOptions) = this()
  def this(options: PackagerOptions, cancellationToken: CancellationToken) = this()
  var _appDir: js.Any = js.native
  var _appInfo: AppInfo | Null = js.native
  var _buildResourcesDir: js.Any = js.native
  var _configuration: js.Any = js.native
  var _devMetadata: js.Any = js.native
  var _framework: js.Any = js.native
  var _isPrepackedAppAsar: js.Any = js.native
  var _metadata: js.Any = js.native
  var _nodeModulesHandledExternally: js.Any = js.native
  var _repositoryInfo: js.Any = js.native
  val afterPackHandlers: js.Any = js.native
  val cancellationToken: CancellationToken = js.native
  var createHelper: js.Any = js.native
  val debugLogger: DebugLogger = js.native
  var doBuild: js.Any = js.native
  val eventEmitter: EventEmitter = js.native
  var installAppDependencies: js.Any = js.native
  var isTwoPackageJsonProjectLayoutUsed: Boolean = js.native
  var nodeDependencyInfo: js.Any = js.native
  val options: PackagerOptions = js.native
  val projectDir: String = js.native
  var readProjectMetadataIfTwoPackageStructureOrPrepacked: js.Any = js.native
  val tempDirManager: TmpDir = js.native
  val toDispose: js.Any = js.native
  def _build(configuration: Configuration, metadata: Metadata): js.Promise[BuildResult] = js.native
  def _build(
    configuration: Configuration,
    metadata: Metadata,
    devMetadata: Null,
    repositoryInfo: SourceRepositoryInfo
  ): js.Promise[BuildResult] = js.native
  def _build(configuration: Configuration, metadata: Metadata, devMetadata: Metadata): js.Promise[BuildResult] = js.native
  def _build(
    configuration: Configuration,
    metadata: Metadata,
    devMetadata: Metadata,
    repositoryInfo: SourceRepositoryInfo
  ): js.Promise[BuildResult] = js.native
  def addAfterPackHandler(handler: js.Function1[/* context */ AfterPackContext, js.Promise[_] | Null]): Unit = js.native
  def afterPack(context: AfterPackContext): js.Promise[_] = js.native
  def appDir(): String = js.native
  def appInfo(): AppInfo = js.native
  def areNodeModulesHandledExternally(): Boolean = js.native
  def artifactCreated(handler: js.Function1[/* event */ ArtifactCreated, Unit]): Packager = js.native
  def build(): js.Promise[BuildResult] = js.native
  def buildResourcesDir(): String = js.native
  def callAppxManifestCreated(path: String): js.Promise[Unit] = js.native
  def callArtifactBuildCompleted(event: ArtifactCreated): js.Promise[Unit] = js.native
  def callArtifactBuildStarted(event: ArtifactBuildStarted): js.Promise[Unit] = js.native
  def callArtifactBuildStarted(event: ArtifactBuildStarted, logFields: js.Any): js.Promise[Unit] = js.native
  def config(): Configuration = js.native
  def devMetadata(): Metadata | Null = js.native
  /**
    * Only for sub artifacts (update info), for main artifacts use `callArtifactBuildCompleted`.
    */
  def dispatchArtifactCreated(event: ArtifactCreated): Unit = js.native
  def disposeOnBuildFinish(disposer: js.Function0[js.Promise[Unit]]): Unit = js.native
  def framework(): Framework = js.native
  def getNodeDependencyInfo(): Lazy[js.Array[NodeModuleDirInfo]] = js.native
  def getNodeDependencyInfo(platform: Platform): Lazy[js.Array[NodeModuleDirInfo]] = js.native
  def isPrepackedAppAsar(): Boolean = js.native
  def metadata(): Metadata = js.native
  def relativeBuildResourcesDirname(): String = js.native
  def repositoryInfo(): js.Promise[SourceRepositoryInfo | Null] = js.native
  def stageDirPathCustomizer(target: Target, packager: PlatformPackager[_], arch: Arch): String = js.native
}


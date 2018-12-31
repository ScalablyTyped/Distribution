package typings
package appDashBuilderDashLibLib.outPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/packager", "Packager")
@js.native
class Packager protected () extends js.Object {
  def this(options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions) = this()
  def this(options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions, cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken) = this()
  var _appDir: js.Any = js.native
  var _appInfo: appDashBuilderDashLibLib.outAppInfoMod.AppInfo | scala.Null = js.native
  var _buildResourcesDir: js.Any = js.native
  var _configuration: js.Any = js.native
  var _devMetadata: js.Any = js.native
  var _framework: js.Any = js.native
  var _isPrepackedAppAsar: js.Any = js.native
  var _metadata: js.Any = js.native
  var _nodeModulesHandledExternally: js.Any = js.native
  var _productionDeps: js.Any = js.native
  var _repositoryInfo: js.Any = js.native
  val afterPackHandlers: js.Any = js.native
  val appDir: java.lang.String = js.native
  val appInfo: appDashBuilderDashLibLib.outAppInfoMod.AppInfo = js.native
  val areNodeModulesHandledExternally: scala.Boolean = js.native
  val buildResourcesDir: java.lang.String = js.native
  val cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken = js.native
  val config: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Configuration */ js.Any = js.native
  var createHelper: js.Any = js.native
  val debugLogger: builderDashUtilLib.builderDashUtilMod.DebugLogger = js.native
  val devMetadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata | scala.Null = js.native
  var doBuild: js.Any = js.native
  val eventEmitter: nodeLib.eventsMod.EventEmitter = js.native
  val framework: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Framework */ js.Any = js.native
  var installAppDependencies: js.Any = js.native
  val isPrepackedAppAsar: scala.Boolean = js.native
  var isTwoPackageJsonProjectLayoutUsed: scala.Boolean = js.native
  val metadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata = js.native
  val options: appDashBuilderDashLibLib.outPackagerApiMod.PackagerOptions = js.native
  val productionDeps: js.Any = js.native
  val projectDir: java.lang.String = js.native
  var readProjectMetadataIfTwoPackageStructureOrPrepacked: js.Any = js.native
  val relativeBuildResourcesDirname: java.lang.String = js.native
  val repositoryInfo: js.Promise[
    (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify SourceRepositoryInfo */ _) | scala.Null
  ] = js.native
  val tempDirManager: builderDashUtilLib.builderDashUtilMod.TmpDir = js.native
  def _build(
    configuration: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Configuration */ js.Any,
    metadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata
  ): js.Promise[BuildResult] = js.native
  def _build(
    configuration: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Configuration */ js.Any,
    metadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata,
    devMetadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata
  ): js.Promise[BuildResult] = js.native
  def _build(
    configuration: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Configuration */ js.Any,
    metadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata,
    devMetadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata,
    repositoryInfo: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify SourceRepositoryInfo */ js.Any
  ): js.Promise[BuildResult] = js.native
  def _build(
    configuration: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Configuration */ js.Any,
    metadata: appDashBuilderDashLibLib.outOptionsMetadataMod.Metadata,
    devMetadata: scala.Null,
    repositoryInfo: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify SourceRepositoryInfo */ js.Any
  ): js.Promise[BuildResult] = js.native
  def addAfterPackHandler(
    handler: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AfterPackContext */ /* context */ js.Any, 
      js.Promise[_] | scala.Null
    ]
  ): scala.Unit = js.native
  def afterPack(
    context: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify AfterPackContext */ js.Any
  ): js.Promise[_] = js.native
  def artifactCreated(
    handler: js.Function1[/* event */ appDashBuilderDashLibLib.outPackagerApiMod.ArtifactCreated, scala.Unit]
  ): Packager = js.native
  def build(): js.Promise[BuildResult] = js.native
  def callArtifactBuildCompleted(event: appDashBuilderDashLibLib.outPackagerApiMod.ArtifactCreated): js.Promise[scala.Unit] = js.native
  def callArtifactBuildStarted(event: appDashBuilderDashLibLib.outPackagerApiMod.ArtifactBuildStarted): js.Promise[scala.Unit] = js.native
  def callArtifactBuildStarted(event: appDashBuilderDashLibLib.outPackagerApiMod.ArtifactBuildStarted, logFields: js.Any): js.Promise[scala.Unit] = js.native
  /**
    * Only for sub artifacts (update info), for main artifacts use `callArtifactBuildCompleted`.
    */
  def dispatchArtifactCreated(event: appDashBuilderDashLibLib.outPackagerApiMod.ArtifactCreated): scala.Unit = js.native
  def stageDirPathCustomizer(
    target: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Target */ js.Any,
    packager: appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[_],
    arch: builderDashUtilLib.outArchMod.Arch
  ): java.lang.String = js.native
}


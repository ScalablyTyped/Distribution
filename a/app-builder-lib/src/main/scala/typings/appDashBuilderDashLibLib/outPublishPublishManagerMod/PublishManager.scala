package typings
package appDashBuilderDashLibLib.outPublishPublishManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/PublishManager", "PublishManager")
@js.native
class PublishManager protected ()
  extends electronDashPublishLib.electronDashPublishMod.PublishContext {
  def this(packager: appDashBuilderDashLibLib.outPackagerMod.Packager, publishOptions: electronDashPublishLib.electronDashPublishMod.PublishOptions) = this()
  def this(packager: appDashBuilderDashLibLib.outPackagerMod.Packager, publishOptions: electronDashPublishLib.electronDashPublishMod.PublishOptions, cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken) = this()
  var artifactCreatedWithoutExplicitPublishConfig: js.Any = js.native
  /* CompleteClass */
  override val cancellationToken: builderDashUtilDashRuntimeLib.builderDashUtilDashRuntimeMod.CancellationToken = js.native
  var getAppInfo: js.Any = js.native
  var getOrCreatePublisher: js.Any = js.native
  val isPublish: scala.Boolean = js.native
  val nameToPublisher: js.Any = js.native
  val packager: js.Any = js.native
  /* CompleteClass */
  override val progress: electronDashPublishLib.outMultiProgressMod.MultiProgress | scala.Null = js.native
  val publishOptions: js.Any = js.native
  val taskManager: js.Any = js.native
  val updateFileWriteTask: js.Any = js.native
  def awaitTasks(): stdLib.Promise[scala.Unit] = js.native
  def cancelTasks(): scala.Unit = js.native
  def getGlobalPublishConfigurations(): stdLib.Promise[
    js.Array[builderDashUtilDashRuntimeLib.outPublishOptionsMod.PublishConfiguration] | scala.Null
  ] = js.native
}


package typings.appDashBuilderDashLib.outPublishPublishManagerMod

import typings.appDashBuilderDashLib.outPackagerMod.Packager
import typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.PublishConfiguration
import typings.electronDashPublish.electronDashPublishMod.PublishContext
import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import typings.electronDashPublish.outMultiProgressMod.MultiProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/PublishManager", "PublishManager")
@js.native
class PublishManager protected () extends PublishContext {
  def this(packager: Packager, publishOptions: PublishOptions) = this()
  def this(packager: Packager, publishOptions: PublishOptions, cancellationToken: CancellationToken) = this()
  var artifactCreatedWithoutExplicitPublishConfig: js.Any = js.native
  /* CompleteClass */
  override val cancellationToken: CancellationToken = js.native
  var getAppInfo: js.Any = js.native
  var getOrCreatePublisher: js.Any = js.native
  val isPublish: Boolean = js.native
  val nameToPublisher: js.Any = js.native
  val packager: js.Any = js.native
  /* CompleteClass */
  override val progress: MultiProgress | Null = js.native
  val publishOptions: js.Any = js.native
  val taskManager: js.Any = js.native
  val updateFileWriteTask: js.Any = js.native
  def awaitTasks(): js.Promise[Unit] = js.native
  def cancelTasks(): Unit = js.native
  def getGlobalPublishConfigurations(): js.Promise[js.Array[PublishConfiguration] | Null] = js.native
}


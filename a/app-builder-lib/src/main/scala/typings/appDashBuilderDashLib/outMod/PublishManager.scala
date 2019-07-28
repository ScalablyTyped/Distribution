package typings.appDashBuilderDashLib.outMod

import typings.electronDashPublish.electronDashPublishMod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out", "PublishManager")
@js.native
class PublishManager protected ()
  extends typings.appDashBuilderDashLib.outPublishPublishManagerMod.PublishManager {
  def this(packager: typings.appDashBuilderDashLib.outPackagerMod.Packager, publishOptions: PublishOptions) = this()
  def this(
    packager: typings.appDashBuilderDashLib.outPackagerMod.Packager,
    publishOptions: PublishOptions,
    cancellationToken: typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod.CancellationToken
  ) = this()
}


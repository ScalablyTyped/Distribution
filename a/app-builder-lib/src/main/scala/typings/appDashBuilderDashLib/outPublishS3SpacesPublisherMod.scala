package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.Spaces
import typings.appDashBuilderDashLib.outPublishS3BaseS3PublisherMod.BaseS3Publisher
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.SpacesOptions
import typings.electronDashPublish.electronDashPublishMod.PublishContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/s3/spacesPublisher", JSImport.Namespace)
@js.native
object outPublishS3SpacesPublisherMod extends js.Object {
  @js.native
  trait SpacesPublisher extends BaseS3Publisher {
    val info: js.Any = js.native
    @JSName("providerName")
    val providerName_SpacesPublisher: Spaces = js.native
  }
  
  @js.native
  class default protected () extends SpacesPublisher {
    def this(context: PublishContext, info: SpacesOptions) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = js.native
    def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = js.native
  }
  
}


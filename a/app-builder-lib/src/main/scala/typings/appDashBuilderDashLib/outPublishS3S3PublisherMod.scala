package typings.appDashBuilderDashLib

import typings.appDashBuilderDashLib.appDashBuilderDashLibStrings.S3
import typings.appDashBuilderDashLib.outPublishS3BaseS3PublisherMod.BaseS3Publisher
import typings.builderDashUtilDashRuntime.outPublishOptionsMod.S3Options
import typings.electronDashPublish.electronDashPublishMod.PublishContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Namespace)
@js.native
object outPublishS3S3PublisherMod extends js.Object {
  @js.native
  trait S3Publisher extends BaseS3Publisher {
    val info: js.Any = js.native
    @JSName("providerName")
    val providerName_S3Publisher: S3 = js.native
  }
  
  @js.native
  class default protected () extends S3Publisher {
    def this(context: PublishContext, info: S3Options) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = js.native
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = js.native
  }
  
}


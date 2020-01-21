package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.BaseS3Options
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/publish/s3/BaseS3Publisher", JSImport.Namespace)
@js.native
object baseS3PublisherMod extends js.Object {
  @js.native
  abstract class BaseS3Publisher protected () extends Publisher {
    protected def this(context: PublishContext, options: BaseS3Options) = this()
    var options: js.Any = js.native
    /* protected */ def configureS3Options(args: js.Array[String]): Unit = js.native
    /* protected */ def getBucketName(): String = js.native
  }
  
}


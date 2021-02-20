package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.BaseS3Options
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseS3PublisherMod {
  
  @JSImport("app-builder-lib/out/publish/s3/BaseS3Publisher", "BaseS3Publisher")
  @js.native
  abstract class BaseS3Publisher protected () extends Publisher {
    protected def this(context: PublishContext, options: BaseS3Options) = this()
    
    /* protected */ def configureS3Options(args: js.Array[String]): Unit = js.native
    
    /* protected */ def getBucketName(): String = js.native
    
    var options: js.Any = js.native
  }
}

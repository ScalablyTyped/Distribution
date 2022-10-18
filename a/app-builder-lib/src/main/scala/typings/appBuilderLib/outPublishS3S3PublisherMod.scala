package typings.appBuilderLib

import typings.appBuilderLib.outPublishS3BaseS3PublisherMod.BaseS3Publisher
import typings.builderUtilRuntime.outPublishOptionsMod.S3Options
import typings.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishS3S3PublisherMod {
  
  @JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Default)
  @js.native
  open class default protected () extends S3Publisher {
    def this(context: PublishContext, info: S3Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkAndResolveOptions(options: S3Options, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def checkAndResolveOptions(options: S3Options, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  trait S3Publisher extends BaseS3Publisher {
    
    /* private */ val info: Any = js.native
    
    @JSName("providerName")
    val providerName_FS3Publisher: /* "s3" */ String = js.native
  }
}

package typings.appBuilderLib

import typings.appBuilderLib.baseS3PublisherMod.BaseS3Publisher
import typings.builderUtilRuntime.publishOptionsMod.S3Options
import typings.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3PublisherMod {
  
  @JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Default)
  @js.native
  class default protected () extends S3Publisher {
    def this(context: PublishContext, info: S3Options) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/publish/s3/s3Publisher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    @scala.inline
    def checkAndResolveOptions(options: S3Options, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  trait S3Publisher extends BaseS3Publisher {
    
    val info: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FS3Publisher: /* "S3" */ String = js.native
  }
}

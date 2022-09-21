package typings.appBuilderLib

import typings.appBuilderLib.baseS3PublisherMod.BaseS3Publisher
import typings.builderUtilRuntime.publishOptionsMod.SpacesOptions
import typings.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacesPublisherMod {
  
  @JSImport("app-builder-lib/out/publish/s3/spacesPublisher", JSImport.Default)
  @js.native
  open class default protected () extends SpacesPublisher {
    def this(context: PublishContext, info: SpacesOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("app-builder-lib/out/publish/s3/spacesPublisher", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: String, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def checkAndResolveOptions(options: SpacesOptions, channelFromAppVersion: Null, errorIfCannot: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndResolveOptions")(options.asInstanceOf[js.Any], channelFromAppVersion.asInstanceOf[js.Any], errorIfCannot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  @js.native
  trait SpacesPublisher extends BaseS3Publisher {
    
    /* private */ val info: Any = js.native
    
    @JSName("providerName")
    val providerName_FSpacesPublisher: /* "spaces" */ String = js.native
  }
}

package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.BitbucketOptions
import typings.electronPublish.mod.HttpPublisher
import typings.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitbucketPublisherMod {
  
  @JSImport("app-builder-lib/out/publish/BitbucketPublisher", "BitbucketPublisher")
  @js.native
  open class BitbucketPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: BitbucketOptions) = this()
    
    /* private */ val auth: Any = js.native
    
    /* private */ val basePath: Any = js.native
    
    def deleteRelease(filename: String): js.Promise[Unit] = js.native
    
    val hostname: /* "api.bitbucket.org" */ String = js.native
    
    /* private */ val info: Any = js.native
    
    @JSName("providerName")
    val providerName_FBitbucketPublisher: /* "bitbucket" */ String = js.native
  }
  /* static members */
  object BitbucketPublisher {
    
    @JSImport("app-builder-lib/out/publish/BitbucketPublisher", "BitbucketPublisher")
    @js.native
    val ^ : js.Any = js.native
    
    inline def convertAppPassword(username: String, token: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("convertAppPassword")(username.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}

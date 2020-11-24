package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.BintrayOptions
import typings.electronPublish.mod.HttpPublisher
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.PublishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/publish/BintrayPublisher", JSImport.Namespace)
@js.native
object bintrayPublisherMod extends js.Object {
  
  @js.native
  class BintrayPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: BintrayOptions, version: String) = this()
    def this(context: PublishContext, info: BintrayOptions, version: String, options: PublishOptions) = this()
    
    val _versionPromise: js.Any = js.native
    
    val client: js.Any = js.native
    
    def deleteRelease(): js.Promise[Unit] = js.native
    def deleteRelease(isForce: Boolean): js.Promise[Unit] = js.native
    
    var init: js.Any = js.native
    
    val options: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FBintrayPublisher: /* "Bintray" */ String = js.native
    
    val version: js.Any = js.native
  }
}

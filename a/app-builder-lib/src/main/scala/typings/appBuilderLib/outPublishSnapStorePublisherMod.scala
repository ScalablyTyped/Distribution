package typings.appBuilderLib

import typings.builderUtilRuntime.outPublishOptionsMod.SnapStoreOptions
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishSnapStorePublisherMod {
  
  @JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
  @js.native
  open class SnapStorePublisher protected () extends Publisher {
    def this(context: PublishContext, options: SnapStoreOptions) = this()
    
    /* private */ var options: Any = js.native
    
    @JSName("providerName")
    val providerName_FSnapStorePublisher: /* "snapStore" */ String = js.native
  }
}

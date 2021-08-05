package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapStorePublisherMod {
  
  @JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
  @js.native
  class SnapStorePublisher protected () extends Publisher {
    def this(context: PublishContext, options: SnapStoreOptions) = this()
    
    /* private */ var options: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FSnapStorePublisher: /* "snapStore" */ String = js.native
  }
  
  trait SnapStoreOptions
    extends StObject
       with PublishConfiguration {
    
    /**
      * The list of channels the snap would be released.
      * @default ["edge"]
      */
    val channels: js.UndefOr[String | js.Array[String] | Null] = js.undefined
  }
  object SnapStoreOptions {
    
    inline def apply(provider: PublishProvider): SnapStoreOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapStoreOptions]
    }
    
    extension [Self <: SnapStoreOptions](x: Self) {
      
      inline def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsNull: Self = StObject.set(x, "channels", null)
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    }
  }
}

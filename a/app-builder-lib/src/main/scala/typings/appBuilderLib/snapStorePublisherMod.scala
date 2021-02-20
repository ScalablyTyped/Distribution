package typings.appBuilderLib

import typings.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typings.builderUtilRuntime.publishOptionsMod.PublishProvider
import typings.electronPublish.mod.PublishContext
import typings.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapStorePublisherMod {
  
  @JSImport("app-builder-lib/out/publish/SnapStorePublisher", "SnapStorePublisher")
  @js.native
  class SnapStorePublisher protected () extends Publisher {
    def this(context: PublishContext, options: SnapStoreOptions) = this()
    
    var options: js.Any = js.native
    
    @JSName("providerName")
    val providerName_FSnapStorePublisher: /* "snapStore" */ String = js.native
  }
  
  @js.native
  trait SnapStoreOptions extends PublishConfiguration {
    
    /**
      * The list of channels the snap would be released.
      * @default ["edge"]
      */
    val channels: js.UndefOr[String | js.Array[String] | Null] = js.native
  }
  object SnapStoreOptions {
    
    @scala.inline
    def apply(provider: PublishProvider): SnapStoreOptions = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapStoreOptions]
    }
    
    @scala.inline
    implicit class SnapStoreOptionsMutableBuilder[Self <: SnapStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannels(value: String | js.Array[String]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsNull: Self = StObject.set(x, "channels", null)
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setChannelsVarargs(value: String*): Self = StObject.set(x, "channels", js.Array(value :_*))
    }
  }
}

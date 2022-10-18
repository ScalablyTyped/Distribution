package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseImageMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/image", "Image")
  @js.native
  open class Image protected ()
    extends StObject
       with GoogleActionsV2UiElementsImage {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  trait ImageOptions extends StObject {
    
    /**
      * Text to replace for image for accessibility.
      * @public
      */
    var alt: String
    
    /**
      * Height of the image.
      * @public
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Image source URL.
      * @public
      */
    var url: String
    
    /**
      * Width of the image.
      * @public
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ImageOptions {
    
    inline def apply(alt: String, url: String): ImageOptions = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    extension [Self <: ImageOptions](x: Self) {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

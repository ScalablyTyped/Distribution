package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/image", "Image")
  @js.native
  class Image protected () extends GoogleActionsV2UiElementsImage {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @js.native
  trait ImageOptions extends StObject {
    
    /**
      * Text to replace for image for accessibility.
      * @public
      */
    var alt: String = js.native
    
    /**
      * Height of the image.
      * @public
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Image source URL.
      * @public
      */
    var url: String = js.native
    
    /**
      * Width of the image.
      * @public
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ImageOptions {
    
    @scala.inline
    def apply(alt: String, url: String): ImageOptions = {
      val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageOptions]
    }
    
    @scala.inline
    implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}

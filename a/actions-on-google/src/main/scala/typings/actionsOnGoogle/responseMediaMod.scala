package typings.actionsOnGoogle

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaObject
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponseMediaType
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMediaMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/media", "MediaObject")
  @js.native
  class MediaObject protected () extends GoogleActionsV2MediaObject {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/media", "MediaResponse")
  @js.native
  class MediaResponse protected ()
    extends _RichResponseItem
       with GoogleActionsV2MediaResponse {
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: MediaObjectString*) = this()
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: js.Array[MediaObjectString]) = this()
    /**
      * @param options MediaResponse options
      * @public
      */
    def this(options: MediaResponseOptions) = this()
  }
  
  @js.native
  trait MediaObjectOptions extends StObject {
    
    /** @public */
    var description: js.UndefOr[String] = js.native
    
    /**
      * Icon image.
      * @public
      */
    var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
    
    /**
      * Large image.
      * @public
      */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
    
    /**
      * Name of the MediaObject.
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * MediaObject URL.
      * @public
      */
    var url: String = js.native
  }
  object MediaObjectOptions {
    
    @scala.inline
    def apply(url: String): MediaObjectOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaObjectOptions]
    }
    
    @scala.inline
    implicit class MediaObjectOptionsMutableBuilder[Self <: MediaObjectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setIcon(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type MediaObjectString = GoogleActionsV2MediaObject | String
  
  @js.native
  trait MediaResponseOptions extends StObject {
    
    /**
      * Array of MediaObject held in the MediaResponse.
      * @public
      */
    var objects: js.Array[MediaObjectString] = js.native
    
    /**
      * Type of the media within this MediaResponse.
      * Defaults to 'AUDIO'
      * @public
      */
    var `type`: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.native
  }
  object MediaResponseOptions {
    
    @scala.inline
    def apply(objects: js.Array[MediaObjectString]): MediaResponseOptions = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaResponseOptions]
    }
    
    @scala.inline
    implicit class MediaResponseOptionsMutableBuilder[Self <: MediaResponseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: js.Array[MediaObjectString]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsVarargs(value: MediaObjectString*): Self = StObject.set(x, "objects", js.Array(value :_*))
      
      @scala.inline
      def setType(value: GoogleActionsV2MediaResponseMediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

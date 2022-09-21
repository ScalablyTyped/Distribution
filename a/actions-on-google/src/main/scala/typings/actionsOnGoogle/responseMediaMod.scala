package typings.actionsOnGoogle

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaObject
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2MediaResponseMediaType
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responseMediaMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/media", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends StObject
       with GoogleActionsV2MediaObject {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/media", "MediaResponse")
  @js.native
  open class MediaResponse protected ()
    extends StObject
       with GoogleActionsV2MediaResponse
       with _RichResponseItem {
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
  
  trait MediaObjectOptions extends StObject {
    
    /** @public */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Icon image.
      * @public
      */
    var icon: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
    /**
      * Large image.
      * @public
      */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
    /**
      * Name of the MediaObject.
      * @public
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * MediaObject URL.
      * @public
      */
    var url: String
  }
  object MediaObjectOptions {
    
    inline def apply(url: String): MediaObjectOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaObjectOptions]
    }
    
    extension [Self <: MediaObjectOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type MediaObjectString = GoogleActionsV2MediaObject | String
  
  trait MediaResponseOptions extends StObject {
    
    /**
      * Array of MediaObject held in the MediaResponse.
      * @public
      */
    var objects: js.Array[MediaObjectString]
    
    /**
      * Type of the media within this MediaResponse.
      * Defaults to 'AUDIO'
      * @public
      */
    var `type`: js.UndefOr[GoogleActionsV2MediaResponseMediaType] = js.undefined
  }
  object MediaResponseOptions {
    
    inline def apply(objects: js.Array[MediaObjectString]): MediaResponseOptions = {
      val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaResponseOptions]
    }
    
    extension [Self <: MediaResponseOptions](x: Self) {
      
      inline def setObjects(value: js.Array[MediaObjectString]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: MediaObjectString*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setType(value: GoogleActionsV2MediaResponseMediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}

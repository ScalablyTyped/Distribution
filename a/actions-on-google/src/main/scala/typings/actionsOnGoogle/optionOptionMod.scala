package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselSelectCarouselItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionOptionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option/option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ApiOptionItem]]
  
  type ApiOptionItem = GoogleActionsV2UiElementsCarouselSelectCarouselItem
  
  type OptionArgument = String
  
  trait OptionItem extends StObject {
    
    /**
      * Optional text describing the item.
      * @public
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Square image to show for this item.
      * @public
      */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
    /**
      * Synonyms that can be used by the user to indicate this option if they do not use the key.
      * @public
      */
    var synonyms: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Name of the item.
      * @public
      */
    var title: String
  }
  object OptionItem {
    
    @scala.inline
    def apply(title: String): OptionItem = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionItem]
    }
    
    @scala.inline
    implicit class OptionItemMutableBuilder[Self <: OptionItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
      
      @scala.inline
      def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type OptionItems[TOptionItem] = /**
    * key: Unique string ID for this option.
    * @public
    */
  StringDictionary[TOptionItem]
}

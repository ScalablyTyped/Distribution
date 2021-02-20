package typings.askmethatRating

import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amtRatingPopoverMod {
  
  @JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopover")
  @js.native
  class AskmethatRatingPopover protected () extends StObject {
    /**
      *
      */
    def this(options: AskmethatRatingPopoverOptions) = this()
    
    var _options: js.Any = js.native
    
    /**
      * @function get the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    /**
      * @function set the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    var options: AskmethatRatingPopoverOptions = js.native
    
    /**
      * Return a list of elements
      */
    def render(): HTMLUListElement = js.native
  }
  
  @js.native
  sealed trait AskmethatRatingPopoverDirection extends StObject
  @JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopoverDirection")
  @js.native
  object AskmethatRatingPopoverDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AskmethatRatingPopoverDirection with Double] = js.native
    
    @js.native
    sealed trait bottom extends AskmethatRatingPopoverDirection
    /* 1 */ val bottom: typings.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverDirection.bottom with Double = js.native
    
    @js.native
    sealed trait top extends AskmethatRatingPopoverDirection
    /* 0 */ val top: typings.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverDirection.top with Double = js.native
  }
  
  @js.native
  trait AskmethatRatingPopoverOptions extends StObject {
    
    /**
      * Color used by the font & progress bar inside popover
      */
    var color: String = js.native
    
    /**
      * Display popover at bottom or top
      */
    var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.native
    
    /**
      * fontClass used by the rating element inside popover
      */
    var fontClass: String = js.native
    
    /**
      * Array of percentage to display
      */
    var values: js.Array[Double] = js.native
  }
  object AskmethatRatingPopoverOptions {
    
    @scala.inline
    def apply(color: String, fontClass: String, values: js.Array[Double]): AskmethatRatingPopoverOptions = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontClass = fontClass.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[AskmethatRatingPopoverOptions]
    }
    
    @scala.inline
    implicit class AskmethatRatingPopoverOptionsMutableBuilder[Self <: AskmethatRatingPopoverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: AskmethatRatingPopoverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}

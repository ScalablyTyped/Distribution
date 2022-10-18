package typings.askmethatRating

import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAmtRatingPopoverMod {
  
  @JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopover")
  @js.native
  open class AskmethatRatingPopover protected () extends StObject {
    /**
      *
      */
    def this(options: AskmethatRatingPopoverOptions) = this()
    
    /* private */ var _options: Any = js.native
    
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
    def apply(value: Double): js.UndefOr[AskmethatRatingPopoverDirection & Double] = js.native
    
    @js.native
    sealed trait bottom
      extends StObject
         with AskmethatRatingPopoverDirection
    /* 1 */ val bottom: typings.askmethatRating.distAmtRatingPopoverMod.AskmethatRatingPopoverDirection.bottom & Double = js.native
    
    @js.native
    sealed trait top
      extends StObject
         with AskmethatRatingPopoverDirection
    /* 0 */ val top: typings.askmethatRating.distAmtRatingPopoverMod.AskmethatRatingPopoverDirection.top & Double = js.native
  }
  
  trait AskmethatRatingPopoverOptions extends StObject {
    
    /**
      * Color used by the font & progress bar inside popover
      */
    var color: String
    
    /**
      * Display popover at bottom or top
      */
    var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.undefined
    
    /**
      * fontClass used by the rating element inside popover
      */
    var fontClass: String
    
    /**
      * Array of percentage to display
      */
    var values: js.Array[Double]
  }
  object AskmethatRatingPopoverOptions {
    
    inline def apply(color: String, fontClass: String, values: js.Array[Double]): AskmethatRatingPopoverOptions = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontClass = fontClass.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[AskmethatRatingPopoverOptions]
    }
    
    extension [Self <: AskmethatRatingPopoverOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: AskmethatRatingPopoverDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}

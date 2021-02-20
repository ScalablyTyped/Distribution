package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("amcharts/Title", JSImport.Default)
  @js.native
  class default () extends Title
  
  @js.native
  trait Title extends StObject {
    
    /**
      * @default 1
      */
    var alpha: Double = js.native
    
    /**
      * Specifies if the tile is bold or not.
      * @default false
      */
    var bold: Boolean = js.native
    
    /**
      * Text color of a title.
      */
    var color: String = js.native
    
    /**
      * Unique id of a Title. You don't need to set it, unless you want to.
      */
    var id: String = js.native
    
    /**
      * Text size
      */
    var size: Double = js.native
    
    /**
      * Text of a label
      */
    var text: String = js.native
  }
  object Title {
    
    @scala.inline
    def apply(alpha: Double, bold: Boolean, color: String, id: String, size: Double, text: String): Title = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}

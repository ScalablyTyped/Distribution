package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod {
  
  @JSImport("amcharts/Title", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Title {
    
    /**
      * @default 1
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * Specifies if the tile is bold or not.
      * @default false
      */
    /* CompleteClass */
    var bold: Boolean = js.native
    
    /**
      * Text color of a title.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Unique id of a Title. You don't need to set it, unless you want to.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Text size
      */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Text of a label
      */
    /* CompleteClass */
    var text: String = js.native
  }
  
  trait Title extends StObject {
    
    /**
      * @default 1
      */
    var alpha: Double
    
    /**
      * Specifies if the tile is bold or not.
      * @default false
      */
    var bold: Boolean
    
    /**
      * Text color of a title.
      */
    var color: String
    
    /**
      * Unique id of a Title. You don't need to set it, unless you want to.
      */
    var id: String
    
    /**
      * Text size
      */
    var size: Double
    
    /**
      * Text of a label
      */
    var text: String
  }
  object Title {
    
    inline def apply(alpha: Double, bold: Boolean, color: String, id: String, size: Double, text: String): Title = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    extension [Self <: Title](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}

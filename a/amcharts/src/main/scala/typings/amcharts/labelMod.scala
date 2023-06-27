package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("amcharts/Label", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Label {
    
    /**
      * @default 'left'
      */
    /* CompleteClass */
    var align: String = js.native
    
    /**
      * @default 1
      */
    /* CompleteClass */
    var alpha: Double = js.native
    
    /**
      * Specifies if label is bold or not.
      */
    /* CompleteClass */
    var bold: Boolean = js.native
    
    /**
      * Color of a label
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Unique id of a Label. You don't need to set it, unless you want to.
      */
    /* CompleteClass */
    var id: String = js.native
    
    /**
      * Rotation angle.
      */
    /* CompleteClass */
    var rotation: Double = js.native
    
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
    
    /**
      * URL which will be access if user clicks on a label.
      */
    /* CompleteClass */
    var url: String = js.native
    
    /**
      * X position of a label.
      */
    /* CompleteClass */
    var x: Double | String = js.native
    
    /**
      * y position of a label.
      */
    /* CompleteClass */
    var y: Double | String = js.native
  }
  
  trait Label extends StObject {
    
    /**
      * @default 'left'
      */
    var align: String
    
    /**
      * @default 1
      */
    var alpha: Double
    
    /**
      * Specifies if label is bold or not.
      */
    var bold: Boolean
    
    /**
      * Color of a label
      */
    var color: String
    
    /**
      * Unique id of a Label. You don't need to set it, unless you want to.
      */
    var id: String
    
    /**
      * Rotation angle.
      */
    var rotation: Double
    
    /**
      * Text size
      */
    var size: Double
    
    /**
      * Text of a label
      */
    var text: String
    
    /**
      * URL which will be access if user clicks on a label.
      */
    var url: String
    
    /**
      * X position of a label.
      */
    var x: Double | String
    
    /**
      * y position of a label.
      */
    var y: Double | String
  }
  object Label {
    
    inline def apply(
      align: String,
      alpha: Double,
      bold: Boolean,
      color: String,
      id: String,
      rotation: Double,
      size: Double,
      text: String,
      url: String,
      x: Double | String,
      y: Double | String
    ): Label = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

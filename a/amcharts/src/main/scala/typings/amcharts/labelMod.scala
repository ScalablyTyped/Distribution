package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labelMod {
  
  @JSImport("amcharts/Label", JSImport.Default)
  @js.native
  class default () extends Label
  
  @js.native
  trait Label extends StObject {
    
    /**
      * @Default 'left'
      */
    var align: String = js.native
    
    /**
      * @Default 1
      */
    var alpha: Double = js.native
    
    /**
      * Specifies if label is bold or not.
      */
    var bold: Boolean = js.native
    
    /**
      * Color of a label
      */
    var color: String = js.native
    
    /**
      * Unique id of a Label. You don't need to set it, unless you want to.
      */
    var id: String = js.native
    
    /**
      * Rotation angle.
      */
    var rotation: Double = js.native
    
    /**
      * Text size
      */
    var size: Double = js.native
    
    /**
      * Text of a label
      */
    var text: String = js.native
    
    /**
      * URL which will be access if user clicks on a label.
      */
    var url: String = js.native
    
    /**
      * X position of a label.
      */
    var x: Double | String = js.native
    
    /**
      * y position of a label.
      */
    var y: Double | String = js.native
  }
  object Label {
    
    @scala.inline
    def apply(
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
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}

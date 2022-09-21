package typings.antvGLite

import typings.antvGLite.distTypesMod.CanvasLike
import typings.antvGLite.offscreenCanvasCreatorMod.OffscreenCanvasCreator
import typings.antvGLite.shapesMod.Rectangle
import typings.antvGLite.textMod.ParsedTextStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textServiceMod {
  
  @JSImport("@antv/g-lite/dist/services/TextService", "TextService")
  @js.native
  open class TextService protected () extends StObject {
    def this(offscreenCanvas: OffscreenCanvasCreator) = this()
    
    /* private */ var cache: Any = js.native
    
    /* private */ var canBreakInLastChar: Any = js.native
    
    /* private */ var findBreakableIndex: Any = js.native
    
    /* private */ var getFromCache: Any = js.native
    
    /* private */ var isBreakingSpace: Any = js.native
    
    /* private */ var isNewline: Any = js.native
    
    def measureFont(font: String, offscreenCanvas: CanvasLike): IFontMetrics = js.native
    
    def measureText(text: String, parsedStyle: ParsedTextStyleProps, offscreenCanvas: CanvasLike): TextMetrics = js.native
    
    /* private */ var offscreenCanvas: Any = js.native
    
    /* private */ var shouldBreakByKinsokuShorui: Any = js.native
    
    /* private */ var sumTextWidthByCache: Any = js.native
    
    /* private */ var trimByKinsokuShorui: Any = js.native
    
    /* private */ var trimToBreakable: Any = js.native
    
    /* private */ var wordWrap: Any = js.native
  }
  
  trait IFontMetrics extends StObject {
    
    var ascent: Double
    
    var descent: Double
    
    var fontSize: Double
  }
  object IFontMetrics {
    
    inline def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFontMetrics]
    }
    
    extension [Self <: IFontMetrics](x: Self) {
      
      inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextMetrics extends StObject {
    
    var font: String
    
    var fontProperties: IFontMetrics
    
    var height: Double
    
    var lineHeight: Double
    
    var lineMetrics: js.Array[Rectangle]
    
    var lineWidths: js.Array[Double]
    
    var lines: js.Array[String]
    
    var maxLineWidth: Double
    
    var width: Double
  }
  object TextMetrics {
    
    inline def apply(
      font: String,
      fontProperties: IFontMetrics,
      height: Double,
      lineHeight: Double,
      lineMetrics: js.Array[Rectangle],
      lineWidths: js.Array[Double],
      lines: js.Array[String],
      maxLineWidth: Double,
      width: Double
    ): TextMetrics = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], fontProperties = fontProperties.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineMetrics = lineMetrics.asInstanceOf[js.Any], lineWidths = lineWidths.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], maxLineWidth = maxLineWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextMetrics]
    }
    
    extension [Self <: TextMetrics](x: Self) {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontProperties(value: IFontMetrics): Self = StObject.set(x, "fontProperties", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineMetrics(value: js.Array[Rectangle]): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
      
      inline def setLineMetricsVarargs(value: Rectangle*): Self = StObject.set(x, "lineMetrics", js.Array(value*))
      
      inline def setLineWidths(value: js.Array[Double]): Self = StObject.set(x, "lineWidths", value.asInstanceOf[js.Any])
      
      inline def setLineWidthsVarargs(value: Double*): Self = StObject.set(x, "lineWidths", js.Array(value*))
      
      inline def setLines(value: js.Array[String]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesVarargs(value: String*): Self = StObject.set(x, "lines", js.Array(value*))
      
      inline def setMaxLineWidth(value: Double): Self = StObject.set(x, "maxLineWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

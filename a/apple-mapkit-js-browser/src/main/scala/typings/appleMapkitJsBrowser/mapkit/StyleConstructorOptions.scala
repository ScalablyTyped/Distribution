package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initial values of options for applying style to overlays.
  */
trait StyleConstructorOptions extends StObject {
  
  /**
    * The fill color of a shape.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    * The opacity of the fill color.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * A rule for determining whether a point is inside or outside a polygon.
    */
  var fillRule: js.UndefOr[String] = js.undefined
  
  /**
    * The style to use when drawing line endings.
    */
  var lineCap: js.UndefOr[String] = js.undefined
  
  /**
    * An array of line and gap lengths, used to create a dashed line.
    */
  var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The number of CSS pixels to offset drawing of a line's dash pattern.
    */
  var lineDashOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The gradient to apply along the line.
    */
  var lineGradient: LineGradient
  
  /**
    * The style to use when drawing joins between line segments.
    */
  var lineJoin: js.UndefOr[String] = js.undefined
  
  /**
    * The width of a line's stroke, in CSS pixels.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * The stroke color of a line.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  
  /**
    * The unit distance along the line where a stroke ends.
    */
  var strokeEnd: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the stroke color.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The unit distance along the line where a stroke begins.
    */
  var strokeStart: js.UndefOr[Double] = js.undefined
}
object StyleConstructorOptions {
  
  inline def apply(lineGradient: LineGradient): StyleConstructorOptions = {
    val __obj = js.Dynamic.literal(lineGradient = lineGradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleConstructorOptions]
  }
  
  extension [Self <: StyleConstructorOptions](x: Self) {
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffset(value: Double): Self = StObject.set(x, "lineDashOffset", value.asInstanceOf[js.Any])
    
    inline def setLineDashOffsetUndefined: Self = StObject.set(x, "lineDashOffset", js.undefined)
    
    inline def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
    
    inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
    
    inline def setLineGradient(value: LineGradient): Self = StObject.set(x, "lineGradient", value.asInstanceOf[js.Any])
    
    inline def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeEnd(value: Double): Self = StObject.set(x, "strokeEnd", value.asInstanceOf[js.Any])
    
    inline def setStrokeEndUndefined: Self = StObject.set(x, "strokeEnd", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeStart(value: Double): Self = StObject.set(x, "strokeStart", value.asInstanceOf[js.Any])
    
    inline def setStrokeStartUndefined: Self = StObject.set(x, "strokeStart", js.undefined)
  }
}

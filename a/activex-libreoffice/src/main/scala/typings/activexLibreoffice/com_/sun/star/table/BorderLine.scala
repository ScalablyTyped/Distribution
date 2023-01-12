package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the line type for a single cell edge. */
trait BorderLine extends StObject {
  
  /** contains the color value of the line. */
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color
  
  /**
    * contains the width of the inner part of a double line (in 1/100 mm).
    *
    * If this value is zero, only a single line is drawn.
    */
  var InnerLineWidth: Double
  
  /** contains the distance between the inner and outer parts of a double line (in 1/100 mm). */
  var LineDistance: Double
  
  /**
    * contains the width of a single line or the width of outer part of a double line (in 1/100 mm).
    *
    * If this value is zero, no line is drawn.
    */
  var OuterLineWidth: Double
}
object BorderLine {
  
  inline def apply(Color: Color, InnerLineWidth: Double, LineDistance: Double, OuterLineWidth: Double): BorderLine = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], InnerLineWidth = InnerLineWidth.asInstanceOf[js.Any], LineDistance = LineDistance.asInstanceOf[js.Any], OuterLineWidth = OuterLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderLine] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setInnerLineWidth(value: Double): Self = StObject.set(x, "InnerLineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineDistance(value: Double): Self = StObject.set(x, "LineDistance", value.asInstanceOf[js.Any])
    
    inline def setOuterLineWidth(value: Double): Self = StObject.set(x, "OuterLineWidth", value.asInstanceOf[js.Any])
  }
}

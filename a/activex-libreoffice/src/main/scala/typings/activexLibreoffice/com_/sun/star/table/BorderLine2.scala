package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A border line, extended with line style.
  * @since LibreOffice 3.4
  */
trait BorderLine2
  extends StObject
     with BorderLine {
  
  /**
    * Style of the border.
    * @see BorderLineStyle
    */
  var LineStyle: Double
  
  /**
    * Width of the border, this is the base to compute all the lines and gaps widths. These widths computations are based on the LineStyle property
    *
    * This property is prevailing on the old Out, In and Dist width from {@link BorderLine} . If this property is set to 0, then the other widths will be
    * used to guess the border width.
    */
  var LineWidth: Double
}
object BorderLine2 {
  
  inline def apply(
    Color: Color,
    InnerLineWidth: Double,
    LineDistance: Double,
    LineStyle: Double,
    LineWidth: Double,
    OuterLineWidth: Double
  ): BorderLine2 = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], InnerLineWidth = InnerLineWidth.asInstanceOf[js.Any], LineDistance = LineDistance.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], OuterLineWidth = OuterLineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLine2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderLine2] (val x: Self) extends AnyVal {
    
    inline def setLineStyle(value: Double): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "LineWidth", value.asInstanceOf[js.Any])
  }
}

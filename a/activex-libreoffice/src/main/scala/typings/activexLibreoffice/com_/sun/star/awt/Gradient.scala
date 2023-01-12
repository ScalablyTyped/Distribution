package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a gradient between two colors. Many aspects of the gradient are undefined, like the algorithm and color space to use to interpolate between
  * the colors and what "intensity" means.
  */
trait Gradient extends StObject {
  
  /** angle of the gradient in 1/10 degree. */
  var Angle: Double
  
  /** per cent of the total width where just the start color is used. */
  var Border: Double
  
  /** specifies the color at the end point of the gradient. */
  var EndColor: Color
  
  /** specifies the intensity at the end point of the gradient. */
  var EndIntensity: Double
  
  /** specifies the color at the start point of the gradient. */
  var StartColor: Color
  
  /** Specifies the intensity at the start point of the gradient. What that means is undefined. */
  var StartIntensity: Double
  
  /** Specifies the number of steps of change color. What that means is undefined. */
  var StepCount: Double
  
  /** specifies the style of the gradient. */
  var Style: GradientStyle
  
  /**
    * Specifies the X-coordinate, where the gradient begins, whatever that means. Possibly means the **center** of the ELLIPTICAL, SQUARE and RECT style
    * gradients?
    */
  var XOffset: Double
  
  /** Specifies the Y-coordinate, where the gradient begins. See previous field. */
  var YOffset: Double
}
object Gradient {
  
  inline def apply(
    Angle: Double,
    Border: Double,
    EndColor: Color,
    EndIntensity: Double,
    StartColor: Color,
    StartIntensity: Double,
    StepCount: Double,
    Style: GradientStyle,
    XOffset: Double,
    YOffset: Double
  ): Gradient = {
    val __obj = js.Dynamic.literal(Angle = Angle.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], EndColor = EndColor.asInstanceOf[js.Any], EndIntensity = EndIntensity.asInstanceOf[js.Any], StartColor = StartColor.asInstanceOf[js.Any], StartIntensity = StartIntensity.asInstanceOf[js.Any], StepCount = StepCount.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], XOffset = XOffset.asInstanceOf[js.Any], YOffset = YOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gradient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gradient] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "Angle", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: Double): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setEndColor(value: Color): Self = StObject.set(x, "EndColor", value.asInstanceOf[js.Any])
    
    inline def setEndIntensity(value: Double): Self = StObject.set(x, "EndIntensity", value.asInstanceOf[js.Any])
    
    inline def setStartColor(value: Color): Self = StObject.set(x, "StartColor", value.asInstanceOf[js.Any])
    
    inline def setStartIntensity(value: Double): Self = StObject.set(x, "StartIntensity", value.asInstanceOf[js.Any])
    
    inline def setStepCount(value: Double): Self = StObject.set(x, "StepCount", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: GradientStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setXOffset(value: Double): Self = StObject.set(x, "XOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "YOffset", value.asInstanceOf[js.Any])
  }
}

package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct defines the appearance of a hatch.
  *
  * A hatch is a texture made of straight lines.
  */
trait Hatch extends StObject {
  
  /** You can rotate the lines of the hatch with this angle. */
  var Angle: Double
  
  /** This is the color of the hatch lines. */
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color
  
  /** This is the distance between the lines in the hatch. */
  var Distance: Double
  
  /** The HatchStyle defines the kind of lines used to draw this hatch. */
  var Style: HatchStyle
}
object Hatch {
  
  @scala.inline
  def apply(Angle: Double, Color: Color, Distance: Double, Style: HatchStyle): Hatch = {
    val __obj = js.Dynamic.literal(Angle = Angle.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hatch]
  }
  
  @scala.inline
  implicit class HatchMutableBuilder[Self <: Hatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "Angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: HatchStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}

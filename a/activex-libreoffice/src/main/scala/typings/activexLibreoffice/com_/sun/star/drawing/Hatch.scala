package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct defines the appearance of a hatch.
  *
  * A hatch is a texture made of straight lines.
  */
@js.native
trait Hatch extends js.Object {
  
  /** You can rotate the lines of the hatch with this angle. */
  var Angle: Double = js.native
  
  /** This is the color of the hatch lines. */
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color = js.native
  
  /** This is the distance between the lines in the hatch. */
  var Distance: Double = js.native
  
  /** The HatchStyle defines the kind of lines used to draw this hatch. */
  var Style: HatchStyle = js.native
}
object Hatch {
  
  @scala.inline
  def apply(Angle: Double, Color: Color, Distance: Double, Style: HatchStyle): Hatch = {
    val __obj = js.Dynamic.literal(Angle = Angle.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hatch]
  }
  
  @scala.inline
  implicit class HatchOps[Self <: Hatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("Angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: Color): Self = this.set("Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("Distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: HatchStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
  }
}

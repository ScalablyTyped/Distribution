package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a gradient between two colors. Many aspects of the gradient are undefined, like the algorithm and color space to use to interpolate between
  * the colors and what "intensity" means.
  */
@js.native
trait Gradient extends js.Object {
  
  /** angle of the gradient in 1/10 degree. */
  var Angle: Double = js.native
  
  /** per cent of the total width where just the start color is used. */
  var Border: Double = js.native
  
  /** specifies the color at the end point of the gradient. */
  var EndColor: Color = js.native
  
  /** specifies the intensity at the end point of the gradient. */
  var EndIntensity: Double = js.native
  
  /** specifies the color at the start point of the gradient. */
  var StartColor: Color = js.native
  
  /** Specifies the intensity at the start point of the gradient. What that means is undefined. */
  var StartIntensity: Double = js.native
  
  /** Specifies the number of steps of change color. What that means is undefined. */
  var StepCount: Double = js.native
  
  /** specifies the style of the gradient. */
  var Style: GradientStyle = js.native
  
  /**
    * Specifies the X-coordinate, where the gradient begins, whatever that means. Possibly means the **center** of the ELLIPTICAL, SQUARE and RECT style
    * gradients?
    */
  var XOffset: Double = js.native
  
  /** Specifies the Y-coordinate, where the gradient begins. See previous field. */
  var YOffset: Double = js.native
}
object Gradient {
  
  @scala.inline
  def apply(
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
  implicit class GradientOps[Self <: Gradient] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: Double): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColor(value: Color): Self = this.set("EndColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIntensity(value: Double): Self = this.set("EndIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColor(value: Color): Self = this.set("StartColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIntensity(value: Double): Self = this.set("StartIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepCount(value: Double): Self = this.set("StepCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: GradientStyle): Self = this.set("Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXOffset(value: Double): Self = this.set("XOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYOffset(value: Double): Self = this.set("YOffset", value.asInstanceOf[js.Any])
  }
}

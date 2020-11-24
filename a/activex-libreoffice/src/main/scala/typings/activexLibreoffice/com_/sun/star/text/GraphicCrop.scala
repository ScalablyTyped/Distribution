package typings.activexLibreoffice.com_.sun.star.text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes the cropping of graphic objects. Cropping means to show only parts of the object.
  *
  * Negative values cut the visible area; positive values extend the visible area by filling it with background color. The absolute sum of top and bottom
  * crop must be smaller than the objects original height. The absolute sum of the left and right crop must be smaller than the object's original width.
  *
  * If this property is applied to a graphic object, then this object will correct these values if necessary.
  */
@js.native
trait GraphicCrop extends js.Object {
  
  /** contains the bottom value to cut (if negative) or to extend (if positive) */
  var Bottom: Double = js.native
  
  /** contains the left value to cut (if negative) or to extend (if positive) */
  var Left: Double = js.native
  
  /** contains the right value to cut (if negative) or to extend (if positive) */
  var Right: Double = js.native
  
  /** contains the top value to cut (if negative) or to extend (if positive) */
  var Top: Double = js.native
}
object GraphicCrop {
  
  @scala.inline
  def apply(Bottom: Double, Left: Double, Right: Double, Top: Double): GraphicCrop = {
    val __obj = js.Dynamic.literal(Bottom = Bottom.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Right = Right.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicCrop]
  }
  
  @scala.inline
  implicit class GraphicCropOps[Self <: GraphicCrop] (val x: Self) extends AnyVal {
    
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
    def setBottom(value: Double): Self = this.set("Bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("Left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = this.set("Right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("Top", value.asInstanceOf[js.Any])
  }
}

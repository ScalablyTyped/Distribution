package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service specifies the general characteristics of an optional rotation and shearing for a {@link Shape} .
  *
  * This service is deprecated, instead please use the `Transformation` property of the service {@link Shape} .
  * @deprecated Deprecated
  */
@js.native
trait RotationDescriptor extends js.Object {
  
  /**
    * This is the angle for rotation of this {@link Shape} . The shape is rotated counter-clockwise around the center of the bounding box.
    *
    * This property contains an error, the rotation angle is mathematically inverted when You take into account that the Y-Axis of the coordinate system is
    * pointing down. Please use the `Transformation` property of the service {@link Shape} instead.
    * @deprecated Deprecated
    */
  var RotateAngle: Double = js.native
  
  /**
    * This is the amount of shearing for this {@link Shape} . The shape is sheared counter-clockwise around the center of the bounding box
    * @deprecated Deprecated
    */
  var ShearAngle: Double = js.native
}
object RotationDescriptor {
  
  @scala.inline
  def apply(RotateAngle: Double, ShearAngle: Double): RotationDescriptor = {
    val __obj = js.Dynamic.literal(RotateAngle = RotateAngle.asInstanceOf[js.Any], ShearAngle = ShearAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationDescriptor]
  }
  
  @scala.inline
  implicit class RotationDescriptorOps[Self <: RotationDescriptor] (val x: Self) extends AnyVal {
    
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
    def setRotateAngle(value: Double): Self = this.set("RotateAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShearAngle(value: Double): Self = this.set("ShearAngle", value.asInstanceOf[js.Any])
  }
}

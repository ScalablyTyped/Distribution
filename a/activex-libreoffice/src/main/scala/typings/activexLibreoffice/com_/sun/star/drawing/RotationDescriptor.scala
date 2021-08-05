package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This abstract service specifies the general characteristics of an optional rotation and shearing for a {@link Shape} .
  *
  * This service is deprecated, instead please use the `Transformation` property of the service {@link Shape} .
  * @deprecated Deprecated
  */
trait RotationDescriptor extends StObject {
  
  /**
    * This is the angle for rotation of this {@link Shape} . The shape is rotated counter-clockwise around the center of the bounding box.
    *
    * This property contains an error, the rotation angle is mathematically inverted when You take into account that the Y-Axis of the coordinate system is
    * pointing down. Please use the `Transformation` property of the service {@link Shape} instead.
    * @deprecated Deprecated
    */
  var RotateAngle: Double
  
  /**
    * This is the amount of shearing for this {@link Shape} . The shape is sheared counter-clockwise around the center of the bounding box
    * @deprecated Deprecated
    */
  var ShearAngle: Double
}
object RotationDescriptor {
  
  inline def apply(RotateAngle: Double, ShearAngle: Double): RotationDescriptor = {
    val __obj = js.Dynamic.literal(RotateAngle = RotateAngle.asInstanceOf[js.Any], ShearAngle = ShearAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationDescriptor]
  }
  
  extension [Self <: RotationDescriptor](x: Self) {
    
    inline def setRotateAngle(value: Double): Self = StObject.set(x, "RotateAngle", value.asInstanceOf[js.Any])
    
    inline def setShearAngle(value: Double): Self = StObject.set(x, "ShearAngle", value.asInstanceOf[js.Any])
  }
}

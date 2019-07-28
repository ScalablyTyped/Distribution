package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeGeometry extends js.Object {
  /** This property specifies a sequence of Adjustment values. */
  var AdjustmentValues: SafeArray[EnhancedCustomShapeAdjustmentValue]
  /**
    * This property is describing the equations that are used, each equation can be referenced by {@link com.sun.star.drawing.EnhancedCustomShapeParameter}
    * which are often used in Path, Extrusion and or Handle descriptions.
    */
  var Equations: SafeArray[String]
  /**
    * This property sequence is including the extrusion description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeExtrusion}
    */
  var Extrusion: SafeArray[PropertyValue]
  /**
    * This property is describing the interaction handles that are used, each inner property sequence is having the same properties as they are specified in
    * the service {@link com.sun.star} : {@link drawing.EnhancedCustomShapeHandle}
    */
  var Handles: SafeArray[PropertyValues]
  /** This property specifies if the orientation of the shape is horizontal mirrored. */
  var MirroredX: Boolean
  /** This property specifies if the orientation of the shape is vertical mirrored. */
  var MirroredY: Boolean
  /**
    * This property sequence is including the path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapePath}
    */
  var Path: SafeArray[PropertyValue]
  /**
    * This property sequence is including the text path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeTextPath}
    */
  var TextPath: SafeArray[PropertyValue]
  /** This property specifies the text rotation angle in degrees. The text rotation is added to the shape geometry rotation. */
  var TextRotateAngle: Double
  /**
    * The Type attribute contains the name of a shape type. This name can be used to offer specialized user interfaces for certain classes of shapes, like
    * for arrows, smileys, etc. The shape type is rendering engine dependent and does not influence the geometry of the shape. If the value of the draw:type
    * attribute is non-primitive, then no shape type is available.
    */
  var Type: String
  /** This property describes the user space of the shape in its canonical form */
  var ViewBox: Rectangle
}

object EnhancedCustomShapeGeometry {
  @scala.inline
  def apply(
    AdjustmentValues: SafeArray[EnhancedCustomShapeAdjustmentValue],
    Equations: SafeArray[String],
    Extrusion: SafeArray[PropertyValue],
    Handles: SafeArray[PropertyValues],
    MirroredX: Boolean,
    MirroredY: Boolean,
    Path: SafeArray[PropertyValue],
    TextPath: SafeArray[PropertyValue],
    TextRotateAngle: Double,
    Type: String,
    ViewBox: Rectangle
  ): EnhancedCustomShapeGeometry = {
    val __obj = js.Dynamic.literal(AdjustmentValues = AdjustmentValues, Equations = Equations, Extrusion = Extrusion, Handles = Handles, MirroredX = MirroredX, MirroredY = MirroredY, Path = Path, TextPath = TextPath, TextRotateAngle = TextRotateAngle, Type = Type, ViewBox = ViewBox)
  
    __obj.asInstanceOf[EnhancedCustomShapeGeometry]
  }
}


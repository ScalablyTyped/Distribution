package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapeGeometry extends js.Object {
  /** This property specifies a sequence of Adjustment values. */
  var AdjustmentValues: SafeArray[EnhancedCustomShapeAdjustmentValue] = js.native
  /**
    * This property is describing the equations that are used, each equation can be referenced by {@link com.sun.star.drawing.EnhancedCustomShapeParameter}
    * which are often used in Path, Extrusion and or Handle descriptions.
    */
  var Equations: SafeArray[String] = js.native
  /**
    * This property sequence is including the extrusion description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeExtrusion}
    */
  var Extrusion: SafeArray[PropertyValue] = js.native
  /**
    * This property is describing the interaction handles that are used, each inner property sequence is having the same properties as they are specified in
    * the service {@link com.sun.star} : {@link drawing.EnhancedCustomShapeHandle}
    */
  var Handles: SafeArray[PropertyValues] = js.native
  /** This property specifies if the orientation of the shape is horizontal mirrored. */
  var MirroredX: Boolean = js.native
  /** This property specifies if the orientation of the shape is vertical mirrored. */
  var MirroredY: Boolean = js.native
  /**
    * This property sequence is including the path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapePath}
    */
  var Path: SafeArray[PropertyValue] = js.native
  /**
    * This property sequence is including the text path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeTextPath}
    */
  var TextPath: SafeArray[PropertyValue] = js.native
  /** This property specifies the text rotation angle in degrees. The text rotation is added to the shape geometry rotation. */
  var TextRotateAngle: Double = js.native
  /**
    * The Type attribute contains the name of a shape type. This name can be used to offer specialized user interfaces for certain classes of shapes, like
    * for arrows, smileys, etc. The shape type is rendering engine dependent and does not influence the geometry of the shape. If the value of the draw:type
    * attribute is non-primitive, then no shape type is available.
    */
  var Type: String = js.native
  /** This property describes the user space of the shape in its canonical form */
  var ViewBox: Rectangle = js.native
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
    val __obj = js.Dynamic.literal(AdjustmentValues = AdjustmentValues.asInstanceOf[js.Any], Equations = Equations.asInstanceOf[js.Any], Extrusion = Extrusion.asInstanceOf[js.Any], Handles = Handles.asInstanceOf[js.Any], MirroredX = MirroredX.asInstanceOf[js.Any], MirroredY = MirroredY.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], TextPath = TextPath.asInstanceOf[js.Any], TextRotateAngle = TextRotateAngle.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], ViewBox = ViewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeGeometry]
  }
  @scala.inline
  implicit class EnhancedCustomShapeGeometryOps[Self <: EnhancedCustomShapeGeometry] (val x: Self) extends AnyVal {
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
    def setAdjustmentValues(value: SafeArray[EnhancedCustomShapeAdjustmentValue]): Self = this.set("AdjustmentValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setEquations(value: SafeArray[String]): Self = this.set("Equations", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtrusion(value: SafeArray[PropertyValue]): Self = this.set("Extrusion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandles(value: SafeArray[PropertyValues]): Self = this.set("Handles", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirroredX(value: Boolean): Self = this.set("MirroredX", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirroredY(value: Boolean): Self = this.set("MirroredY", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: SafeArray[PropertyValue]): Self = this.set("Path", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextPath(value: SafeArray[PropertyValue]): Self = this.set("TextPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextRotateAngle(value: Double): Self = this.set("TextRotateAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewBox(value: Rectangle): Self = this.set("ViewBox", value.asInstanceOf[js.Any])
  }
  
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapeGeometry extends js.Object {
  /** This property specifies a sequence of Adjustment values. */
  var AdjustmentValues: activexDashInteropLib.SafeArray[EnhancedCustomShapeAdjustmentValue]
  /**
    * This property is describing the equations that are used, each equation can be referenced by {@link com.sun.star.drawing.EnhancedCustomShapeParameter}
    * which are often used in Path, Extrusion and or Handle descriptions.
    */
  var Equations: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * This property sequence is including the extrusion description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeExtrusion}
    */
  var Extrusion: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * This property is describing the interaction handles that are used, each inner property sequence is having the same properties as they are specified in
    * the service {@link com.sun.star} : {@link drawing.EnhancedCustomShapeHandle}
    */
  var Handles: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
  /** This property specifies if the orientation of the shape is horizontal mirrored. */
  var MirroredX: scala.Boolean
  /** This property specifies if the orientation of the shape is vertical mirrored. */
  var MirroredY: scala.Boolean
  /**
    * This property sequence is including the path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapePath}
    */
  var Path: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * This property sequence is including the text path description, the properties are as same as specified in the service {@link com.sun.star} : {@link
    * drawing.EnhancedCustomShapeTextPath}
    */
  var TextPath: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** This property specifies the text rotation angle in degrees. The text rotation is added to the shape geometry rotation. */
  var TextRotateAngle: scala.Double
  /**
    * The Type attribute contains the name of a shape type. This name can be used to offer specialized user interfaces for certain classes of shapes, like
    * for arrows, smileys, etc. The shape type is rendering engine dependent and does not influence the geometry of the shape. If the value of the draw:type
    * attribute is non-primitive, then no shape type is available.
    */
  var Type: java.lang.String
  /** This property describes the user space of the shape in its canonical form */
  var ViewBox: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
}

object EnhancedCustomShapeGeometry {
  @scala.inline
  def apply(
    AdjustmentValues: activexDashInteropLib.SafeArray[EnhancedCustomShapeAdjustmentValue],
    Equations: activexDashInteropLib.SafeArray[java.lang.String],
    Extrusion: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    Handles: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues],
    MirroredX: scala.Boolean,
    MirroredY: scala.Boolean,
    Path: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TextPath: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TextRotateAngle: scala.Double,
    Type: java.lang.String,
    ViewBox: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  ): EnhancedCustomShapeGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustmentValues")(AdjustmentValues)
    __obj.updateDynamic("Equations")(Equations)
    __obj.updateDynamic("Extrusion")(Extrusion)
    __obj.updateDynamic("Handles")(Handles)
    __obj.updateDynamic("MirroredX")(MirroredX)
    __obj.updateDynamic("MirroredY")(MirroredY)
    __obj.updateDynamic("Path")(Path)
    __obj.updateDynamic("TextPath")(TextPath)
    __obj.updateDynamic("TextRotateAngle")(TextRotateAngle)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("ViewBox")(ViewBox)
    __obj.asInstanceOf[EnhancedCustomShapeGeometry]
  }
}


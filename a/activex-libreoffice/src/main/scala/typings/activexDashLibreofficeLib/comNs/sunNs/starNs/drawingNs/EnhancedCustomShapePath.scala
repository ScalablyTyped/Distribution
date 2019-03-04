package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapePath extends js.Object {
  /** This property specifies if this shape supports concentric gradient fill. The default is false. */
  var ConcentricGradientFillAllowed: scala.Boolean
  /** This property is specifying the points that makes the geometry of the shape */
  var Coordinates: activexDashInteropLib.SafeArray[EnhancedCustomShapeParameterPair]
  /** This property specifies if this shape supports the {@link EnhancedCustomShapeExtrusion} properties. The default is true. */
  var ExtrusionAllowed: scala.Boolean
  /** This property specifies {@link GluePoint} leaving directions. */
  var GluePointLeavingDirections: activexDashInteropLib.SafeArray[scala.Double]
  /**
    * This property defines the {@link GluePoint} type. The values that can be used are specified in {@link
    * com.sun.star.drawing.EnhancedCustomShapeGluePointType}
    */
  var GluePointType: scala.Double
  /** This property specifies custom glue points */
  var GluePoints: activexDashInteropLib.SafeArray[EnhancedCustomShapeParameterPair]
  /** This property specifies the commands and the way the Coordinates have to be interpreted. */
  var Segments: activexDashInteropLib.SafeArray[EnhancedCustomShapeSegment]
  /** This property specifies the horizontal StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchX: scala.Double
  /** This property specifies the vertical StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchY: scala.Double
  /** This property specifies view size per sub path */
  var SubViewSize: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size]
  /**
    * This property specifies the text frames that can be used with the shape. In general the first text frame is used, except the shape is containing
    * vertical text, then the object tries to use the second text frame. The default text frame will be as big as the shape.
    */
  var TextFrames: activexDashInteropLib.SafeArray[EnhancedCustomShapeTextFrame]
  /** This property specifies if this shape supports concentric gradient fill. The default is false; */
  var TextPathAllowed: scala.Boolean
}

object EnhancedCustomShapePath {
  @scala.inline
  def apply(
    ConcentricGradientFillAllowed: scala.Boolean,
    Coordinates: activexDashInteropLib.SafeArray[EnhancedCustomShapeParameterPair],
    ExtrusionAllowed: scala.Boolean,
    GluePointLeavingDirections: activexDashInteropLib.SafeArray[scala.Double],
    GluePointType: scala.Double,
    GluePoints: activexDashInteropLib.SafeArray[EnhancedCustomShapeParameterPair],
    Segments: activexDashInteropLib.SafeArray[EnhancedCustomShapeSegment],
    StretchX: scala.Double,
    StretchY: scala.Double,
    SubViewSize: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size],
    TextFrames: activexDashInteropLib.SafeArray[EnhancedCustomShapeTextFrame],
    TextPathAllowed: scala.Boolean
  ): EnhancedCustomShapePath = {
    val __obj = js.Dynamic.literal(ConcentricGradientFillAllowed = ConcentricGradientFillAllowed, Coordinates = Coordinates, ExtrusionAllowed = ExtrusionAllowed, GluePointLeavingDirections = GluePointLeavingDirections, GluePointType = GluePointType, GluePoints = GluePoints, Segments = Segments, StretchX = StretchX, StretchY = StretchY, SubViewSize = SubViewSize, TextFrames = TextFrames, TextPathAllowed = TextPathAllowed)
  
    __obj.asInstanceOf[EnhancedCustomShapePath]
  }
}


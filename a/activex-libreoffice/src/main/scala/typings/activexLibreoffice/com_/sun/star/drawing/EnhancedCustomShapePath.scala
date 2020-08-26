package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
@js.native
trait EnhancedCustomShapePath extends js.Object {
  /** This property specifies if this shape supports concentric gradient fill. The default is false. */
  var ConcentricGradientFillAllowed: Boolean = js.native
  /** This property is specifying the points that makes the geometry of the shape */
  var Coordinates: SafeArray[EnhancedCustomShapeParameterPair] = js.native
  /** This property specifies if this shape supports the {@link EnhancedCustomShapeExtrusion} properties. The default is true. */
  var ExtrusionAllowed: Boolean = js.native
  /** This property specifies {@link GluePoint} leaving directions. */
  var GluePointLeavingDirections: SafeArray[Double] = js.native
  /**
    * This property defines the {@link GluePoint} type. The values that can be used are specified in {@link
    * com.sun.star.drawing.EnhancedCustomShapeGluePointType}
    */
  var GluePointType: Double = js.native
  /** This property specifies custom glue points */
  var GluePoints: SafeArray[EnhancedCustomShapeParameterPair] = js.native
  /** This property specifies the commands and the way the Coordinates have to be interpreted. */
  var Segments: SafeArray[EnhancedCustomShapeSegment] = js.native
  /** This property specifies the horizontal StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchX: Double = js.native
  /** This property specifies the vertical StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchY: Double = js.native
  /** This property specifies view size per sub path */
  var SubViewSize: SafeArray[Size] = js.native
  /**
    * This property specifies the text frames that can be used with the shape. In general the first text frame is used, except the shape is containing
    * vertical text, then the object tries to use the second text frame. The default text frame will be as big as the shape.
    */
  var TextFrames: SafeArray[EnhancedCustomShapeTextFrame] = js.native
  /** This property specifies if this shape supports concentric gradient fill. The default is false; */
  var TextPathAllowed: Boolean = js.native
}

object EnhancedCustomShapePath {
  @scala.inline
  def apply(
    ConcentricGradientFillAllowed: Boolean,
    Coordinates: SafeArray[EnhancedCustomShapeParameterPair],
    ExtrusionAllowed: Boolean,
    GluePointLeavingDirections: SafeArray[Double],
    GluePointType: Double,
    GluePoints: SafeArray[EnhancedCustomShapeParameterPair],
    Segments: SafeArray[EnhancedCustomShapeSegment],
    StretchX: Double,
    StretchY: Double,
    SubViewSize: SafeArray[Size],
    TextFrames: SafeArray[EnhancedCustomShapeTextFrame],
    TextPathAllowed: Boolean
  ): EnhancedCustomShapePath = {
    val __obj = js.Dynamic.literal(ConcentricGradientFillAllowed = ConcentricGradientFillAllowed.asInstanceOf[js.Any], Coordinates = Coordinates.asInstanceOf[js.Any], ExtrusionAllowed = ExtrusionAllowed.asInstanceOf[js.Any], GluePointLeavingDirections = GluePointLeavingDirections.asInstanceOf[js.Any], GluePointType = GluePointType.asInstanceOf[js.Any], GluePoints = GluePoints.asInstanceOf[js.Any], Segments = Segments.asInstanceOf[js.Any], StretchX = StretchX.asInstanceOf[js.Any], StretchY = StretchY.asInstanceOf[js.Any], SubViewSize = SubViewSize.asInstanceOf[js.Any], TextFrames = TextFrames.asInstanceOf[js.Any], TextPathAllowed = TextPathAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapePath]
  }
  @scala.inline
  implicit class EnhancedCustomShapePathOps[Self <: EnhancedCustomShapePath] (val x: Self) extends AnyVal {
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
    def setConcentricGradientFillAllowed(value: Boolean): Self = this.set("ConcentricGradientFillAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoordinates(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = this.set("Coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtrusionAllowed(value: Boolean): Self = this.set("ExtrusionAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def setGluePointLeavingDirections(value: SafeArray[Double]): Self = this.set("GluePointLeavingDirections", value.asInstanceOf[js.Any])
    @scala.inline
    def setGluePointType(value: Double): Self = this.set("GluePointType", value.asInstanceOf[js.Any])
    @scala.inline
    def setGluePoints(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = this.set("GluePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegments(value: SafeArray[EnhancedCustomShapeSegment]): Self = this.set("Segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretchX(value: Double): Self = this.set("StretchX", value.asInstanceOf[js.Any])
    @scala.inline
    def setStretchY(value: Double): Self = this.set("StretchY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubViewSize(value: SafeArray[Size]): Self = this.set("SubViewSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextFrames(value: SafeArray[EnhancedCustomShapeTextFrame]): Self = this.set("TextFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextPathAllowed(value: Boolean): Self = this.set("TextPathAllowed", value.asInstanceOf[js.Any])
  }
  
}


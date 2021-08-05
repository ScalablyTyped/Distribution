package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Size
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service may be represented by a {@link com.sun.star.beans.PropertyValue} []. */
trait EnhancedCustomShapePath extends StObject {
  
  /** This property specifies if this shape supports concentric gradient fill. The default is false. */
  var ConcentricGradientFillAllowed: Boolean
  
  /** This property is specifying the points that makes the geometry of the shape */
  var Coordinates: SafeArray[EnhancedCustomShapeParameterPair]
  
  /** This property specifies if this shape supports the {@link EnhancedCustomShapeExtrusion} properties. The default is true. */
  var ExtrusionAllowed: Boolean
  
  /** This property specifies {@link GluePoint} leaving directions. */
  var GluePointLeavingDirections: SafeArray[Double]
  
  /**
    * This property defines the {@link GluePoint} type. The values that can be used are specified in {@link
    * com.sun.star.drawing.EnhancedCustomShapeGluePointType}
    */
  var GluePointType: Double
  
  /** This property specifies custom glue points */
  var GluePoints: SafeArray[EnhancedCustomShapeParameterPair]
  
  /** This property specifies the commands and the way the Coordinates have to be interpreted. */
  var Segments: SafeArray[EnhancedCustomShapeSegment]
  
  /** This property specifies the horizontal StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchX: Double
  
  /** This property specifies the vertical StretchPoint that has to be used. No stretching is used if this property is omitted. */
  var StretchY: Double
  
  /** This property specifies view size per sub path */
  var SubViewSize: SafeArray[Size]
  
  /**
    * This property specifies the text frames that can be used with the shape. In general the first text frame is used, except the shape is containing
    * vertical text, then the object tries to use the second text frame. The default text frame will be as big as the shape.
    */
  var TextFrames: SafeArray[EnhancedCustomShapeTextFrame]
  
  /** This property specifies if this shape supports concentric gradient fill. The default is false; */
  var TextPathAllowed: Boolean
}
object EnhancedCustomShapePath {
  
  inline def apply(
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
  
  extension [Self <: EnhancedCustomShapePath](x: Self) {
    
    inline def setConcentricGradientFillAllowed(value: Boolean): Self = StObject.set(x, "ConcentricGradientFillAllowed", value.asInstanceOf[js.Any])
    
    inline def setCoordinates(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
    
    inline def setExtrusionAllowed(value: Boolean): Self = StObject.set(x, "ExtrusionAllowed", value.asInstanceOf[js.Any])
    
    inline def setGluePointLeavingDirections(value: SafeArray[Double]): Self = StObject.set(x, "GluePointLeavingDirections", value.asInstanceOf[js.Any])
    
    inline def setGluePointType(value: Double): Self = StObject.set(x, "GluePointType", value.asInstanceOf[js.Any])
    
    inline def setGluePoints(value: SafeArray[EnhancedCustomShapeParameterPair]): Self = StObject.set(x, "GluePoints", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: SafeArray[EnhancedCustomShapeSegment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    inline def setStretchX(value: Double): Self = StObject.set(x, "StretchX", value.asInstanceOf[js.Any])
    
    inline def setStretchY(value: Double): Self = StObject.set(x, "StretchY", value.asInstanceOf[js.Any])
    
    inline def setSubViewSize(value: SafeArray[Size]): Self = StObject.set(x, "SubViewSize", value.asInstanceOf[js.Any])
    
    inline def setTextFrames(value: SafeArray[EnhancedCustomShapeTextFrame]): Self = StObject.set(x, "TextFrames", value.asInstanceOf[js.Any])
    
    inline def setTextPathAllowed(value: Boolean): Self = StObject.set(x, "TextPathAllowed", value.asInstanceOf[js.Any])
  }
}

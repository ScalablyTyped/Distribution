package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a set of properties to describe the style for rendering a Line.
  *
  * The properties for line ends and line starts are only supported by shapes with open line ends.
  */
@js.native
trait LineProperties extends StObject {
  
  /** This property defines the rendering of ends of thick lines */
  var LineCap: typings.activexLibreoffice.com_.sun.star.drawing.LineCap = js.native
  
  /** This property contains the line color. */
  var LineColor: Color = js.native
  
  /** This property contains the dash of the line. */
  var LineDash: typings.activexLibreoffice.com_.sun.star.drawing.LineDash = js.native
  
  /** This property contains the name of the dash of the line. */
  var LineDashName: String = js.native
  
  /** This property contains the line end in the form of a poly polygon Bezier. */
  var LineEnd: PolyPolygonBezierCoords = js.native
  
  /** If this property is `TRUE` , the line will end in the center of the polygon. */
  var LineEndCenter: Boolean = js.native
  
  /**
    * This property contains the name of the line end poly polygon Bezier.
    *
    * If this string is empty, no line end polygon is rendered.
    */
  var LineEndName: String = js.native
  
  /** This property contains the width of the line end polygon. */
  var LineEndWidth: Double = js.native
  
  /** This property defines the rendering of joints between thick lines */
  var LineJoint: typings.activexLibreoffice.com_.sun.star.drawing.LineJoint = js.native
  
  /** This property contains the line start in the form of a poly polygon Bezier. */
  var LineStart: PolyPolygonBezierCoords = js.native
  
  /** If this property is `TRUE` , the line will start from the center of the polygon. */
  var LineStartCenter: Boolean = js.native
  
  /**
    * This property contains the name of the line start poly polygon Bezier.
    *
    * If this string is empty, no line start polygon is rendered.
    */
  var LineStartName: String = js.native
  
  /** This property contains the width of the line start polygon. */
  var LineStartWidth: Double = js.native
  
  /** This property contains the type of the line. */
  var LineStyle: typings.activexLibreoffice.com_.sun.star.drawing.LineStyle = js.native
  
  /** This property contains the extent of transparency. */
  var LineTransparence: Double = js.native
  
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: Double = js.native
}
object LineProperties {
  
  @scala.inline
  def apply(
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double
  ): LineProperties = {
    val __obj = js.Dynamic.literal(LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProperties]
  }
  
  @scala.inline
  implicit class LinePropertiesMutableBuilder[Self <: LineProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineCap(value: LineCap): Self = StObject.set(x, "LineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColor(value: Color): Self = StObject.set(x, "LineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDash(value: LineDash): Self = StObject.set(x, "LineDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashName(value: String): Self = StObject.set(x, "LineDashName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEnd(value: PolyPolygonBezierCoords): Self = StObject.set(x, "LineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEndCenter(value: Boolean): Self = StObject.set(x, "LineEndCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEndName(value: String): Self = StObject.set(x, "LineEndName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEndWidth(value: Double): Self = StObject.set(x, "LineEndWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineJoint(value: LineJoint): Self = StObject.set(x, "LineJoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStart(value: PolyPolygonBezierCoords): Self = StObject.set(x, "LineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStartCenter(value: Boolean): Self = StObject.set(x, "LineStartCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStartName(value: String): Self = StObject.set(x, "LineStartName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStartWidth(value: Double): Self = StObject.set(x, "LineStartWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyle(value: LineStyle): Self = StObject.set(x, "LineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineTransparence(value: Double): Self = StObject.set(x, "LineTransparence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "LineWidth", value.asInstanceOf[js.Any])
  }
}

package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a set of properties to describe the style for rendering a Line.
  *
  * The properties for line ends and line starts are only supported by shapes with open line ends.
  */
trait LineProperties extends js.Object {
  /** This property defines the rendering of ends of thick lines */
  var LineCap: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap
  /** This property contains the line color. */
  var LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** This property contains the dash of the line. */
  var LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash
  /** This property contains the name of the dash of the line. */
  var LineDashName: java.lang.String
  /** This property contains the line end in the form of a poly polygon Bezier. */
  var LineEnd: PolyPolygonBezierCoords
  /** If this property is `TRUE` , the line will end in the center of the polygon. */
  var LineEndCenter: scala.Boolean
  /**
    * This property contains the name of the line end poly polygon Bezier.
    *
    * If this string is empty, no line end polygon is rendered.
    */
  var LineEndName: java.lang.String
  /** This property contains the width of the line end polygon. */
  var LineEndWidth: scala.Double
  /** This property defines the rendering of joints between thick lines */
  var LineJoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint
  /** This property contains the line start in the form of a poly polygon Bezier. */
  var LineStart: PolyPolygonBezierCoords
  /** If this property is `TRUE` , the line will start from the center of the polygon. */
  var LineStartCenter: scala.Boolean
  /**
    * This property contains the name of the line start poly polygon Bezier.
    *
    * If this string is empty, no line start polygon is rendered.
    */
  var LineStartName: java.lang.String
  /** This property contains the width of the line start polygon. */
  var LineStartWidth: scala.Double
  /** This property contains the type of the line. */
  var LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle
  /** This property contains the extent of transparency. */
  var LineTransparence: scala.Double
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: scala.Double
}

object LineProperties {
  @scala.inline
  def apply(
    LineCap: LineCap,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: LineDash,
    LineDashName: java.lang.String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: scala.Boolean,
    LineEndName: java.lang.String,
    LineEndWidth: scala.Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: scala.Boolean,
    LineStartName: java.lang.String,
    LineStartWidth: scala.Double,
    LineStyle: LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double
  ): LineProperties = {
    val __obj = js.Dynamic.literal(LineCap = LineCap, LineColor = LineColor, LineDash = LineDash, LineDashName = LineDashName, LineEnd = LineEnd, LineEndCenter = LineEndCenter, LineEndName = LineEndName, LineEndWidth = LineEndWidth, LineJoint = LineJoint, LineStart = LineStart, LineStartCenter = LineStartCenter, LineStartName = LineStartName, LineStartWidth = LineStartWidth, LineStyle = LineStyle, LineTransparence = LineTransparence, LineWidth = LineWidth)
  
    __obj.asInstanceOf[LineProperties]
  }
}


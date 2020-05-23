package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.util.Color
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
  var LineCap: typings.activexLibreoffice.com_.sun.star.drawing.LineCap
  /** This property contains the line color. */
  var LineColor: Color
  /** This property contains the dash of the line. */
  var LineDash: typings.activexLibreoffice.com_.sun.star.drawing.LineDash
  /** This property contains the name of the dash of the line. */
  var LineDashName: String
  /** This property contains the line end in the form of a poly polygon Bezier. */
  var LineEnd: PolyPolygonBezierCoords
  /** If this property is `TRUE` , the line will end in the center of the polygon. */
  var LineEndCenter: Boolean
  /**
    * This property contains the name of the line end poly polygon Bezier.
    *
    * If this string is empty, no line end polygon is rendered.
    */
  var LineEndName: String
  /** This property contains the width of the line end polygon. */
  var LineEndWidth: Double
  /** This property defines the rendering of joints between thick lines */
  var LineJoint: typings.activexLibreoffice.com_.sun.star.drawing.LineJoint
  /** This property contains the line start in the form of a poly polygon Bezier. */
  var LineStart: PolyPolygonBezierCoords
  /** If this property is `TRUE` , the line will start from the center of the polygon. */
  var LineStartCenter: Boolean
  /**
    * This property contains the name of the line start poly polygon Bezier.
    *
    * If this string is empty, no line start polygon is rendered.
    */
  var LineStartName: String
  /** This property contains the width of the line start polygon. */
  var LineStartWidth: Double
  /** This property contains the type of the line. */
  var LineStyle: typings.activexLibreoffice.com_.sun.star.drawing.LineStyle
  /** This property contains the extent of transparency. */
  var LineTransparence: Double
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: Double
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
}


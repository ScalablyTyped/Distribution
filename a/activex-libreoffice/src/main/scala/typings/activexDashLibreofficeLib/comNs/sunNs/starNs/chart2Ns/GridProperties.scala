package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Must be supported by all grids */
trait GridProperties
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineProperties {
  /** Determines, whether the grid should be rendered by the view. */
  var Show: scala.Boolean
}

object GridProperties {
  @scala.inline
  def apply(
    LineCap: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap,
    LineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    LineDash: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineDash,
    LineDashName: java.lang.String,
    LineEnd: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineEndCenter: scala.Boolean,
    LineEndName: java.lang.String,
    LineEndWidth: scala.Double,
    LineJoint: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineJoint,
    LineStart: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolyPolygonBezierCoords,
    LineStartCenter: scala.Boolean,
    LineStartName: java.lang.String,
    LineStartWidth: scala.Double,
    LineStyle: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle,
    LineTransparence: scala.Double,
    LineWidth: scala.Double,
    Show: scala.Boolean
  ): GridProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LineCap")(LineCap)
    __obj.updateDynamic("LineColor")(LineColor)
    __obj.updateDynamic("LineDash")(LineDash)
    __obj.updateDynamic("LineDashName")(LineDashName)
    __obj.updateDynamic("LineEnd")(LineEnd)
    __obj.updateDynamic("LineEndCenter")(LineEndCenter)
    __obj.updateDynamic("LineEndName")(LineEndName)
    __obj.updateDynamic("LineEndWidth")(LineEndWidth)
    __obj.updateDynamic("LineJoint")(LineJoint)
    __obj.updateDynamic("LineStart")(LineStart)
    __obj.updateDynamic("LineStartCenter")(LineStartCenter)
    __obj.updateDynamic("LineStartName")(LineStartName)
    __obj.updateDynamic("LineStartWidth")(LineStartWidth)
    __obj.updateDynamic("LineStyle")(LineStyle)
    __obj.updateDynamic("LineTransparence")(LineTransparence)
    __obj.updateDynamic("LineWidth")(LineWidth)
    __obj.updateDynamic("Show")(Show)
    __obj.asInstanceOf[GridProperties]
  }
}


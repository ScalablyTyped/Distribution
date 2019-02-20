package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectorType extends js.Object

/** The ConnectorType specifies the appearance of a connector. */
@JSGlobal("com.sun.star.drawing.ConnectorType")
@js.native
object ConnectorType extends js.Object {
  /** the {@link ConnectorShape} is drawn as a curve */
  @js.native
  sealed trait CURVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorType
  
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @js.native
  sealed trait LINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorType
  
  /** the connector is drawn with three lines */
  @js.native
  sealed trait LINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorType
  
  /**
    * the graphic is rendered in the default color style of the output device,
    *
    * the connector is drawn with three lines, with the middle line perpendicular to the other two
    *
    * use the length measurement.
    */
  @js.native
  sealed trait STANDARD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorType
  
  /* 1 */ val CURVE: CURVE with scala.Double = js.native
  /* 2 */ val LINE: LINE with scala.Double = js.native
  /* 3 */ val LINES: LINES with scala.Double = js.native
  /* 0 */ val STANDARD: STANDARD with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectorType with scala.Double
  ] = js.native
}


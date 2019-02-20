package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CurveStyle extends js.Object

/** Sets the type of curves that are drawn for line charts. */
@JSGlobal("com.sun.star.chart2.CurveStyle")
@js.native
object CurveStyle extends js.Object {
  /** Data points are connected via a parametric, interpolating B-spline curve. */
  @js.native
  sealed trait B_SPLINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /** Data points are connected via a smoothed cubic spline curve. The data points themselves are part of to the curve. */
  @js.native
  sealed trait CUBIC_SPLINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /** Lines between data points are not smoothed */
  @js.native
  sealed trait LINES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  @js.native
  sealed trait NURBS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal till the center of the X values.
    *
    * +--O
    *
    *             |
    *
    *             |
    *
    *             |
    *
    *          O--+
    */
  @js.native
  sealed trait STEP_CENTER_X
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal at the center of the Y values.
    *
    * O
    *
    *                |
    *
    *          +-----+
    *
    *          |
    *
    *          O
    */
  @js.native
  sealed trait STEP_CENTER_Y
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /**
    * Data points are connected via a 2-segmented stepped line. The line ends horizontally.
    *
    * +------O
    *
    *         |
    *
    *         |
    *
    *         |
    *
    *         O
    */
  @js.native
  sealed trait STEP_END
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /**
    * Data points are connected via a 2-segmented stepped line. The line starts horizontally.
    *
    * O
    *
    *                |
    *
    *                |
    *
    *                |
    *
    *          O-----+
    */
  @js.native
  sealed trait STEP_START
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle
  
  /* 2 */ val B_SPLINES: B_SPLINES with scala.Double = js.native
  /* 1 */ val CUBIC_SPLINES: CUBIC_SPLINES with scala.Double = js.native
  /* 0 */ val LINES: LINES with scala.Double = js.native
  /* 3 */ val NURBS: NURBS with scala.Double = js.native
  /* 6 */ val STEP_CENTER_X: STEP_CENTER_X with scala.Double = js.native
  /* 7 */ val STEP_CENTER_Y: STEP_CENTER_Y with scala.Double = js.native
  /* 5 */ val STEP_END: STEP_END with scala.Double = js.native
  /* 4 */ val STEP_START: STEP_START with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns.CurveStyle with scala.Double
  ] = js.native
}


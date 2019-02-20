package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolygonFlags extends js.Object

/** defines how a Bezier curve goes through a point. */
@JSGlobal("com.sun.star.drawing.PolygonFlags")
@js.native
object PolygonFlags extends js.Object {
  /** the point is a control point, to control the curve from the user interface. */
  @js.native
  sealed trait CONTROL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonFlags
  
  /**
    * the text is drawn along the path without scaling.
    *
    * the point is normal, from the curve discussion view.
    */
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonFlags
  
  /**
    * the point is smooth, the first derivation from the curve discussion view.
    *
    * With SMOOTH shading, the colors of the lit vertices is interpolated.
    */
  @js.native
  sealed trait SMOOTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonFlags
  
  /** the point is symmetric, the second derivation from the curve discussion view. */
  @js.native
  sealed trait SYMMETRIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonFlags
  
  /* 2 */ val CONTROL: CONTROL with scala.Double = js.native
  /* 0 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 1 */ val SMOOTH: SMOOTH with scala.Double = js.native
  /* 3 */ val SYMMETRIC: SYMMETRIC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonFlags with scala.Double
  ] = js.native
}


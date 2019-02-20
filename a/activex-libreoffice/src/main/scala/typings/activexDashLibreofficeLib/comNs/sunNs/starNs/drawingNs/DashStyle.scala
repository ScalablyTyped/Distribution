package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

/** This enumeration defines the style of a dash on a line. */
@JSGlobal("com.sun.star.drawing.DashStyle")
@js.native
object DashStyle extends js.Object {
  /** the dash is a rectangle */
  @js.native
  sealed trait RECT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashStyle
  
  /** the dash is a rectangle, with the size of the dash given in relation to the length of the line */
  @js.native
  sealed trait RECTRELATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashStyle
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @js.native
  sealed trait ROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashStyle
  
  /** the dash is a point, with the size of the dash given in relation to the length of the line */
  @js.native
  sealed trait ROUNDRELATIVE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashStyle
  
  /* 0 */ val RECT: RECT with scala.Double = js.native
  /* 2 */ val RECTRELATIVE: RECTRELATIVE with scala.Double = js.native
  /* 1 */ val ROUND: ROUND with scala.Double = js.native
  /* 3 */ val ROUNDRELATIVE: ROUNDRELATIVE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.DashStyle with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCap extends js.Object

/** The LineCap defines rendering of ends of thick lines */
@JSGlobal("com.sun.star.drawing.LineCap")
@js.native
object LineCap extends js.Object {
  /** the line will end without any additional shape */
  @js.native
  sealed trait BUTT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @js.native
  sealed trait ROUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  @js.native
  sealed trait SQUARE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap
  
  /* 0 */ val BUTT: BUTT with scala.Double = js.native
  /* 1 */ val ROUND: ROUND with scala.Double = js.native
  /* 2 */ val SQUARE: SQUARE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineCap with scala.Double] = js.native
}


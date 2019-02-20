package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EscapeDirection extends js.Object

/** This enumeration defines the escape direction a connector takes on a glue point. */
@JSGlobal("com.sun.star.drawing.EscapeDirection")
@js.native
object EscapeDirection extends js.Object {
  @js.native
  sealed trait DOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  /** mirror to the horizontal axis */
  @js.native
  sealed trait HORIZONTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  @js.native
  sealed trait SMART
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  @js.native
  sealed trait UP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  /** mirror to the vertical axis */
  @js.native
  sealed trait VERTICAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection
  
  /* 4 */ val DOWN: DOWN with scala.Double = js.native
  /* 5 */ val HORIZONTAL: HORIZONTAL with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 0 */ val SMART: SMART with scala.Double = js.native
  /* 3 */ val UP: UP with scala.Double = js.native
  /* 6 */ val VERTICAL: VERTICAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.EscapeDirection with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAnimationDirection extends js.Object

/** This enumeration defines the movement direction of a scrolltext. */
@JSGlobal("com.sun.star.drawing.TextAnimationDirection")
@js.native
object TextAnimationDirection extends js.Object {
  @js.native
  sealed trait DOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationDirection
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationDirection
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationDirection
  
  @js.native
  sealed trait UP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationDirection
  
  /* 3 */ val DOWN: DOWN with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 1 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 2 */ val UP: UP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAnimationDirection with scala.Double
  ] = js.native
}


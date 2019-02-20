package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextHorizontalAdjust extends js.Object

/**
  * This enumeration specifies the horizontal position of text inside a shape in relation to the shape.
  *
  * This counts for the complete text, not individual lines.
  */
@JSGlobal("com.sun.star.drawing.TextHorizontalAdjust")
@js.native
object TextHorizontalAdjust extends js.Object {
  /**
    * The text extends from the left to the right edge of the shape.
    *
    * The text extends from the top to the bottom edge of the shape.
    */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust
  
  /** The text is centered inside the shape. */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust
  
  /* 3 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextHorizontalAdjust with scala.Double
  ] = js.native
}


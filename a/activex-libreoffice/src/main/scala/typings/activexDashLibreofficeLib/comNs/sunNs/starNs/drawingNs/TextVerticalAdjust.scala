package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextVerticalAdjust extends js.Object

/**
  * This enumeration specifies the vertical position of text inside a shape in relation to the shape.
  *
  * This counts for the complete text, not individual lines.
  */
@JSGlobal("com.sun.star.drawing.TextVerticalAdjust")
@js.native
object TextVerticalAdjust extends js.Object {
  /**
    * The text extends from the left to the right edge of the shape.
    *
    * The text extends from the top to the bottom edge of the shape.
    */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  
  /**
    * the connection line leaves the connected object from the bottom,
    *
    * The bottom edge of the text is adjusted to the bottom edge of the shape.
    *
    * The text is positioned below the main line.
    */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  
  /** The text is centered inside the shape. */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  
  /**
    * the connection line leaves the connected object from the top,
    *
    * The top edge of the text is adjusted to the top edge of the shape.
    *
    * The text is positioned above the main line.
    */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust
  
  /* 3 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 2 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextVerticalAdjust with scala.Double
  ] = js.native
}


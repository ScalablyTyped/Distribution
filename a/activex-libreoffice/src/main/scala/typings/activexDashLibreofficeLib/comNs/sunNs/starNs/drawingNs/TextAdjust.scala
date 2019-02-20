package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAdjust extends js.Object

/**
  * This enumeration specifies the position of a text inside a shape in relation to the shape.
  * @deprecated Deprecated  This counts for the complete text, not individual lines.
  */
@JSGlobal("com.sun.star.drawing.TextAdjust")
@js.native
object TextAdjust extends js.Object {
  /**
    * The text extends from the left to the right edge of the shape.
    *
    * The text extends from the top to the bottom edge of the shape.
    */
  @js.native
  sealed trait BLOCK
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust
  
  /** The text is centered inside the shape. */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust
  
  /**
    * the bitmap is stretched to fill the area.
    *
    * The text is stretched so that the longest line goes from the left to the right edge of the shape.
    */
  @js.native
  sealed trait STRETCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust
  
  /* 3 */ val BLOCK: BLOCK with scala.Double = js.native
  /* 1 */ val CENTER: CENTER with scala.Double = js.native
  /* 0 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 4 */ val STRETCH: STRETCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.TextAdjust with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Alignment extends js.Object

/** The Alignment enumeration is a general way to specify the alignment of an object or sub-object relative to another object. */
@JSGlobal("com.sun.star.drawing.Alignment")
@js.native
object Alignment extends js.Object {
  /**
    * the connection line leaves the connected object from the bottom,
    *
    * The bottom edge of the text is adjusted to the bottom edge of the shape.
    *
    * The text is positioned below the main line.
    */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  @js.native
  sealed trait BOTTOM_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  @js.native
  sealed trait BOTTOM_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  /** The text is centered inside the shape. */
  @js.native
  sealed trait CENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  /**
    * the connection line leaves the connected object from the top,
    *
    * The top edge of the text is adjusted to the top edge of the shape.
    *
    * The text is positioned above the main line.
    */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  @js.native
  sealed trait TOP_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  @js.native
  sealed trait TOP_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  
  /* 7 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 6 */ val BOTTOM_LEFT: BOTTOM_LEFT with scala.Double = js.native
  /* 8 */ val BOTTOM_RIGHT: BOTTOM_RIGHT with scala.Double = js.native
  /* 4 */ val CENTER: CENTER with scala.Double = js.native
  /* 3 */ val LEFT: LEFT with scala.Double = js.native
  /* 5 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  /* 0 */ val TOP_LEFT: TOP_LEFT with scala.Double = js.native
  /* 2 */ val TOP_RIGHT: TOP_RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment with scala.Double
  ] = js.native
}


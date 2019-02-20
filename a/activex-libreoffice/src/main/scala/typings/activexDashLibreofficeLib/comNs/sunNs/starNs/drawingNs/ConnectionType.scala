package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConnectionType extends js.Object

/** the direction where the connection line leaves the connection point. */
@JSGlobal("com.sun.star.drawing.ConnectionType")
@js.native
object ConnectionType extends js.Object {
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /**
    * the connection line leaves the connected object from the bottom,
    *
    * The bottom edge of the text is adjusted to the bottom edge of the shape.
    *
    * The text is positioned below the main line.
    */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /**
    * not implemented, yet.
    *
    * deprecated
    */
  @js.native
  sealed trait SPECIAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /**
    * the connection line leaves the connected object from the top,
    *
    * The top edge of the text is adjusted to the top edge of the shape.
    *
    * The text is positioned above the main line.
    */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 4 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 3 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 5 */ val SPECIAL: SPECIAL with scala.Double = js.native
  /* 2 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.ConnectionType with scala.Double
  ] = js.native
}


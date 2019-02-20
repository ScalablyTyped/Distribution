package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalDimensioning extends js.Object

/** The HorizontalDimensioning specifies the horizontal position of the text of a dimensioning shape. */
@JSGlobal("com.sun.star.drawing.HorizontalDimensioning")
@js.native
object HorizontalDimensioning extends js.Object {
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HorizontalDimensioning
  
  /**
    * The text is positioned at the center.
    *
    * The text is positioned over the main line.
    */
  @js.native
  sealed trait CENTERED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HorizontalDimensioning
  
  /**
    * the connection line leaves the connected object to the left,
    *
    * The text is positioned to the left.
    *
    * The left edge of the text is adjusted to the left edge of the shape.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HorizontalDimensioning
  
  /**
    * the connection line leaves the connected object to the right,
    *
    * The text is positioned to the right.
    *
    * The right edge of the text is adjusted to the right edge of the shape.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HorizontalDimensioning
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 2 */ val CENTERED: CENTERED with scala.Double = js.native
  /* 1 */ val LEFT: LEFT with scala.Double = js.native
  /* 3 */ val RIGHT: RIGHT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.HorizontalDimensioning with scala.Double
  ] = js.native
}


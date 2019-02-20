package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalDimensioning extends js.Object

/** specifies the vertical position of the text of a dimensioning shape. */
@JSGlobal("com.sun.star.drawing.VerticalDimensioning")
@js.native
object VerticalDimensioning extends js.Object {
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @js.native
  sealed trait AUTO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.VerticalDimensioning
  
  /**
    * the connection line leaves the connected object from the bottom,
    *
    * The bottom edge of the text is adjusted to the bottom edge of the shape.
    *
    * The text is positioned below the main line.
    */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.VerticalDimensioning
  
  /**
    * The text is positioned at the center.
    *
    * The text is positioned over the main line.
    */
  @js.native
  sealed trait CENTERED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.VerticalDimensioning
  
  /**
    * the connection line leaves the connected object from the top,
    *
    * The top edge of the text is adjusted to the top edge of the shape.
    *
    * The text is positioned above the main line.
    */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.VerticalDimensioning
  
  /* 0 */ val AUTO: AUTO with scala.Double = js.native
  /* 3 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 2 */ val CENTERED: CENTERED with scala.Double = js.native
  /* 1 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.VerticalDimensioning with scala.Double
  ] = js.native
}


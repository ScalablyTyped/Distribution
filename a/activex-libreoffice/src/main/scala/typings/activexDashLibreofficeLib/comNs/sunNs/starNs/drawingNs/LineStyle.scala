package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineStyle extends js.Object

/** specifies the appearance of the lines of a shape. */
@JSGlobal("com.sun.star.drawing.LineStyle")
@js.native
object LineStyle extends js.Object {
  /** the line use dashes. */
  @js.native
  sealed trait DASH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle
  
  /**
    * use a solid color to fill the area.
    *
    * the line is solid.
    */
  @js.native
  sealed trait SOLID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle
  
  /* 2 */ val DASH: DASH with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val SOLID: SOLID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.LineStyle with scala.Double
  ] = js.native
}


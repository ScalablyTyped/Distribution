package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillStyle extends js.Object

/** specifies how an area will be filled. */
@JSGlobal("com.sun.star.drawing.FillStyle")
@js.native
object FillStyle extends js.Object {
  /** use a bitmap to fill the area. */
  @js.native
  sealed trait BITMAP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  
  /** use a gradient color to fill the area. */
  @js.native
  sealed trait GRADIENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  
  /** use a hatch to fill the area. */
  @js.native
  sealed trait HATCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  
  /**
    * use a solid color to fill the area.
    *
    * the line is solid.
    */
  @js.native
  sealed trait SOLID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle
  
  /* 4 */ val BITMAP: BITMAP with scala.Double = js.native
  /* 2 */ val GRADIENT: GRADIENT with scala.Double = js.native
  /* 3 */ val HATCH: HATCH with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val SOLID: SOLID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.FillStyle with scala.Double
  ] = js.native
}


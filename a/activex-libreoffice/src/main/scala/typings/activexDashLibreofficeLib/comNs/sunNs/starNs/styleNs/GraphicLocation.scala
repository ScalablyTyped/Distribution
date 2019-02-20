package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GraphicLocation extends js.Object

/** These enumeration values are used to specify the location of a graphic object within its surroundings. */
@JSGlobal("com.sun.star.style.GraphicLocation")
@js.native
object GraphicLocation extends js.Object {
  /** The graphic is scaled to fill the whole surrounding area. */
  @js.native
  sealed trait AREA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the bottom left corner. */
  @js.native
  sealed trait LEFT_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the middle of the left edge. */
  @js.native
  sealed trait LEFT_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the top left corner. */
  @js.native
  sealed trait LEFT_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the middle of the bottom edge. */
  @js.native
  sealed trait MIDDLE_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located at the center of the surrounding object. */
  @js.native
  sealed trait MIDDLE_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the middle of the top edge. */
  @js.native
  sealed trait MIDDLE_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the bottom right corner. */
  @js.native
  sealed trait RIGHT_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the middle of the right edge. */
  @js.native
  sealed trait RIGHT_MIDDLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is located in the top right corner. */
  @js.native
  sealed trait RIGHT_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /** The graphic is repeatedly spread over the surrounding object like tiles. */
  @js.native
  sealed trait TILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  
  /* 10 */ val AREA: AREA with scala.Double = js.native
  /* 7 */ val LEFT_BOTTOM: LEFT_BOTTOM with scala.Double = js.native
  /* 4 */ val LEFT_MIDDLE: LEFT_MIDDLE with scala.Double = js.native
  /* 1 */ val LEFT_TOP: LEFT_TOP with scala.Double = js.native
  /* 8 */ val MIDDLE_BOTTOM: MIDDLE_BOTTOM with scala.Double = js.native
  /* 5 */ val MIDDLE_MIDDLE: MIDDLE_MIDDLE with scala.Double = js.native
  /* 2 */ val MIDDLE_TOP: MIDDLE_TOP with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 9 */ val RIGHT_BOTTOM: RIGHT_BOTTOM with scala.Double = js.native
  /* 6 */ val RIGHT_MIDDLE: RIGHT_MIDDLE with scala.Double = js.native
  /* 3 */ val RIGHT_TOP: RIGHT_TOP with scala.Double = js.native
  /* 11 */ val TILED: TILED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Border extends js.Object

/** is used to select one of the four borders of a cell range. */
@JSGlobal("com.sun.star.sheet.Border")
@js.native
object Border extends js.Object {
  /** selects the bottom border. */
  @js.native
  sealed trait BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Border
  
  /**
    * selects the left border.
    *
    * the cells to the right of the deleted cells are moved left.
    */
  @js.native
  sealed trait LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Border
  
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  @js.native
  sealed trait RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Border
  
  /** selects the top border. */
  @js.native
  sealed trait TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Border
  
  /* 1 */ val BOTTOM: BOTTOM with scala.Double = js.native
  /* 3 */ val LEFT: LEFT with scala.Double = js.native
  /* 2 */ val RIGHT: RIGHT with scala.Double = js.native
  /* 0 */ val TOP: TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.Border with scala.Double] = js.native
}


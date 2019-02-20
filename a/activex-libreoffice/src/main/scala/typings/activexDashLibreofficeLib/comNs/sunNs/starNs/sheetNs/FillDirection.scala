package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillDirection extends js.Object

/** used to specify the direction of filling cells, for example, with a series. */
@JSGlobal("com.sun.star.sheet.FillDirection")
@js.native
object FillDirection extends js.Object {
  /** specifies that rows are filled from top to bottom. */
  @js.native
  sealed trait TO_BOTTOM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDirection
  
  /** specifies that columns are filled from right to left. */
  @js.native
  sealed trait TO_LEFT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDirection
  
  /** specifies that columns are filled from left to right. */
  @js.native
  sealed trait TO_RIGHT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDirection
  
  /** specifies that rows are filled from bottom to top. */
  @js.native
  sealed trait TO_TOP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDirection
  
  /* 0 */ val TO_BOTTOM: TO_BOTTOM with scala.Double = js.native
  /* 3 */ val TO_LEFT: TO_LEFT with scala.Double = js.native
  /* 1 */ val TO_RIGHT: TO_RIGHT with scala.Double = js.native
  /* 2 */ val TO_TOP: TO_TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDirection with scala.Double
  ] = js.native
}


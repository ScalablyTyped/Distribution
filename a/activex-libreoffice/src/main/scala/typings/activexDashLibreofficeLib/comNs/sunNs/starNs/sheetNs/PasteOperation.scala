package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PasteOperation extends js.Object

/** used to specify which operations are carried out when pasting cell values into a cell range. */
@JSGlobal("com.sun.star.sheet.PasteOperation")
@js.native
object PasteOperation extends js.Object {
  /** old and new values are added. */
  @js.native
  sealed trait ADD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation
  
  /** new values are divided by the new values. */
  @js.native
  sealed trait DIVIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation
  
  /** old and new values are multiplied. */
  @js.native
  sealed trait MULTIPLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation
  
  /** new values are subtracted from the old values. */
  @js.native
  sealed trait SUBTRACT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation
  
  /* 1 */ val ADD: ADD with scala.Double = js.native
  /* 4 */ val DIVIDE: DIVIDE with scala.Double = js.native
  /* 3 */ val MULTIPLY: MULTIPLY with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val SUBTRACT: SUBTRACT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.PasteOperation with scala.Double
  ] = js.native
}


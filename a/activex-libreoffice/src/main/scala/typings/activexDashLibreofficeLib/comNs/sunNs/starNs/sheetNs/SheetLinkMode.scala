package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SheetLinkMode extends js.Object

/**
  * used to specify how a sheet is linked to another sheet.
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  * @see com.sun.star.sheet.XSheetLinkable
  */
@JSGlobal("com.sun.star.sheet.SheetLinkMode")
@js.native
object SheetLinkMode extends js.Object {
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
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinkMode
  
  /** all contents (values and formulas) are copied. */
  @js.native
  sealed trait NORMAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinkMode
  
  /** instead of using formulas, the result values are copied. */
  @js.native
  sealed trait VALUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinkMode
  
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 2 */ val VALUE: VALUE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SheetLinkMode with scala.Double
  ] = js.native
}


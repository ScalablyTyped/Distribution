package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to specify how a sheet is linked to another sheet.
  * @see com.sun.star.sheet.SheetLinks
  * @see com.sun.star.sheet.SheetLink
  * @see com.sun.star.sheet.XSheetLinkable
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait SheetLinkMode extends js.Object

object SheetLinkMode {
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
  @scala.inline
  def NONE: `0` = this.cast(0)
  /** all contents (values and formulas) are copied. */
  @scala.inline
  def NORMAL: `1` = this.cast(1)
  /** instead of using formulas, the result values are copied. */
  @scala.inline
  def VALUE: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


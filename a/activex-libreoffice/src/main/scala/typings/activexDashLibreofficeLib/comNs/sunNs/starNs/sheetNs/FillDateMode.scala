package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillDateMode extends js.Object

/**
  * used to specify how an arithmetic date series is calculated.
  * @see com.sun.star.sheet.FillMode
  */
@JSGlobal("com.sun.star.sheet.FillDateMode")
@js.native
object FillDateMode extends js.Object {
  /** for every new value a single day is added. */
  @js.native
  sealed trait FILL_DATE_DAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDateMode
  
  /** for every new value one month is added (day keeps unchanged). */
  @js.native
  sealed trait FILL_DATE_MONTH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDateMode
  
  /** for every new value a single day is added, but Saturdays and Sundays are skipped. */
  @js.native
  sealed trait FILL_DATE_WEEKDAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDateMode
  
  /** for every new value one year is added (day and month keep unchanged). */
  @js.native
  sealed trait FILL_DATE_YEAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDateMode
  
  /* 0 */ val FILL_DATE_DAY: FILL_DATE_DAY with scala.Double = js.native
  /* 2 */ val FILL_DATE_MONTH: FILL_DATE_MONTH with scala.Double = js.native
  /* 1 */ val FILL_DATE_WEEKDAY: FILL_DATE_WEEKDAY with scala.Double = js.native
  /* 3 */ val FILL_DATE_YEAR: FILL_DATE_YEAR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.FillDateMode with scala.Double
  ] = js.native
}


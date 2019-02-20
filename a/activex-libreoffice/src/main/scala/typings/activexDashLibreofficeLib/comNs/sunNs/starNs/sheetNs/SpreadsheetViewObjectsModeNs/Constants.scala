package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewObjectsModeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.SpreadsheetViewObjectsMode.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait HIDE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewObjectsModeNs.Constants
  
  @js.native
  sealed trait SHOW
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewObjectsModeNs.Constants
  
  /* 1 */ val HIDE: HIDE with scala.Double = js.native
  /* 0 */ val SHOW: SHOW with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.SpreadsheetViewObjectsModeNs.Constants with scala.Double
  ] = js.native
}


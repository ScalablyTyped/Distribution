package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataResultFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.DataResultFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataResultFlagsNs.Constants
  
  @js.native
  sealed trait HASDATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataResultFlagsNs.Constants
  
  @js.native
  sealed trait SUBTOTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataResultFlagsNs.Constants
  
  /* 4 */ val ERROR: ERROR with scala.Double = js.native
  /* 1 */ val HASDATA: HASDATA with scala.Double = js.native
  /* 2 */ val SUBTOTAL: SUBTOTAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.DataResultFlagsNs.Constants with scala.Double
  ] = js.native
}


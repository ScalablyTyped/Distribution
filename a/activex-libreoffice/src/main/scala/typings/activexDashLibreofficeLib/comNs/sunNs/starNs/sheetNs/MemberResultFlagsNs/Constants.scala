package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sheet.MemberResultFlags.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait CONTINUE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants
  
  @js.native
  sealed trait GRANDTOTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants
  
  @js.native
  sealed trait HASMEMBER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants
  
  @js.native
  sealed trait NUMERIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants
  
  @js.native
  sealed trait SUBTOTAL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants
  
  /* 4 */ val CONTINUE: CONTINUE with scala.Double = js.native
  /* 8 */ val GRANDTOTAL: GRANDTOTAL with scala.Double = js.native
  /* 1 */ val HASMEMBER: HASMEMBER with scala.Double = js.native
  /* 16 */ val NUMERIC: NUMERIC with scala.Double = js.native
  /* 2 */ val SUBTOTAL: SUBTOTAL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.MemberResultFlagsNs.Constants with scala.Double
  ] = js.native
}


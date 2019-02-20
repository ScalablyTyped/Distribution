package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PrinterIndependentLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.document.PrinterIndependentLayout.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DISABLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PrinterIndependentLayoutNs.Constants
  
  @js.native
  sealed trait HIGH_RESOLUTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PrinterIndependentLayoutNs.Constants
  
  @js.native
  sealed trait LOW_RESOLUTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PrinterIndependentLayoutNs.Constants
  
  /* 1 */ val DISABLED: DISABLED with scala.Double = js.native
  /* 3 */ val HIGH_RESOLUTION: HIGH_RESOLUTION with scala.Double = js.native
  /* 2 */ val LOW_RESOLUTION: LOW_RESOLUTION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.PrinterIndependentLayoutNs.Constants with scala.Double
  ] = js.native
}


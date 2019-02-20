package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.KeepTogetherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.report.KeepTogether.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NO
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.KeepTogetherNs.Constants
  
  @js.native
  sealed trait WHOLE_GROUP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.KeepTogetherNs.Constants
  
  @js.native
  sealed trait WITH_FIRST_DETAIL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.KeepTogetherNs.Constants
  
  /* 0 */ val NO: NO with scala.Double = js.native
  /* 1 */ val WHOLE_GROUP: WHOLE_GROUP with scala.Double = js.native
  /* 2 */ val WITH_FIRST_DETAIL: WITH_FIRST_DETAIL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.reportNs.KeepTogetherNs.Constants with scala.Double
  ] = js.native
}


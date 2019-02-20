package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DeferrabilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.Deferrability.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait INITIALLY_DEFERRED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DeferrabilityNs.Constants
  
  @js.native
  sealed trait INITIALLY_IMMEDIATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DeferrabilityNs.Constants
  
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DeferrabilityNs.Constants
  
  /* 5 */ val INITIALLY_DEFERRED: INITIALLY_DEFERRED with scala.Double = js.native
  /* 6 */ val INITIALLY_IMMEDIATE: INITIALLY_IMMEDIATE with scala.Double = js.native
  /* 7 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.DeferrabilityNs.Constants with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ProcedureResultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ProcedureResult.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ProcedureResultNs.Constants
  
  @js.native
  sealed trait RETURN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ProcedureResultNs.Constants
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ProcedureResultNs.Constants
  
  /* 1 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val RETURN: RETURN with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ProcedureResultNs.Constants with scala.Double
  ] = js.native
}


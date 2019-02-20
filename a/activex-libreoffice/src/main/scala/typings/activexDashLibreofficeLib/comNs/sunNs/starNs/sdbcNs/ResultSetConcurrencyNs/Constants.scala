package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetConcurrencyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.ResultSetConcurrency.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait READ_ONLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetConcurrencyNs.Constants
  
  @js.native
  sealed trait UPDATABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetConcurrencyNs.Constants
  
  /* 1007 */ val READ_ONLY: READ_ONLY with scala.Double = js.native
  /* 1008 */ val UPDATABLE: UPDATABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.ResultSetConcurrencyNs.Constants with scala.Double
  ] = js.native
}


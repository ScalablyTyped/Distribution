package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.TransactionIsolation.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait NONE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants
  
  @js.native
  sealed trait READ_COMMITTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants
  
  @js.native
  sealed trait READ_UNCOMMITTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants
  
  @js.native
  sealed trait REPEATABLE_READ
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants
  
  @js.native
  sealed trait SERIALIZABLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants
  
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val READ_COMMITTED: READ_COMMITTED with scala.Double = js.native
  /* 1 */ val READ_UNCOMMITTED: READ_UNCOMMITTED with scala.Double = js.native
  /* 4 */ val REPEATABLE_READ: REPEATABLE_READ with scala.Double = js.native
  /* 8 */ val SERIALIZABLE: SERIALIZABLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.TransactionIsolationNs.Constants with scala.Double
  ] = js.native
}


package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowScopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.sdbc.BestRowScope.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait SESSION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowScopeNs.Constants
  
  @js.native
  sealed trait TEMPORARY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowScopeNs.Constants
  
  @js.native
  sealed trait TRANSACTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowScopeNs.Constants
  
  /* 2 */ val SESSION: SESSION with scala.Double = js.native
  /* 0 */ val TEMPORARY: TEMPORARY with scala.Double = js.native
  /* 1 */ val TRANSACTION: TRANSACTION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.BestRowScopeNs.Constants with scala.Double
  ] = js.native
}


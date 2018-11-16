package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IdleEnum extends js.Object

@JSGlobal("DAO.IdleEnum")
@js.native
object IdleEnum extends js.Object {
  @js.native
  sealed trait dbFreeLocks
    extends activexDashDaoLib.DAONs.IdleEnum
  
  @js.native
  sealed trait dbRefreshCache
    extends activexDashDaoLib.DAONs.IdleEnum
  
  /* 1 */ val dbFreeLocks: dbFreeLocks with scala.Double = js.native
  /* 8 */ val dbRefreshCache: dbRefreshCache with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.IdleEnum with scala.Double] = js.native
}


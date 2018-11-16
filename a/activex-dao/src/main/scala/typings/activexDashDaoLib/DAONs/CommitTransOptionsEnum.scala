package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommitTransOptionsEnum extends js.Object

@JSGlobal("DAO.CommitTransOptionsEnum")
@js.native
object CommitTransOptionsEnum extends js.Object {
  @js.native
  sealed trait dbForceOSFlush
    extends activexDashDaoLib.DAONs.CommitTransOptionsEnum
  
  /* 1 */ val dbForceOSFlush: dbForceOSFlush with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.CommitTransOptionsEnum with scala.Double] = js.native
}


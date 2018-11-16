package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryDefStateEnum extends js.Object

@JSGlobal("DAO.QueryDefStateEnum")
@js.native
object QueryDefStateEnum extends js.Object {
  @js.native
  sealed trait dbQPrepare
    extends activexDashDaoLib.DAONs.QueryDefStateEnum
  
  @js.native
  sealed trait dbQUnprepare
    extends activexDashDaoLib.DAONs.QueryDefStateEnum
  
  /* 1 */ val dbQPrepare: dbQPrepare with scala.Double = js.native
  /* 2 */ val dbQUnprepare: dbQUnprepare with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.QueryDefStateEnum with scala.Double] = js.native
}


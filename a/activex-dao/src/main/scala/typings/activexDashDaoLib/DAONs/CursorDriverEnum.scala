package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CursorDriverEnum extends js.Object

@JSGlobal("DAO.CursorDriverEnum")
@js.native
object CursorDriverEnum extends js.Object {
  @js.native
  sealed trait dbUseClientBatchCursor
    extends activexDashDaoLib.DAONs.CursorDriverEnum
  
  @js.native
  sealed trait dbUseDefaultCursor
    extends activexDashDaoLib.DAONs.CursorDriverEnum
  
  @js.native
  sealed trait dbUseNoCursor
    extends activexDashDaoLib.DAONs.CursorDriverEnum
  
  @js.native
  sealed trait dbUseODBCCursor
    extends activexDashDaoLib.DAONs.CursorDriverEnum
  
  @js.native
  sealed trait dbUseServerCursor
    extends activexDashDaoLib.DAONs.CursorDriverEnum
  
  /* 3 */ val dbUseClientBatchCursor: dbUseClientBatchCursor with scala.Double = js.native
  /* -1 */ val dbUseDefaultCursor: dbUseDefaultCursor with scala.Double = js.native
  /* 4 */ val dbUseNoCursor: dbUseNoCursor with scala.Double = js.native
  /* 1 */ val dbUseODBCCursor: dbUseODBCCursor with scala.Double = js.native
  /* 2 */ val dbUseServerCursor: dbUseServerCursor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.CursorDriverEnum with scala.Double] = js.native
}


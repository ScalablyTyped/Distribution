package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateTypeEnum extends js.Object

@JSGlobal("DAO.UpdateTypeEnum")
@js.native
object UpdateTypeEnum extends js.Object {
  @js.native
  sealed trait dbUpdateBatch
    extends activexDashDaoLib.DAONs.UpdateTypeEnum
  
  @js.native
  sealed trait dbUpdateCurrentRecord
    extends activexDashDaoLib.DAONs.UpdateTypeEnum
  
  @js.native
  sealed trait dbUpdateRegular
    extends activexDashDaoLib.DAONs.UpdateTypeEnum
  
  /* 4 */ val dbUpdateBatch: dbUpdateBatch with scala.Double = js.native
  /* 2 */ val dbUpdateCurrentRecord: dbUpdateCurrentRecord with scala.Double = js.native
  /* 1 */ val dbUpdateRegular: dbUpdateRegular with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.UpdateTypeEnum with scala.Double] = js.native
}


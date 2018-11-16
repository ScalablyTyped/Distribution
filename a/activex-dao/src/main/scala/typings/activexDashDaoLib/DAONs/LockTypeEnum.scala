package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockTypeEnum extends js.Object

@JSGlobal("DAO.LockTypeEnum")
@js.native
object LockTypeEnum extends js.Object {
  @js.native
  sealed trait dbOptimistic
    extends activexDashDaoLib.DAONs.LockTypeEnum
  
  @js.native
  sealed trait dbOptimisticBatch
    extends activexDashDaoLib.DAONs.LockTypeEnum
  
  @js.native
  sealed trait dbOptimisticValue
    extends activexDashDaoLib.DAONs.LockTypeEnum
  
  @js.native
  sealed trait dbPessimistic
    extends activexDashDaoLib.DAONs.LockTypeEnum
  
  /* 3 */ val dbOptimistic: dbOptimistic with scala.Double = js.native
  /* 5 */ val dbOptimisticBatch: dbOptimisticBatch with scala.Double = js.native
  /* 1 */ val dbOptimisticValue: dbOptimisticValue with scala.Double = js.native
  /* 2 */ val dbPessimistic: dbPessimistic with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.LockTypeEnum with scala.Double] = js.native
}


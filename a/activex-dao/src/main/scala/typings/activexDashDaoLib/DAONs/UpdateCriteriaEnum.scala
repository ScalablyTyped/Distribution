package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UpdateCriteriaEnum extends js.Object

@JSGlobal("DAO.UpdateCriteriaEnum")
@js.native
object UpdateCriteriaEnum extends js.Object {
  @js.native
  sealed trait dbCriteriaAllCols
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  @js.native
  sealed trait dbCriteriaDeleteInsert
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  @js.native
  sealed trait dbCriteriaKey
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  @js.native
  sealed trait dbCriteriaModValues
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  @js.native
  sealed trait dbCriteriaTimestamp
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  @js.native
  sealed trait dbCriteriaUpdate
    extends activexDashDaoLib.DAONs.UpdateCriteriaEnum
  
  /* 4 */ val dbCriteriaAllCols: dbCriteriaAllCols with scala.Double = js.native
  /* 16 */ val dbCriteriaDeleteInsert: dbCriteriaDeleteInsert with scala.Double = js.native
  /* 1 */ val dbCriteriaKey: dbCriteriaKey with scala.Double = js.native
  /* 2 */ val dbCriteriaModValues: dbCriteriaModValues with scala.Double = js.native
  /* 8 */ val dbCriteriaTimestamp: dbCriteriaTimestamp with scala.Double = js.native
  /* 32 */ val dbCriteriaUpdate: dbCriteriaUpdate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.UpdateCriteriaEnum with scala.Double] = js.native
}


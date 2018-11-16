package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QueryDefTypeEnum extends js.Object

@JSGlobal("DAO.QueryDefTypeEnum")
@js.native
object QueryDefTypeEnum extends js.Object {
  @js.native
  sealed trait dbQAction
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQAppend
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQCompound
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQCrosstab
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQDDL
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQDelete
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQMakeTable
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQProcedure
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQSPTBulk
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQSQLPassThrough
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQSelect
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQSetOperation
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  @js.native
  sealed trait dbQUpdate
    extends activexDashDaoLib.DAONs.QueryDefTypeEnum
  
  /* 240 */ val dbQAction: dbQAction with scala.Double = js.native
  /* 64 */ val dbQAppend: dbQAppend with scala.Double = js.native
  /* 160 */ val dbQCompound: dbQCompound with scala.Double = js.native
  /* 16 */ val dbQCrosstab: dbQCrosstab with scala.Double = js.native
  /* 96 */ val dbQDDL: dbQDDL with scala.Double = js.native
  /* 32 */ val dbQDelete: dbQDelete with scala.Double = js.native
  /* 80 */ val dbQMakeTable: dbQMakeTable with scala.Double = js.native
  /* 224 */ val dbQProcedure: dbQProcedure with scala.Double = js.native
  /* 144 */ val dbQSPTBulk: dbQSPTBulk with scala.Double = js.native
  /* 112 */ val dbQSQLPassThrough: dbQSQLPassThrough with scala.Double = js.native
  /* 0 */ val dbQSelect: dbQSelect with scala.Double = js.native
  /* 128 */ val dbQSetOperation: dbQSetOperation with scala.Double = js.native
  /* 48 */ val dbQUpdate: dbQUpdate with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.QueryDefTypeEnum with scala.Double] = js.native
}


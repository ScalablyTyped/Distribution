package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionEnum extends js.Object

@JSGlobal("DAO.PermissionEnum")
@js.native
object PermissionEnum extends js.Object {
  @js.native
  sealed trait dbSecCreate
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDBAdmin
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDBCreate
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDBExclusive
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDBOpen
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDelete
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecDeleteData
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecFullAccess
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecInsertData
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecNoAccess
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecReadDef
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecReadSec
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecReplaceData
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecRetrieveData
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecWriteDef
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecWriteOwner
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  @js.native
  sealed trait dbSecWriteSec
    extends activexDashDaoLib.DAONs.PermissionEnum
  
  /* 1 */ val dbSecCreate: dbSecCreate with scala.Double = js.native
  /* 8 */ val dbSecDBAdmin: dbSecDBAdmin with scala.Double = js.native
  /* 1 */ val dbSecDBCreate: dbSecDBCreate with scala.Double = js.native
  /* 4 */ val dbSecDBExclusive: dbSecDBExclusive with scala.Double = js.native
  /* 2 */ val dbSecDBOpen: dbSecDBOpen with scala.Double = js.native
  /* 65536 */ val dbSecDelete: dbSecDelete with scala.Double = js.native
  /* 128 */ val dbSecDeleteData: dbSecDeleteData with scala.Double = js.native
  /* 1048575 */ val dbSecFullAccess: dbSecFullAccess with scala.Double = js.native
  /* 32 */ val dbSecInsertData: dbSecInsertData with scala.Double = js.native
  /* 0 */ val dbSecNoAccess: dbSecNoAccess with scala.Double = js.native
  /* 4 */ val dbSecReadDef: dbSecReadDef with scala.Double = js.native
  /* 131072 */ val dbSecReadSec: dbSecReadSec with scala.Double = js.native
  /* 64 */ val dbSecReplaceData: dbSecReplaceData with scala.Double = js.native
  /* 20 */ val dbSecRetrieveData: dbSecRetrieveData with scala.Double = js.native
  /* 65548 */ val dbSecWriteDef: dbSecWriteDef with scala.Double = js.native
  /* 524288 */ val dbSecWriteOwner: dbSecWriteOwner with scala.Double = js.native
  /* 262144 */ val dbSecWriteSec: dbSecWriteSec with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.PermissionEnum with scala.Double] = js.native
}


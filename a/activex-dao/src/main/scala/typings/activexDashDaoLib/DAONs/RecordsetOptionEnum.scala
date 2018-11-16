package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordsetOptionEnum extends js.Object

@JSGlobal("DAO.RecordsetOptionEnum")
@js.native
object RecordsetOptionEnum extends js.Object {
  @js.native
  sealed trait dbAppendOnly
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbConsistent
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbDenyRead
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbDenyWrite
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbExecDirect
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbFailOnError
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbForwardOnly
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbInconsistent
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbReadOnly
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbRunAsync
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbSQLPassThrough
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  @js.native
  sealed trait dbSeeChanges
    extends activexDashDaoLib.DAONs.RecordsetOptionEnum
  
  /* 8 */ val dbAppendOnly: dbAppendOnly with scala.Double = js.native
  /* 32 */ val dbConsistent: dbConsistent with scala.Double = js.native
  /* 2 */ val dbDenyRead: dbDenyRead with scala.Double = js.native
  /* 1 */ val dbDenyWrite: dbDenyWrite with scala.Double = js.native
  /* 2048 */ val dbExecDirect: dbExecDirect with scala.Double = js.native
  /* 128 */ val dbFailOnError: dbFailOnError with scala.Double = js.native
  /* 256 */ val dbForwardOnly: dbForwardOnly with scala.Double = js.native
  /* 16 */ val dbInconsistent: dbInconsistent with scala.Double = js.native
  /* 4 */ val dbReadOnly: dbReadOnly with scala.Double = js.native
  /* 1024 */ val dbRunAsync: dbRunAsync with scala.Double = js.native
  /* 64 */ val dbSQLPassThrough: dbSQLPassThrough with scala.Double = js.native
  /* 512 */ val dbSeeChanges: dbSeeChanges with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.RecordsetOptionEnum with scala.Double] = js.native
}


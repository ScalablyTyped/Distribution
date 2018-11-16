package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordStatusEnum extends js.Object

@JSGlobal("DAO.RecordStatusEnum")
@js.native
object RecordStatusEnum extends js.Object {
  @js.native
  sealed trait dbRecordDBDeleted
    extends activexDashDaoLib.DAONs.RecordStatusEnum
  
  @js.native
  sealed trait dbRecordDeleted
    extends activexDashDaoLib.DAONs.RecordStatusEnum
  
  @js.native
  sealed trait dbRecordModified
    extends activexDashDaoLib.DAONs.RecordStatusEnum
  
  @js.native
  sealed trait dbRecordNew
    extends activexDashDaoLib.DAONs.RecordStatusEnum
  
  @js.native
  sealed trait dbRecordUnmodified
    extends activexDashDaoLib.DAONs.RecordStatusEnum
  
  /* 4 */ val dbRecordDBDeleted: dbRecordDBDeleted with scala.Double = js.native
  /* 3 */ val dbRecordDeleted: dbRecordDeleted with scala.Double = js.native
  /* 1 */ val dbRecordModified: dbRecordModified with scala.Double = js.native
  /* 2 */ val dbRecordNew: dbRecordNew with scala.Double = js.native
  /* 0 */ val dbRecordUnmodified: dbRecordUnmodified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.RecordStatusEnum with scala.Double] = js.native
}


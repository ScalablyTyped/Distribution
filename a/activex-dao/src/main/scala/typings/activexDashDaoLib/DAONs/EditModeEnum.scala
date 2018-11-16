package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EditModeEnum extends js.Object

@JSGlobal("DAO.EditModeEnum")
@js.native
object EditModeEnum extends js.Object {
  @js.native
  sealed trait dbEditAdd
    extends activexDashDaoLib.DAONs.EditModeEnum
  
  @js.native
  sealed trait dbEditInProgress
    extends activexDashDaoLib.DAONs.EditModeEnum
  
  @js.native
  sealed trait dbEditNone
    extends activexDashDaoLib.DAONs.EditModeEnum
  
  /* 2 */ val dbEditAdd: dbEditAdd with scala.Double = js.native
  /* 1 */ val dbEditInProgress: dbEditInProgress with scala.Double = js.native
  /* 0 */ val dbEditNone: dbEditNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.EditModeEnum with scala.Double] = js.native
}


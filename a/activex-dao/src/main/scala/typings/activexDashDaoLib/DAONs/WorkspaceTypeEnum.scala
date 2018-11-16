package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkspaceTypeEnum extends js.Object

@JSGlobal("DAO.WorkspaceTypeEnum")
@js.native
object WorkspaceTypeEnum extends js.Object {
  @js.native
  sealed trait dbUseJet
    extends activexDashDaoLib.DAONs.WorkspaceTypeEnum
  
  @js.native
  sealed trait dbUseODBC
    extends activexDashDaoLib.DAONs.WorkspaceTypeEnum
  
  /* 2 */ val dbUseJet: dbUseJet with scala.Double = js.native
  /* 1 */ val dbUseODBC: dbUseODBC with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.WorkspaceTypeEnum with scala.Double] = js.native
}


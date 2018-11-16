package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReplicaTypeEnum extends js.Object

@JSGlobal("DAO.ReplicaTypeEnum")
@js.native
object ReplicaTypeEnum extends js.Object {
  @js.native
  sealed trait dbRepMakePartial
    extends activexDashDaoLib.DAONs.ReplicaTypeEnum
  
  @js.native
  sealed trait dbRepMakeReadOnly
    extends activexDashDaoLib.DAONs.ReplicaTypeEnum
  
  /* 1 */ val dbRepMakePartial: dbRepMakePartial with scala.Double = js.native
  /* 2 */ val dbRepMakeReadOnly: dbRepMakeReadOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.ReplicaTypeEnum with scala.Double] = js.native
}


package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SynchronizeTypeEnum extends js.Object

@JSGlobal("DAO.SynchronizeTypeEnum")
@js.native
object SynchronizeTypeEnum extends js.Object {
  @js.native
  sealed trait dbRepExportChanges
    extends activexDashDaoLib.DAONs.SynchronizeTypeEnum
  
  @js.native
  sealed trait dbRepImpExpChanges
    extends activexDashDaoLib.DAONs.SynchronizeTypeEnum
  
  @js.native
  sealed trait dbRepImportChanges
    extends activexDashDaoLib.DAONs.SynchronizeTypeEnum
  
  @js.native
  sealed trait dbRepSyncInternet
    extends activexDashDaoLib.DAONs.SynchronizeTypeEnum
  
  /* 1 */ val dbRepExportChanges: dbRepExportChanges with scala.Double = js.native
  /* 4 */ val dbRepImpExpChanges: dbRepImpExpChanges with scala.Double = js.native
  /* 2 */ val dbRepImportChanges: dbRepImportChanges with scala.Double = js.native
  /* 16 */ val dbRepSyncInternet: dbRepSyncInternet with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.SynchronizeTypeEnum with scala.Double] = js.native
}


package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecordsetTypeEnum extends js.Object

@JSGlobal("DAO.RecordsetTypeEnum")
@js.native
object RecordsetTypeEnum extends js.Object {
  @js.native
  sealed trait dbOpenDynamic
    extends activexDashDaoLib.DAONs.RecordsetTypeEnum
  
  @js.native
  sealed trait dbOpenDynaset
    extends activexDashDaoLib.DAONs.RecordsetTypeEnum
  
  @js.native
  sealed trait dbOpenForwardOnly
    extends activexDashDaoLib.DAONs.RecordsetTypeEnum
  
  @js.native
  sealed trait dbOpenSnapshot
    extends activexDashDaoLib.DAONs.RecordsetTypeEnum
  
  @js.native
  sealed trait dbOpenTable
    extends activexDashDaoLib.DAONs.RecordsetTypeEnum
  
  /* 16 */ val dbOpenDynamic: dbOpenDynamic with scala.Double = js.native
  /* 2 */ val dbOpenDynaset: dbOpenDynaset with scala.Double = js.native
  /* 8 */ val dbOpenForwardOnly: dbOpenForwardOnly with scala.Double = js.native
  /* 4 */ val dbOpenSnapshot: dbOpenSnapshot with scala.Double = js.native
  /* 1 */ val dbOpenTable: dbOpenTable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.RecordsetTypeEnum with scala.Double] = js.native
}


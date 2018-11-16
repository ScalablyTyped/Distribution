package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ISAMStatsEnum extends js.Object

@JSGlobal("DAO.ISAMStatsEnum")
@js.native
object ISAMStatsEnum extends js.Object {
  @js.native
  sealed trait DiskReads
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  @js.native
  sealed trait DiskWrites
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  @js.native
  sealed trait LocksPlaced
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  @js.native
  sealed trait LocksReleased
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  @js.native
  sealed trait ReadsFromCache
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  @js.native
  sealed trait ReadsFromReadAheadCache
    extends activexDashDaoLib.DAONs.ISAMStatsEnum
  
  /* 0 */ val DiskReads: DiskReads with scala.Double = js.native
  /* 1 */ val DiskWrites: DiskWrites with scala.Double = js.native
  /* 4 */ val LocksPlaced: LocksPlaced with scala.Double = js.native
  /* 5 */ val LocksReleased: LocksReleased with scala.Double = js.native
  /* 2 */ val ReadsFromCache: ReadsFromCache with scala.Double = js.native
  /* 3 */ val ReadsFromReadAheadCache: ReadsFromReadAheadCache with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashDaoLib.DAONs.ISAMStatsEnum with scala.Double] = js.native
}


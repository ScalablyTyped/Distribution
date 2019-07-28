package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`0`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`3`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import typings.activexDashDao.activexDashDaoNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`0`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`4`
  - typings.activexDashDao.activexDashDaoNumbers.`5`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`3`
*/
trait ISAMStatsEnum extends js.Object

object ISAMStatsEnum {
  @scala.inline
  def DiskReads: `0` = this.cast(0)
  @scala.inline
  def DiskWrites: `1` = this.cast(1)
  @scala.inline
  def LocksPlaced: `4` = this.cast(4)
  @scala.inline
  def LocksReleased: `5` = this.cast(5)
  @scala.inline
  def ReadsFromCache: `2` = this.cast(2)
  @scala.inline
  def ReadsFromReadAheadCache: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


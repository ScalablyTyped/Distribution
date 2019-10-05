package typings.activexDashDao.DAO

import typings.activexDashDao.activexDashDaoNumbers.`0`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`3`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`4`
  - typings.activexDashDao.activexDashDaoNumbers.`3`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`0`
*/
trait RecordStatusEnum extends js.Object

object RecordStatusEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbRecordDBDeleted: `4` = this.cast(4)
  @scala.inline
  def dbRecordDeleted: `3` = this.cast(3)
  @scala.inline
  def dbRecordModified: `1` = this.cast(1)
  @scala.inline
  def dbRecordNew: `2` = this.cast(2)
  @scala.inline
  def dbRecordUnmodified: `0` = this.cast(0)
}


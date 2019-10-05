package typings.activexDashDao.DAO

import typings.activexDashDao.activexDashDaoNumbers.`16`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import typings.activexDashDao.activexDashDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`16`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`8`
  - typings.activexDashDao.activexDashDaoNumbers.`4`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
*/
trait RecordsetTypeEnum extends js.Object

object RecordsetTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbOpenDynamic: `16` = this.cast(16)
  @scala.inline
  def dbOpenDynaset: `2` = this.cast(2)
  @scala.inline
  def dbOpenForwardOnly: `8` = this.cast(8)
  @scala.inline
  def dbOpenSnapshot: `4` = this.cast(4)
  @scala.inline
  def dbOpenTable: `1` = this.cast(1)
}


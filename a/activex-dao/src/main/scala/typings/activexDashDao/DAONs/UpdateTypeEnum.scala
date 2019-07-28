package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`4`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
*/
trait UpdateTypeEnum extends js.Object

object UpdateTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbUpdateBatch: `4` = this.cast(4)
  @scala.inline
  def dbUpdateCurrentRecord: `2` = this.cast(2)
  @scala.inline
  def dbUpdateRegular: `1` = this.cast(1)
}


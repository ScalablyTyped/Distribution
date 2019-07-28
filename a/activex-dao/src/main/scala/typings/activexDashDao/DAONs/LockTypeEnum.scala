package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`3`
import typings.activexDashDao.activexDashDaoNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`3`
  - typings.activexDashDao.activexDashDaoNumbers.`5`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
*/
trait LockTypeEnum extends js.Object

object LockTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbOptimistic: `3` = this.cast(3)
  @scala.inline
  def dbOptimisticBatch: `5` = this.cast(5)
  @scala.inline
  def dbOptimisticValue: `1` = this.cast(1)
  @scala.inline
  def dbPessimistic: `2` = this.cast(2)
}


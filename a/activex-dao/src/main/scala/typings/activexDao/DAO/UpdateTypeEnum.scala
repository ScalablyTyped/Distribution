package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`2`
import typings.activexDao.activexDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`1`
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


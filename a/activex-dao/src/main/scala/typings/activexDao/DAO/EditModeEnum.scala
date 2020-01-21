package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`0`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`0`
*/
trait EditModeEnum extends js.Object

object EditModeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbEditAdd: `2` = this.cast(2)
  @scala.inline
  def dbEditInProgress: `1` = this.cast(1)
  @scala.inline
  def dbEditNone: `0` = this.cast(0)
}


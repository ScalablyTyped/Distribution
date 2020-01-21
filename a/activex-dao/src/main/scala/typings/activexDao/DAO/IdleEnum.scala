package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`8`
*/
trait IdleEnum extends js.Object

object IdleEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbFreeLocks: `1` = this.cast(1)
  @scala.inline
  def dbRefreshCache: `8` = this.cast(8)
}


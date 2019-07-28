package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`3`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`3`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`4`
*/
trait ParameterDirectionEnum extends js.Object

object ParameterDirectionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbParamInput: `1` = this.cast(1)
  @scala.inline
  def dbParamInputOutput: `3` = this.cast(3)
  @scala.inline
  def dbParamOutput: `2` = this.cast(2)
  @scala.inline
  def dbParamReturnValue: `4` = this.cast(4)
}


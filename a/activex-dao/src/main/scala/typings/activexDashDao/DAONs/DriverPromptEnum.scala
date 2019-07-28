package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`0`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`0`
  - typings.activexDashDao.activexDashDaoNumbers.`3`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
*/
trait DriverPromptEnum extends js.Object

object DriverPromptEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbDriverComplete: `0` = this.cast(0)
  @scala.inline
  def dbDriverCompleteRequired: `3` = this.cast(3)
  @scala.inline
  def dbDriverNoPrompt: `1` = this.cast(1)
  @scala.inline
  def dbDriverPrompt: `2` = this.cast(2)
}


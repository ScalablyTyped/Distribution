package typings.activexDashDao.DAO

import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
*/
trait ReplicaTypeEnum extends js.Object

object ReplicaTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbRepMakePartial: `1` = this.cast(1)
  @scala.inline
  def dbRepMakeReadOnly: `2` = this.cast(2)
}


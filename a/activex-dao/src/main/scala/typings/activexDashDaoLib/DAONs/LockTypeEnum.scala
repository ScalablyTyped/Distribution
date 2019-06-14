package typings
package activexDashDaoLib.DAONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashDaoLib.activexDashDaoLibNumbers.`3`
  - activexDashDaoLib.activexDashDaoLibNumbers.`5`
  - activexDashDaoLib.activexDashDaoLibNumbers.`1`
  - activexDashDaoLib.activexDashDaoLibNumbers.`2`
*/
trait LockTypeEnum extends js.Object

object LockTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbOptimistic: activexDashDaoLib.activexDashDaoLibNumbers.`3` = this.cast(3)
  @scala.inline
  def dbOptimisticBatch: activexDashDaoLib.activexDashDaoLibNumbers.`5` = this.cast(5)
  @scala.inline
  def dbOptimisticValue: activexDashDaoLib.activexDashDaoLibNumbers.`1` = this.cast(1)
  @scala.inline
  def dbPessimistic: activexDashDaoLib.activexDashDaoLibNumbers.`2` = this.cast(2)
}


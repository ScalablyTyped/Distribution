package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`16`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`2`
import typings.activexDao.activexDaoNumbers.`4`
import typings.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`16`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`8`
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`1`
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


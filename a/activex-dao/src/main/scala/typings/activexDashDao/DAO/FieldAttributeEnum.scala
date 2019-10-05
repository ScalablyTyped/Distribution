package typings.activexDashDao.DAO

import typings.activexDashDao.activexDashDaoNumbers.`16`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`32768`
import typings.activexDashDao.activexDashDaoNumbers.`32`
import typings.activexDashDao.activexDashDaoNumbers.`8192`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`16`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`32768`
  - typings.activexDashDao.activexDashDaoNumbers.`8192`
  - typings.activexDashDao.activexDashDaoNumbers.`32`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
*/
trait FieldAttributeEnum extends js.Object

object FieldAttributeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbAutoIncrField: `16` = this.cast(16)
  @scala.inline
  def dbDescending: `1` = this.cast(1)
  @scala.inline
  def dbFixedField: `1` = this.cast(1)
  @scala.inline
  def dbHyperlinkField: `32768` = this.cast(32768)
  @scala.inline
  def dbSystemField: `8192` = this.cast(8192)
  @scala.inline
  def dbUpdatableField: `32` = this.cast(32)
  @scala.inline
  def dbVariableField: `2` = this.cast(2)
}


package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`128`
import typings.activexDao.activexDaoNumbers.`16`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`256`
import typings.activexDao.activexDaoNumbers.`2`
import typings.activexDao.activexDaoNumbers.`32`
import typings.activexDao.activexDaoNumbers.`4`
import typings.activexDao.activexDaoNumbers.`512`
import typings.activexDao.activexDaoNumbers.`64`
import typings.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`8`
  - typings.activexDao.activexDaoNumbers.`128`
  - typings.activexDao.activexDaoNumbers.`256`
  - typings.activexDao.activexDaoNumbers.`512`
  - typings.activexDao.activexDaoNumbers.`16`
  - typings.activexDao.activexDaoNumbers.`32`
  - typings.activexDao.activexDaoNumbers.`64`
*/
trait DatabaseTypeEnum extends js.Object

object DatabaseTypeEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** @deprecated */
  @scala.inline
  def dbDecrypt: `4` = this.cast(4)
  /** @deprecated */
  @scala.inline
  def dbEncrypt: `2` = this.cast(2)
  @scala.inline
  def dbVersion10: `1` = this.cast(1)
  @scala.inline
  def dbVersion11: `8` = this.cast(8)
  @scala.inline
  def dbVersion120: `128` = this.cast(128)
  @scala.inline
  def dbVersion140: `256` = this.cast(256)
  @scala.inline
  def dbVersion150: `512` = this.cast(512)
  @scala.inline
  def dbVersion20: `16` = this.cast(16)
  @scala.inline
  def dbVersion30: `32` = this.cast(32)
  @scala.inline
  def dbVersion40: `64` = this.cast(64)
}


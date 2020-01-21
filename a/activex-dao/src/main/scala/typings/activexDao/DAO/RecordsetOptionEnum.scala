package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`1024`
import typings.activexDao.activexDaoNumbers.`128`
import typings.activexDao.activexDaoNumbers.`16`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`2048`
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
  - typings.activexDao.activexDaoNumbers.`8`
  - typings.activexDao.activexDaoNumbers.`32`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`2048`
  - typings.activexDao.activexDaoNumbers.`128`
  - typings.activexDao.activexDaoNumbers.`256`
  - typings.activexDao.activexDaoNumbers.`16`
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`1024`
  - typings.activexDao.activexDaoNumbers.`512`
  - typings.activexDao.activexDaoNumbers.`64`
*/
trait RecordsetOptionEnum extends js.Object

object RecordsetOptionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbAppendOnly: `8` = this.cast(8)
  @scala.inline
  def dbConsistent: `32` = this.cast(32)
  @scala.inline
  def dbDenyRead: `2` = this.cast(2)
  @scala.inline
  def dbDenyWrite: `1` = this.cast(1)
  @scala.inline
  def dbExecDirect: `2048` = this.cast(2048)
  @scala.inline
  def dbFailOnError: `128` = this.cast(128)
  @scala.inline
  def dbForwardOnly: `256` = this.cast(256)
  @scala.inline
  def dbInconsistent: `16` = this.cast(16)
  @scala.inline
  def dbReadOnly: `4` = this.cast(4)
  @scala.inline
  def dbRunAsync: `1024` = this.cast(1024)
  @scala.inline
  def dbSQLPassThrough: `64` = this.cast(64)
  @scala.inline
  def dbSeeChanges: `512` = this.cast(512)
}


package typings.activexDashDao.DAONs

import typings.activexDashDao.activexDashDaoNumbers.`1024`
import typings.activexDashDao.activexDashDaoNumbers.`128`
import typings.activexDashDao.activexDashDaoNumbers.`16`
import typings.activexDashDao.activexDashDaoNumbers.`1`
import typings.activexDashDao.activexDashDaoNumbers.`2048`
import typings.activexDashDao.activexDashDaoNumbers.`256`
import typings.activexDashDao.activexDashDaoNumbers.`2`
import typings.activexDashDao.activexDashDaoNumbers.`32`
import typings.activexDashDao.activexDashDaoNumbers.`4`
import typings.activexDashDao.activexDashDaoNumbers.`512`
import typings.activexDashDao.activexDashDaoNumbers.`64`
import typings.activexDashDao.activexDashDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashDao.activexDashDaoNumbers.`8`
  - typings.activexDashDao.activexDashDaoNumbers.`32`
  - typings.activexDashDao.activexDashDaoNumbers.`2`
  - typings.activexDashDao.activexDashDaoNumbers.`1`
  - typings.activexDashDao.activexDashDaoNumbers.`2048`
  - typings.activexDashDao.activexDashDaoNumbers.`128`
  - typings.activexDashDao.activexDashDaoNumbers.`256`
  - typings.activexDashDao.activexDashDaoNumbers.`16`
  - typings.activexDashDao.activexDashDaoNumbers.`4`
  - typings.activexDashDao.activexDashDaoNumbers.`1024`
  - typings.activexDashDao.activexDashDaoNumbers.`512`
  - typings.activexDashDao.activexDashDaoNumbers.`64`
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


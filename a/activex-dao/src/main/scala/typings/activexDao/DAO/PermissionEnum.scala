package typings.activexDao.DAO

import typings.activexDao.activexDaoNumbers.`0`
import typings.activexDao.activexDaoNumbers.`1048575`
import typings.activexDao.activexDaoNumbers.`128`
import typings.activexDao.activexDaoNumbers.`131072`
import typings.activexDao.activexDaoNumbers.`1`
import typings.activexDao.activexDaoNumbers.`20`
import typings.activexDao.activexDaoNumbers.`262144`
import typings.activexDao.activexDaoNumbers.`2`
import typings.activexDao.activexDaoNumbers.`32`
import typings.activexDao.activexDaoNumbers.`4`
import typings.activexDao.activexDaoNumbers.`524288`
import typings.activexDao.activexDaoNumbers.`64`
import typings.activexDao.activexDaoNumbers.`65536`
import typings.activexDao.activexDaoNumbers.`65548`
import typings.activexDao.activexDaoNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDao.activexDaoNumbers.`1`
  - typings.activexDao.activexDaoNumbers.`8`
  - typings.activexDao.activexDaoNumbers.`4`
  - typings.activexDao.activexDaoNumbers.`2`
  - typings.activexDao.activexDaoNumbers.`65536`
  - typings.activexDao.activexDaoNumbers.`128`
  - typings.activexDao.activexDaoNumbers.`1048575`
  - typings.activexDao.activexDaoNumbers.`32`
  - typings.activexDao.activexDaoNumbers.`0`
  - typings.activexDao.activexDaoNumbers.`131072`
  - typings.activexDao.activexDaoNumbers.`64`
  - typings.activexDao.activexDaoNumbers.`20`
  - typings.activexDao.activexDaoNumbers.`65548`
  - typings.activexDao.activexDaoNumbers.`524288`
  - typings.activexDao.activexDaoNumbers.`262144`
*/
trait PermissionEnum extends js.Object

object PermissionEnum {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dbSecCreate: `1` = this.cast(1)
  @scala.inline
  def dbSecDBAdmin: `8` = this.cast(8)
  @scala.inline
  def dbSecDBCreate: `1` = this.cast(1)
  @scala.inline
  def dbSecDBExclusive: `4` = this.cast(4)
  @scala.inline
  def dbSecDBOpen: `2` = this.cast(2)
  @scala.inline
  def dbSecDelete: `65536` = this.cast(65536)
  @scala.inline
  def dbSecDeleteData: `128` = this.cast(128)
  @scala.inline
  def dbSecFullAccess: `1048575` = this.cast(1048575)
  @scala.inline
  def dbSecInsertData: `32` = this.cast(32)
  @scala.inline
  def dbSecNoAccess: `0` = this.cast(0)
  @scala.inline
  def dbSecReadDef: `4` = this.cast(4)
  @scala.inline
  def dbSecReadSec: `131072` = this.cast(131072)
  @scala.inline
  def dbSecReplaceData: `64` = this.cast(64)
  @scala.inline
  def dbSecRetrieveData: `20` = this.cast(20)
  @scala.inline
  def dbSecWriteDef: `65548` = this.cast(65548)
  @scala.inline
  def dbSecWriteOwner: `524288` = this.cast(524288)
  @scala.inline
  def dbSecWriteSec: `262144` = this.cast(262144)
}


package typings.activexDiskquota.DiskQuotaTypeLibrary

import typings.activexDiskquota.activexDiskquotaNumbers.`0`
import typings.activexDiskquota.activexDiskquotaNumbers.`1`
import typings.activexDiskquota.activexDiskquotaNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typings.activexDiskquota.activexDiskquotaNumbers.`0`
  - typings.activexDiskquota.activexDiskquotaNumbers.`2`
  - typings.activexDiskquota.activexDiskquotaNumbers.`1`
*/
trait QuotaStateConstants extends js.Object

object QuotaStateConstants {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dqStateDisable: `0` = this.cast(0)
  @scala.inline
  def dqStateEnforce: `2` = this.cast(2)
  @scala.inline
  def dqStateTrack: `1` = this.cast(1)
}


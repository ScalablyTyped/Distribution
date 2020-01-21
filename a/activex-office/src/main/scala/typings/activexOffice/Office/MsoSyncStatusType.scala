package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import typings.activexOffice.activexOfficeNumbers.`5`
import typings.activexOffice.activexOfficeNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`4`
  - typings.activexOffice.activexOfficeNumbers.`6`
  - typings.activexOffice.activexOfficeNumbers.`1`
  - typings.activexOffice.activexOfficeNumbers.`3`
  - typings.activexOffice.activexOfficeNumbers.`2`
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`5`
*/
trait MsoSyncStatusType extends js.Object

object MsoSyncStatusType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoSyncStatusConflict: `4` = this.cast(4)
  @scala.inline
  def msoSyncStatusError: `6` = this.cast(6)
  @scala.inline
  def msoSyncStatusLatest: `1` = this.cast(1)
  @scala.inline
  def msoSyncStatusLocalChanges: `3` = this.cast(3)
  @scala.inline
  def msoSyncStatusNewerAvailable: `2` = this.cast(2)
  @scala.inline
  def msoSyncStatusNoSharedWorkspace: `0` = this.cast(0)
  @scala.inline
  def msoSyncStatusNotRoaming: `0` = this.cast(0)
  @scala.inline
  def msoSyncStatusSuspended: `5` = this.cast(5)
}


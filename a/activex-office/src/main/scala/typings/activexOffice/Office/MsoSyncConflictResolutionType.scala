package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`0`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOffice.activexOfficeNumbers.`0`
  - typings.activexOffice.activexOfficeNumbers.`2`
  - typings.activexOffice.activexOfficeNumbers.`1`
*/
trait MsoSyncConflictResolutionType extends js.Object

object MsoSyncConflictResolutionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def msoSyncConflictClientWins: `0` = this.cast(0)
  @scala.inline
  def msoSyncConflictMerge: `2` = this.cast(2)
  @scala.inline
  def msoSyncConflictServerWins: `1` = this.cast(1)
}


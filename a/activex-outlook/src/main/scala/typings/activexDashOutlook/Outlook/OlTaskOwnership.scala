package typings.activexDashOutlook.Outlook

import typings.activexDashOutlook.activexDashOutlookNumbers.`0`
import typings.activexDashOutlook.activexDashOutlookNumbers.`1`
import typings.activexDashOutlook.activexDashOutlookNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashOutlook.activexDashOutlookNumbers.`1`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`0`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`2`
*/
trait OlTaskOwnership extends js.Object

object OlTaskOwnership {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olDelegatedTask: `1` = this.cast(1)
  @scala.inline
  def olNewTask: `0` = this.cast(0)
  @scala.inline
  def olOwnTask: `2` = this.cast(2)
}


package typings.activexDashOutlook.Outlook

import typings.activexDashOutlook.activexDashOutlookNumbers.`0`
import typings.activexDashOutlook.activexDashOutlookNumbers.`1`
import typings.activexDashOutlook.activexDashOutlookNumbers.`2`
import typings.activexDashOutlook.activexDashOutlookNumbers.`3`
import typings.activexDashOutlook.activexDashOutlookNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashOutlook.activexDashOutlookNumbers.`2`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`4`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`1`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`0`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`3`
*/
trait OlTaskStatus extends js.Object

object OlTaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTaskComplete: `2` = this.cast(2)
  @scala.inline
  def olTaskDeferred: `4` = this.cast(4)
  @scala.inline
  def olTaskInProgress: `1` = this.cast(1)
  @scala.inline
  def olTaskNotStarted: `0` = this.cast(0)
  @scala.inline
  def olTaskWaiting: `3` = this.cast(3)
}


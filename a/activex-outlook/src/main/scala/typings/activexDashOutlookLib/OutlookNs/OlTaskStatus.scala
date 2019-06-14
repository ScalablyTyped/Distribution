package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashOutlookLib.activexDashOutlookLibNumbers.`2`
  - activexDashOutlookLib.activexDashOutlookLibNumbers.`4`
  - activexDashOutlookLib.activexDashOutlookLibNumbers.`1`
  - activexDashOutlookLib.activexDashOutlookLibNumbers.`0`
  - activexDashOutlookLib.activexDashOutlookLibNumbers.`3`
*/
trait OlTaskStatus extends js.Object

object OlTaskStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTaskComplete: activexDashOutlookLib.activexDashOutlookLibNumbers.`2` = this.cast(2)
  @scala.inline
  def olTaskDeferred: activexDashOutlookLib.activexDashOutlookLibNumbers.`4` = this.cast(4)
  @scala.inline
  def olTaskInProgress: activexDashOutlookLib.activexDashOutlookLibNumbers.`1` = this.cast(1)
  @scala.inline
  def olTaskNotStarted: activexDashOutlookLib.activexDashOutlookLibNumbers.`0` = this.cast(0)
  @scala.inline
  def olTaskWaiting: activexDashOutlookLib.activexDashOutlookLibNumbers.`3` = this.cast(3)
}


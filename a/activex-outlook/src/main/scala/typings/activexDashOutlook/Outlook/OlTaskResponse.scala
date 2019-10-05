package typings.activexDashOutlook.Outlook

import typings.activexDashOutlook.activexDashOutlookNumbers.`0`
import typings.activexDashOutlook.activexDashOutlookNumbers.`1`
import typings.activexDashOutlook.activexDashOutlookNumbers.`2`
import typings.activexDashOutlook.activexDashOutlookNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashOutlook.activexDashOutlookNumbers.`2`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`1`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`3`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`0`
*/
trait OlTaskResponse extends js.Object

object OlTaskResponse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olTaskAccept: `2` = this.cast(2)
  @scala.inline
  def olTaskAssign: `1` = this.cast(1)
  @scala.inline
  def olTaskDecline: `3` = this.cast(3)
  @scala.inline
  def olTaskSimple: `0` = this.cast(0)
}


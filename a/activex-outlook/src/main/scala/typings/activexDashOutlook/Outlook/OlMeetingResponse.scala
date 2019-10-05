package typings.activexDashOutlook.Outlook

import typings.activexDashOutlook.activexDashOutlookNumbers.`2`
import typings.activexDashOutlook.activexDashOutlookNumbers.`3`
import typings.activexDashOutlook.activexDashOutlookNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexDashOutlook.activexDashOutlookNumbers.`3`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`4`
  - typings.activexDashOutlook.activexDashOutlookNumbers.`2`
*/
trait OlMeetingResponse extends js.Object

object OlMeetingResponse {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olMeetingAccepted: `3` = this.cast(3)
  @scala.inline
  def olMeetingDeclined: `4` = this.cast(4)
  @scala.inline
  def olMeetingTentative: `2` = this.cast(2)
}


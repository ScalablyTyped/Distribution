package typings.activexOutlook.Outlook

import typings.activexOutlook.activexOutlookNumbers.`0`
import typings.activexOutlook.activexOutlookNumbers.`1`
import typings.activexOutlook.activexOutlookNumbers.`3`
import typings.activexOutlook.activexOutlookNumbers.`5`
import typings.activexOutlook.activexOutlookNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOutlook.activexOutlookNumbers.`1`
  - typings.activexOutlook.activexOutlookNumbers.`5`
  - typings.activexOutlook.activexOutlookNumbers.`3`
  - typings.activexOutlook.activexOutlookNumbers.`7`
  - typings.activexOutlook.activexOutlookNumbers.`0`
*/
trait OlMeetingStatus extends js.Object

object OlMeetingStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olMeeting: `1` = this.cast(1)
  @scala.inline
  def olMeetingCanceled: `5` = this.cast(5)
  @scala.inline
  def olMeetingReceived: `3` = this.cast(3)
  @scala.inline
  def olMeetingReceivedAndCanceled: `7` = this.cast(7)
  @scala.inline
  def olNonMeeting: `0` = this.cast(0)
}


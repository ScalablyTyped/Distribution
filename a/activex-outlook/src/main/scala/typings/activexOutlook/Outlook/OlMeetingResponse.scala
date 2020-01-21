package typings.activexOutlook.Outlook

import typings.activexOutlook.activexOutlookNumbers.`2`
import typings.activexOutlook.activexOutlookNumbers.`3`
import typings.activexOutlook.activexOutlookNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOutlook.activexOutlookNumbers.`3`
  - typings.activexOutlook.activexOutlookNumbers.`4`
  - typings.activexOutlook.activexOutlookNumbers.`2`
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


package typings.activexOutlook.Outlook

import typings.activexOutlook.activexOutlookNumbers.`1`
import typings.activexOutlook.activexOutlookNumbers.`4`
import typings.activexOutlook.activexOutlookNumbers.`5`
import typings.activexOutlook.activexOutlookNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOutlook.activexOutlookNumbers.`4`
  - typings.activexOutlook.activexOutlookNumbers.`1`
  - typings.activexOutlook.activexOutlookNumbers.`5`
  - typings.activexOutlook.activexOutlookNumbers.`6`
*/
trait OlAttachmentType extends js.Object

object OlAttachmentType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olByReference: `4` = this.cast(4)
  @scala.inline
  def olByValue: `1` = this.cast(1)
  @scala.inline
  def olEmbeddeditem: `5` = this.cast(5)
  @scala.inline
  def olOLE: `6` = this.cast(6)
}


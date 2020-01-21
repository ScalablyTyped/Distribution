package typings.activexOutlook.Outlook

import typings.activexOutlook.activexOutlookNumbers.`0`
import typings.activexOutlook.activexOutlookNumbers.`1`
import typings.activexOutlook.activexOutlookNumbers.`2`
import typings.activexOutlook.activexOutlookNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.activexOutlook.activexOutlookNumbers.`3`
  - typings.activexOutlook.activexOutlookNumbers.`0`
  - typings.activexOutlook.activexOutlookNumbers.`1`
  - typings.activexOutlook.activexOutlookNumbers.`2`
*/
trait OlSensitivity extends js.Object

object OlSensitivity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def olConfidential: `3` = this.cast(3)
  @scala.inline
  def olNormal: `0` = this.cast(0)
  @scala.inline
  def olPersonal: `1` = this.cast(1)
  @scala.inline
  def olPrivate: `2` = this.cast(2)
}


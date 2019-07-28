package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These are the possible values for {@link RecipientInfo.State} . */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait OutgoingMessageState extends js.Object

object OutgoingMessageState {
  /** Message has been sent upstream to all recipients. */
  @scala.inline
  def COMPLETELY_LOCALLY_SENT: `2` = this.cast(2)
  /** Recipient confirmed reading. */
  @scala.inline
  def CONFIRMED: `7` = this.cast(7)
  /** Global fatal error (e.g. last member in SMTP chain could not deliver the message). */
  @scala.inline
  def EXTERNAL_ERROR: `5` = this.cast(5)
  /** Local fatal error (e.g. first SMTP server upstream did not accept the message). */
  @scala.inline
  def NONRECOVERABLE_LOCAL_ERROR: `4` = this.cast(4)
  /** Message has been sent upstream to some recipients. */
  @scala.inline
  def PARTIALLY_LOCALLY_SENT: `1` = this.cast(1)
  /** Local, non-fatal error (e.g. network temporarily not available). */
  @scala.inline
  def RECOVERABLE_LOCAL_ERROR: `3` = this.cast(3)
  /** Message was sent; we are waiting for confirmation. */
  @scala.inline
  def WAITING_CONFIRMATION: `6` = this.cast(6)
  /** Message has just been placed into the out tray. */
  @scala.inline
  def WRITTEN: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


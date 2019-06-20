package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** These are the possible values for {@link RecipientInfo.State} . */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait OutgoingMessageState extends js.Object

object OutgoingMessageState {
  /** Message has been sent upstream to all recipients. */
  @scala.inline
  def COMPLETELY_LOCALLY_SENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** Recipient confirmed reading. */
  @scala.inline
  def CONFIRMED: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** Global fatal error (e.g. last member in SMTP chain could not deliver the message). */
  @scala.inline
  def EXTERNAL_ERROR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /** Local fatal error (e.g. first SMTP server upstream did not accept the message). */
  @scala.inline
  def NONRECOVERABLE_LOCAL_ERROR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** Message has been sent upstream to some recipients. */
  @scala.inline
  def PARTIALLY_LOCALLY_SENT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /** Local, non-fatal error (e.g. network temporarily not available). */
  @scala.inline
  def RECOVERABLE_LOCAL_ERROR: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** Message was sent; we are waiting for confirmation. */
  @scala.inline
  def WAITING_CONFIRMATION: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** Message has just been placed into the out tray. */
  @scala.inline
  def WRITTEN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


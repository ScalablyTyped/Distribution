package typings.activexDashLibreoffice.comNs.sunNs.starNs.mailNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since OOo 2.0 */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
*/
trait MailServiceType extends js.Object

object MailServiceType {
  /** A IMAP service */
  @scala.inline
  def IMAP: `2` = this.cast(2)
  /** A POP3 service */
  @scala.inline
  def POP3: `1` = this.cast(1)
  /** A SMTP service */
  @scala.inline
  def SMTP: `0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}


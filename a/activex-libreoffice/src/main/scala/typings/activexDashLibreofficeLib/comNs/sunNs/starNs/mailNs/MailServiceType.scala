package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailServiceType extends js.Object

/** @since OOo 2.0 */
@JSGlobal("com.sun.star.mail.MailServiceType")
@js.native
object MailServiceType extends js.Object {
  /** A IMAP service */
  @js.native
  sealed trait IMAP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceType
  
  /** A POP3 service */
  @js.native
  sealed trait POP3
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceType
  
  /** A SMTP service */
  @js.native
  sealed trait SMTP
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceType
  
  /* 2 */ val IMAP: IMAP with scala.Double = js.native
  /* 1 */ val POP3: POP3 with scala.Double = js.native
  /* 0 */ val SMTP: SMTP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.mailNs.MailServiceType with scala.Double
  ] = js.native
}


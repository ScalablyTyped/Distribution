package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OutgoingMessageState extends js.Object

/** These are the possible values for {@link RecipientInfo.State} . */
@JSGlobal("com.sun.star.ucb.OutgoingMessageState")
@js.native
object OutgoingMessageState extends js.Object {
  /** Message has been sent upstream to all recipients. */
  @js.native
  sealed trait COMPLETELY_LOCALLY_SENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Recipient confirmed reading. */
  @js.native
  sealed trait CONFIRMED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Global fatal error (e.g. last member in SMTP chain could not deliver the message). */
  @js.native
  sealed trait EXTERNAL_ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Local fatal error (e.g. first SMTP server upstream did not accept the message). */
  @js.native
  sealed trait NONRECOVERABLE_LOCAL_ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Message has been sent upstream to some recipients. */
  @js.native
  sealed trait PARTIALLY_LOCALLY_SENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Local, non-fatal error (e.g. network temporarily not available). */
  @js.native
  sealed trait RECOVERABLE_LOCAL_ERROR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Message was sent; we are waiting for confirmation. */
  @js.native
  sealed trait WAITING_CONFIRMATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /** Message has just been placed into the out tray. */
  @js.native
  sealed trait WRITTEN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState
  
  /* 2 */ val COMPLETELY_LOCALLY_SENT: COMPLETELY_LOCALLY_SENT with scala.Double = js.native
  /* 7 */ val CONFIRMED: CONFIRMED with scala.Double = js.native
  /* 5 */ val EXTERNAL_ERROR: EXTERNAL_ERROR with scala.Double = js.native
  /* 4 */ val NONRECOVERABLE_LOCAL_ERROR: NONRECOVERABLE_LOCAL_ERROR with scala.Double = js.native
  /* 1 */ val PARTIALLY_LOCALLY_SENT: PARTIALLY_LOCALLY_SENT with scala.Double = js.native
  /* 3 */ val RECOVERABLE_LOCAL_ERROR: RECOVERABLE_LOCAL_ERROR with scala.Double = js.native
  /* 6 */ val WAITING_CONFIRMATION: WAITING_CONFIRMATION with scala.Double = js.native
  /* 0 */ val WRITTEN: WRITTEN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs.OutgoingMessageState with scala.Double
  ] = js.native
}


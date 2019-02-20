package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction request handler that lets the user handle a number of well known requests via GUI dialogs.
  *
  * The well known requests handled by this service include MergeRecoveryRequest* The requests marked with an asterisk are only handled if (a) their
  * continuations match certain restrictions (see below), and (b) the necessary resource strings are available (this can be exploited by applications that
  * carry only a subset of all resource files with them).
  *
  * The continuation restrictions are as follows: Let **C** be the subset of the provided continuations that are of type {@link
  * com.sun.star.task.XInteractionApprove} , {@link com.sun.star.task.XInteractionDisapprove} , {@link com.sun.star.task.XInteractionRetry} , or {@link
  * com.sun.star.task.XInteractionAbort} (or of a derived type). All other continuations are ignored for these requests. The request is only handled if
  * the set **C** is any of the following: AbortRetry, AbortApproveApprove, AbortApprove, DisapproveApprove, Disapprove, Abort
  * @see com.sun.star.task.InteractionHandler
  * @since OOo 2.0
  */
trait InteractionHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization


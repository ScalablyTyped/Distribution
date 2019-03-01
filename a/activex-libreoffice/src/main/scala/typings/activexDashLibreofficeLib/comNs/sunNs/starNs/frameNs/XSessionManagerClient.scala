package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Connect to a session manager to get information about pending desktop shutdown */
trait XSessionManagerClient
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * addSessionManagerListener registers a listener for session management events
    * @param xListener listener for session management events
    * @see XSessionManagerListener
    * @see XSessionManagerClient.removeSessionManagerListener()
    */
  def addSessionManagerListener(xListener: XSessionManagerListener): scala.Unit
  /**
    * Call cancelShutdown to try to cancel a desktop shutdown in progress
    * @returns `TRUE` if shutdown was canceled, `FALSE` else.
    */
  def cancelShutdown(): scala.Boolean
  /**
    * interactionDone is called when a listener has finished user interaction
    * @param xListener the listener done with user interaction
    * @see XSessionManagerListener
    */
  def interactionDone(xListener: XSessionManagerListener): scala.Unit
  /**
    * queryInteraction issues a request for a user interaction slot from the session manager
    * @param xListener the listener requesting user interaction
    * @see XSessionManagerListener
    */
  def queryInteraction(xListener: XSessionManagerListener): scala.Unit
  /**
    * removeSessionManagerListener deregisters a listener for session events
    * @param xListener listener to be removed
    * @see XSessionManagerListener
    * @see XSessionManagerClient.addSessionManagerListener()
    */
  def removeSessionManagerListener(xListener: XSessionManagerListener): scala.Unit
  /**
    * saveDone signals that a listener has processed a save request
    * @param xListener the listener having finished save request processing
    * @see XSessionManagerListener
    */
  def saveDone(xListener: XSessionManagerListener): scala.Unit
}

object XSessionManagerClient {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSessionManagerListener: js.Function1[XSessionManagerListener, scala.Unit],
    cancelShutdown: js.Function0[scala.Boolean],
    interactionDone: js.Function1[XSessionManagerListener, scala.Unit],
    queryInteraction: js.Function1[XSessionManagerListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSessionManagerListener: js.Function1[XSessionManagerListener, scala.Unit],
    saveDone: js.Function1[XSessionManagerListener, scala.Unit]
  ): XSessionManagerClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSessionManagerListener")(addSessionManagerListener)
    __obj.updateDynamic("cancelShutdown")(cancelShutdown)
    __obj.updateDynamic("interactionDone")(interactionDone)
    __obj.updateDynamic("queryInteraction")(queryInteraction)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSessionManagerListener")(removeSessionManagerListener)
    __obj.updateDynamic("saveDone")(saveDone)
    __obj.asInstanceOf[XSessionManagerClient]
  }
}


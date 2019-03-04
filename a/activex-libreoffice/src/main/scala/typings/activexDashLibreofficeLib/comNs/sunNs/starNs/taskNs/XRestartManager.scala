package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to try to restart the office.
  * @since OOo 3.3
  */
trait XRestartManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to get info whether the restart has been requested and provide the initialization status.
    *
    * The office has to call this method just before the main loop has been started, with the `TRUE` as argument, so that the implementation knows that the
    * office is initialized. If the method returns `TRUE` , the office should restart without starting the main loop.
    * @param bInitialized specifies whether the office process is initialized already, if the caller does not have this information, he should provide `FALSE` .
    * @returns `TRUE` if the office restart has been requested, `FALSE` otherwise
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def isRestartRequested(bInitialized: scala.Boolean): scala.Boolean
  /**
    * let the office restart asynchronously
    * @param xInteractionHandler the {@link com.sun.star.task.InteractionHandler} service implementation, that is used in case a problem is detected during re
    * @throws com::sun::star::uno::Exception to notify the caller about possible failures
    */
  def requestRestart(xInteractionHandler: XInteractionHandler): scala.Unit
}

object XRestartManager {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    isRestartRequested: js.Function1[scala.Boolean, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    requestRestart: js.Function1[XInteractionHandler, scala.Unit]
  ): XRestartManager = {
    val __obj = js.Dynamic.literal(acquire = acquire, isRestartRequested = isRestartRequested, queryInterface = queryInterface, release = release, requestRestart = requestRestart)
  
    __obj.asInstanceOf[XRestartManager]
  }
}


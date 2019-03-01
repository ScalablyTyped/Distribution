package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface should be implemented by toolkits that want to give access to their internal message handling loop. */
trait XDisplayConnection
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  val Identifier: js.Any
  /**
    * register an error handler for toolkit specific errors.
    * @param errorHandler the handler to register.
    */
  def addErrorHandler(errorHandler: XEventHandler): scala.Unit
  /**
    * registers an event handler.
    * @param window the platform specific window id. If empty, the handler should be registered for all windows.
    * @param eventHandler the handler to register.
    * @param eventMask the event mask specifies the events the handler is interested in.
    */
  def addEventHandler(window: js.Any, eventHandler: XEventHandler, eventMask: scala.Double): scala.Unit
  /**
    * returns a identifier.
    * @returns a unique platform dependent identifier for a display connection.
    */
  def getIdentifier(): js.Any
  /**
    * remover an error handler from the handler list.
    * @param errorHandler the handler to remove.
    */
  def removeErrorHandler(errorHandler: XEventHandler): scala.Unit
  /**
    * removes a eventHandler from the handler list.
    * @param window the platform specific window id the handler should be unregistered for. If empty, the handler should be unregistered completely.
    * @param eventHandler the handler to remove.
    */
  def removeEventHandler(window: js.Any, eventHandler: XEventHandler): scala.Unit
}

object XDisplayConnection {
  @scala.inline
  def apply(
    Identifier: js.Any,
    acquire: js.Function0[scala.Unit],
    addErrorHandler: js.Function1[XEventHandler, scala.Unit],
    addEventHandler: js.Function3[js.Any, XEventHandler, scala.Double, scala.Unit],
    getIdentifier: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeErrorHandler: js.Function1[XEventHandler, scala.Unit],
    removeEventHandler: js.Function2[js.Any, XEventHandler, scala.Unit]
  ): XDisplayConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Identifier")(Identifier)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addErrorHandler")(addErrorHandler)
    __obj.updateDynamic("addEventHandler")(addEventHandler)
    __obj.updateDynamic("getIdentifier")(getIdentifier)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeErrorHandler")(removeErrorHandler)
    __obj.updateDynamic("removeEventHandler")(removeEventHandler)
    __obj.asInstanceOf[XDisplayConnection]
  }
}


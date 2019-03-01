package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEnvironment extends XCommandEnvironment {
  /**
    * Constructor.
    * @param InteractionHandler the interaction handler instance that will be returned by this service's implementation of XCommandEnvironemt::getInteractionH
    * @param ProgressHandler the progress handler instance that will be returned by this service's implementation of XCommandEnvironemt::getProgressHandler()
    */
  def create(
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    ProgressHandler: XProgressHandler
  ): scala.Unit
}

object CommandEnvironment {
  @scala.inline
  def apply(
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: js.Function0[scala.Unit],
    create: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler, 
      XProgressHandler, 
      scala.Unit
    ],
    getInteractionHandler: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler],
    getProgressHandler: js.Function0[XProgressHandler],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): CommandEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InteractionHandler")(InteractionHandler)
    __obj.updateDynamic("ProgressHandler")(ProgressHandler)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getInteractionHandler")(getInteractionHandler)
    __obj.updateDynamic("getProgressHandler")(getProgressHandler)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[CommandEnvironment]
  }
}


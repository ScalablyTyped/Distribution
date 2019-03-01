package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interaction request handler. */
trait XInteractionHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Handle an interaction request. */
  def handle(Request: XInteractionRequest): scala.Unit
}

object XInteractionHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    handle: js.Function1[XInteractionRequest, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInteractionHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("handle")(handle)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XInteractionHandler]
  }
}


package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupFlow extends BaseBrowserFlow {
  /**
    * @param popupWidth
    * @param popupHeight
    */
  def _popupParams(popupWidth: scala.Double, popupHeight: scala.Double): scala.Unit
  def runReceiver(): scala.Unit
}

object PopupFlow {
  @scala.inline
  def apply(
    _popupParams: js.Function2[scala.Double, scala.Double, scala.Unit],
    asanaBaseUrl: js.Function0[java.lang.String],
    authorizeUrl: js.Function0[java.lang.String],
    finishAuthorization: js.Function1[java.lang.String, scala.Unit],
    getStateParam: js.Function0[java.lang.String],
    receiverUrl: js.Function0[java.lang.String],
    run: js.Function0[scala.Unit],
    runReceiver: js.Function0[scala.Unit],
    startAuthorization: js.Function2[java.lang.String, java.lang.String, js.Any]
  ): PopupFlow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_popupParams")(_popupParams)
    __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    __obj.updateDynamic("authorizeUrl")(authorizeUrl)
    __obj.updateDynamic("finishAuthorization")(finishAuthorization)
    __obj.updateDynamic("getStateParam")(getStateParam)
    __obj.updateDynamic("receiverUrl")(receiverUrl)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("runReceiver")(runReceiver)
    __obj.updateDynamic("startAuthorization")(startAuthorization)
    __obj.asInstanceOf[PopupFlow]
  }
}


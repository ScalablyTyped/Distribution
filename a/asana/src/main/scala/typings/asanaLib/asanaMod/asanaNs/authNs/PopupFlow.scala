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
    _popupParams: (scala.Double, scala.Double) => scala.Unit,
    asanaBaseUrl: () => java.lang.String,
    authorizeUrl: () => java.lang.String,
    finishAuthorization: java.lang.String => scala.Unit,
    getStateParam: () => java.lang.String,
    receiverUrl: () => java.lang.String,
    run: () => scala.Unit,
    runReceiver: () => scala.Unit,
    startAuthorization: (java.lang.String, java.lang.String) => js.Any
  ): PopupFlow = {
    val __obj = js.Dynamic.literal(_popupParams = js.Any.fromFunction2(_popupParams), asanaBaseUrl = js.Any.fromFunction0(asanaBaseUrl), authorizeUrl = js.Any.fromFunction0(authorizeUrl), finishAuthorization = js.Any.fromFunction1(finishAuthorization), getStateParam = js.Any.fromFunction0(getStateParam), receiverUrl = js.Any.fromFunction0(receiverUrl), run = js.Any.fromFunction0(run), runReceiver = js.Any.fromFunction0(runReceiver), startAuthorization = js.Any.fromFunction2(startAuthorization))
  
    __obj.asInstanceOf[PopupFlow]
  }
}


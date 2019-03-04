package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeExtensionFlow extends BaseBrowserFlow {
  /**
    * Runs the receiver code to send the Oauth result to the requesting tab.
    */
  def runReceiver(): scala.Unit
}

object ChromeExtensionFlow {
  @scala.inline
  def apply(
    asanaBaseUrl: js.Function0[java.lang.String],
    authorizeUrl: js.Function0[java.lang.String],
    finishAuthorization: js.Function1[java.lang.String, scala.Unit],
    getStateParam: js.Function0[java.lang.String],
    receiverUrl: js.Function0[java.lang.String],
    run: js.Function0[scala.Unit],
    runReceiver: js.Function0[scala.Unit],
    startAuthorization: js.Function2[java.lang.String, java.lang.String, js.Any]
  ): ChromeExtensionFlow = {
    val __obj = js.Dynamic.literal(asanaBaseUrl = asanaBaseUrl, authorizeUrl = authorizeUrl, finishAuthorization = finishAuthorization, getStateParam = getStateParam, receiverUrl = receiverUrl, run = run, runReceiver = runReceiver, startAuthorization = startAuthorization)
  
    __obj.asInstanceOf[ChromeExtensionFlow]
  }
}


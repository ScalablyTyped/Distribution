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
    asanaBaseUrl: () => java.lang.String,
    authorizeUrl: () => java.lang.String,
    finishAuthorization: java.lang.String => scala.Unit,
    getStateParam: () => java.lang.String,
    receiverUrl: () => java.lang.String,
    run: () => scala.Unit,
    runReceiver: () => scala.Unit,
    startAuthorization: (java.lang.String, java.lang.String) => js.Any
  ): ChromeExtensionFlow = {
    val __obj = js.Dynamic.literal(asanaBaseUrl = js.Any.fromFunction0(asanaBaseUrl), authorizeUrl = js.Any.fromFunction0(authorizeUrl), finishAuthorization = js.Any.fromFunction1(finishAuthorization), getStateParam = js.Any.fromFunction0(getStateParam), receiverUrl = js.Any.fromFunction0(receiverUrl), run = js.Any.fromFunction0(run), runReceiver = js.Any.fromFunction0(runReceiver), startAuthorization = js.Any.fromFunction2(startAuthorization))
  
    __obj.asInstanceOf[ChromeExtensionFlow]
  }
}


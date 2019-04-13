package typings
package actionsDashOnDashGoogleLib.dialogflowDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowAppOptions extends js.Object {
  /** Express HTTP request object. */
  var request: expressLib.expressMod.Request
  /** Express HTTP response object. */
  var response: expressLib.expressMod.Response
  /**
    * Function callback when session starts.
    * Only called if webhook is enabled for welcome/triggering intents, and
    * called from Web Simulator or Google Home device (i.e., not Dialogflow simulator).
    */
  var sessionStarted: js.UndefOr[js.Function0[_]] = js.undefined
}

object DialogflowAppOptions {
  @scala.inline
  def apply(
    request: expressLib.expressMod.Request,
    response: expressLib.expressMod.Response,
    sessionStarted: () => _ = null
  ): DialogflowAppOptions = {
    val __obj = js.Dynamic.literal(request = request, response = response)
    if (sessionStarted != null) __obj.updateDynamic("sessionStarted")(js.Any.fromFunction0(sessionStarted))
    __obj.asInstanceOf[DialogflowAppOptions]
  }
}


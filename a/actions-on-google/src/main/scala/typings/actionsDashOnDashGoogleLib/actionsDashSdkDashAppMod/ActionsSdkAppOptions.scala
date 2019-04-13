package typings
package actionsDashOnDashGoogleLib.actionsDashSdkDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkAppOptions extends js.Object {
  /** Express HTTP request object. */
  var request: expressLib.expressMod.Request
  /** Express HTTP response object. */
  var response: expressLib.expressMod.Response
  /** Function callback when session starts. */
  var sessionStarted: js.UndefOr[js.Function0[_]] = js.undefined
}

object ActionsSdkAppOptions {
  @scala.inline
  def apply(
    request: expressLib.expressMod.Request,
    response: expressLib.expressMod.Response,
    sessionStarted: () => _ = null
  ): ActionsSdkAppOptions = {
    val __obj = js.Dynamic.literal(request = request, response = response)
    if (sessionStarted != null) __obj.updateDynamic("sessionStarted")(js.Any.fromFunction0(sessionStarted))
    __obj.asInstanceOf[ActionsSdkAppOptions]
  }
}


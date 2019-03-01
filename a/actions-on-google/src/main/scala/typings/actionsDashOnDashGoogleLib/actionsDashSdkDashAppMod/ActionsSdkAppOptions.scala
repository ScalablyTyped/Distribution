package typings
package actionsDashOnDashGoogleLib.actionsDashSdkDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkAppOptions extends js.Object {
  /** Express HTTP request object. */
  var request: expressLib.expressMod.eNs.Request
  /** Express HTTP response object. */
  var response: expressLib.expressMod.eNs.Response
  /** Function callback when session starts. */
  var sessionStarted: js.UndefOr[js.Function0[_]] = js.undefined
}

object ActionsSdkAppOptions {
  @scala.inline
  def apply(
    request: expressLib.expressMod.eNs.Request,
    response: expressLib.expressMod.eNs.Response,
    sessionStarted: js.Function0[_] = null
  ): ActionsSdkAppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("response")(response)
    if (sessionStarted != null) __obj.updateDynamic("sessionStarted")(sessionStarted)
    __obj.asInstanceOf[ActionsSdkAppOptions]
  }
}


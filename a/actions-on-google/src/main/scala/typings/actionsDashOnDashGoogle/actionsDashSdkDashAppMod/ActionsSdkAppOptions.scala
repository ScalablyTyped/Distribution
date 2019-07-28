package typings.actionsDashOnDashGoogle.actionsDashSdkDashAppMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsSdkAppOptions extends js.Object {
  /** Express HTTP request object. */
  var request: Request
  /** Express HTTP response object. */
  var response: Response
  /** Function callback when session starts. */
  var sessionStarted: js.UndefOr[js.Function0[_]] = js.undefined
}

object ActionsSdkAppOptions {
  @scala.inline
  def apply(request: Request, response: Response, sessionStarted: () => _ = null): ActionsSdkAppOptions = {
    val __obj = js.Dynamic.literal(request = request, response = response)
    if (sessionStarted != null) __obj.updateDynamic("sessionStarted")(js.Any.fromFunction0(sessionStarted))
    __obj.asInstanceOf[ActionsSdkAppOptions]
  }
}


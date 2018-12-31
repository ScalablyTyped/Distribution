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


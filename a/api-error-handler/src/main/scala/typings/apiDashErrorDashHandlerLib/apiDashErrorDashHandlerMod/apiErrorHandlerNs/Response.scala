package typings
package apiDashErrorDashHandlerLib.apiDashErrorDashHandlerMod.apiErrorHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Body response: the JSON returned by api-error-handler
// See https://github.com/expressjs/api-error-handler/blob/1.0.0/index.js

trait Response extends js.Object {
  // Client errors
  var code: js.UndefOr[js.Any] = js.undefined
  var message: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var status: scala.Double
  var `type`: js.UndefOr[js.Any] = js.undefined
}


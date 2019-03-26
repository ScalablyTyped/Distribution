package typings
package asanaLib.asanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asana", "Dispatcher")
@js.native
/**
  * Creates a dispatcher which will act as a basic wrapper for making HTTP
  * requests to the API, and handle authentication.
  * @class
  * @classdesc A HTTP wrapper for the Asana API
  * @param {Object} options for default behavior of the Dispatcher
  * @option {Authenticator} [authenticator] Object to use for authentication.
  *     Can also be set later with `setAuthenticator`.
  * @option {String} [retryOnRateLimit] Automatically handle `RateLimitEnforced`
  *     errors by sleeping and retrying after the waiting period.
  * @option {Function} [handleUnauthorized] Automatically handle
  *     `NoAuthorization` with the callback. If the callback returns `true`
  *     (or a promise resolving to `true), will retry the request.
  * @option {String} [asanaBaseUrl] Base URL for Asana, for debugging
  * @option {Number} [requestTimeout] Timeout (in milliseconds) to wait for the
  *     request to finish.
  */
class DispatcherCls ()
  extends asanaLib.asanaMod.asanaNs.Dispatcher {
  def this(options: asanaLib.asanaMod.asanaNs.DispatcherOptions) = this()
}


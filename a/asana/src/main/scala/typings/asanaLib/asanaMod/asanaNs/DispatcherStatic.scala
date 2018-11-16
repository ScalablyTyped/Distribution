package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DispatcherStatic
  extends /**
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
ScalablyTyped.runtime.Instantiable0[Dispatcher]
     with /**
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
ScalablyTyped.runtime.Instantiable1[/* options */ DispatcherOptions, Dispatcher] {
  /**
           * The relative API path for the current version of the Asana API.
           * @type {String}
           */
  var API_PATH: java.lang.String = js.native
  /**
           * Default handler for requests that are considered unauthorized.
           * Requests that the authenticator try to refresh its credentials if
           * possible.
           * @return {Promise<boolean>} True iff refresh was successful, false if not.
           * @return
           */
  def maybeReauthorize(): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
}


package typings
package asanaLib.asanaMod.asanaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatcher extends js.Object {
  /**
    * The base URL for Asana
    * @type {String}
    */
  var asanaBaseUrl: java.lang.String = js.native
  /**
    * The amount of time in milliseconds to wait for a request to finish.
    * @type {Number}
    */
  var requestTimeout: scala.Double = js.native
  /**
    * Whether requests should be automatically retried if rate limited.
    * @type {Boolean}
    */
  var retryOnRateLimit: scala.Boolean = js.native
  /**
    * Ensure the dispatcher is authorized to make requests. Call this before
    * making any API requests.
    *
    * @returns {Promise} Resolves when the dispatcher is authorized, rejected if
    *     there was a problem authorizing.
    * @return
    */
  def authorize(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Dispatches a DELETE request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param dispatchOptions?
    * @return
    */
  def delete(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def delete(path: java.lang.String, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Dispatches a request to the Asana API. The request parameters are passed to
    * the request module.
    * @param  {Object}  params The params for request
    * @param  {Object}  [dispatchOptions] Options for handling request/response
    * @return {Promise}        The response for the request
    * @param params
    * @param dispatchOptions?
    * @return
    */
  def dispatch(params: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def dispatch(params: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Dispatches a GET request to the Asana API.
    * @param  {String}  path    The path of the API
    * @param  {Object}  [query] The query params
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}         The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def get(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def get(path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def get(path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Handler for unauthorized requests which may seek reauthorization.
    * Default behavior is available if configured with an Oauth authenticator
    * that has a refresh token, and will refresh the current access token.
    * @type {Function}
    */
  def handleUnauthorized(): scala.Boolean | bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  /**
    * Dispatches a POST request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object} data The data to be sent
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def post(path: java.lang.String, data: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def post(path: java.lang.String, data: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Dispatches a PUT request to the Asana API.
    * @param  {String} path The path of the API
    * @param  {Object} data The data to be sent
    * @param  {Object}  [dispatchOptions] Options for handling the request and
    *     response. See `dispatch`.
    * @return {Promise}     The response for the request
    * @param path
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def put(path: java.lang.String, data: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def put(path: java.lang.String, data: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Configure the authentication mechanism to use.
    * @returns {Dispatcher} this
    * @param authenticator
    * @return
    */
  def setAuthenticator(authenticator: asanaLib.asanaMod.asanaNs.authNs.Authenticator): this.type = js.native
  /**
    * Creates an Asana API Url by concatenating the ROOT_URL with path provided.
    * @param  {String} path The path
    * @return {String}      The url
    * @param path
    * @return
    */
  def url(path: java.lang.String): java.lang.String = js.native
}


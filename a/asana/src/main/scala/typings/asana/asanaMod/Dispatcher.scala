package typings.asana.asanaMod

import org.scalablytyped.runtime.TopLevel
import typings.asana.asanaMod.auth.Authenticator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatcher extends js.Object {
  /**
    * The base URL for Asana
    * @type {String}
    */
  var asanaBaseUrl: String = js.native
  /**
    * The amount of time in milliseconds to wait for a request to finish.
    * @type {Number}
    */
  var requestTimeout: Double = js.native
  /**
    * Whether requests should be automatically retried if rate limited.
    * @type {Boolean}
    */
  var retryOnRateLimit: Boolean = js.native
  /**
    * Ensure the dispatcher is authorized to make requests. Call this before
    * making any API requests.
    *
    * @returns {Promise} Resolves when the dispatcher is authorized, rejected if
    *     there was a problem authorizing.
    * @return
    */
  def authorize(): typings.bluebird.bluebirdMod.^[Unit] = js.native
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
  def delete(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def delete(path: String, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
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
  def dispatch(params: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatch(params: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
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
  def get(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def get(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def get(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Handler for unauthorized requests which may seek reauthorization.
    * Default behavior is available if configured with an Oauth authenticator
    * that has a refresh token, and will refresh the current access token.
    * @type {Function}
    */
  def handleUnauthorized(): Boolean | typings.bluebird.bluebirdMod.^[Boolean] = js.native
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
  def post(path: String, data: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def post(path: String, data: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
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
  def put(path: String, data: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def put(path: String, data: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Configure the authentication mechanism to use.
    * @returns {Dispatcher} this
    * @param authenticator
    * @return
    */
  def setAuthenticator(authenticator: Authenticator): this.type = js.native
  /**
    * Creates an Asana API Url by concatenating the ROOT_URL with path provided.
    * @param  {String} path The path
    * @return {String}      The url
    * @param path
    * @return
    */
  def url(path: String): String = js.native
}

@JSImport("asana", "Dispatcher")
@js.native
object Dispatcher extends TopLevel[DispatcherStatic]


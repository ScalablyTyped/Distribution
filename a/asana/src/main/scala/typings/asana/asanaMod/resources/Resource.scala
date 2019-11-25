package typings.asana.asanaMod.resources

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class for a resource accessible via the API. Uses a `Dispatcher` to
  * access the resources.
  * @param {Dispatcher} dispatcher
  * @constructor
  */
@js.native
trait Resource extends js.Object {
  var gid: String = js.native
  var id: Double = js.native
  var name: String = js.native
  /**
    * Dispatches a DELETE request to the API. The expected response is an
    * empty resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param dispatchOptions?
    * @return
    */
  def dispatchDelete(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchDelete(path: String, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Dispatches a GET request to the API, where the expected result is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchGet(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchGet(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Dispatches a GET request to the API, where the expected result is a
    * collection.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchGetCollection(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Dispatches a POST request to the API, where the expected response is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchPost(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchPost(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  /**
    * Dispatches a POST request to the API, where the expected response is a
    * single resource.
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise}            The response for the request
    * @param path
    * @param query?
    * @param dispatchOptions?
    * @return
    */
  def dispatchPut(path: String): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchPut(path: String, query: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
  def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): typings.bluebird.bluebirdMod.^[_] = js.native
}

@JSImport("asana", "resources.Resource")
@js.native
object Resource extends TopLevel[ResourceStatic]


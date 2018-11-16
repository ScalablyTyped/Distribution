package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

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
  var id: scala.Double = js.native
  var name: java.lang.String = js.native
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
  def dispatchDelete(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchDelete(path: java.lang.String, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGet(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGet(path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGet(path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGetCollection(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGetCollection(path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchGetCollection(path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPost(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPost(path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPost(path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPut(path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPut(path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
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
  def dispatchPut(path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}


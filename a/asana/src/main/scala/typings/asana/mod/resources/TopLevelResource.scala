package typings.asana.mod.resources

import typings.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for a resource accessible via the API. Uses a `Dispatcher` to
  * access the resources.
  * @param {Dispatcher} dispatcher
  */
@js.native
trait TopLevelResource extends StObject {
  
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
  def dispatchDelete(path: String): ^[Any] = js.native
  def dispatchDelete(path: String, dispatchOptions: Any): ^[Any] = js.native
  
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
  def dispatchGet(path: String): ^[Any] = js.native
  def dispatchGet(path: String, query: Any): ^[Any] = js.native
  def dispatchGet(path: String, query: Any, dispatchOptions: Any): ^[Any] = js.native
  def dispatchGet(path: String, query: Unit, dispatchOptions: Any): ^[Any] = js.native
  
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
  def dispatchGetCollection(path: String): ^[Any] = js.native
  def dispatchGetCollection(path: String, query: Any): ^[Any] = js.native
  def dispatchGetCollection(path: String, query: Any, dispatchOptions: Any): ^[Any] = js.native
  def dispatchGetCollection(path: String, query: Unit, dispatchOptions: Any): ^[Any] = js.native
  
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
  def dispatchPost(path: String): ^[Any] = js.native
  def dispatchPost(path: String, query: Any): ^[Any] = js.native
  def dispatchPost(path: String, query: Any, dispatchOptions: Any): ^[Any] = js.native
  def dispatchPost(path: String, query: Unit, dispatchOptions: Any): ^[Any] = js.native
  
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
  def dispatchPut(path: String): ^[Any] = js.native
  def dispatchPut(path: String, query: Any): ^[Any] = js.native
  def dispatchPut(path: String, query: Any, dispatchOptions: Any): ^[Any] = js.native
  def dispatchPut(path: String, query: Unit, dispatchOptions: Any): ^[Any] = js.native
}

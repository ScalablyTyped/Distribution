package typings.asana.anon

import typings.asana.mod.resources.Resource
import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined asana.asana.resources.Tags.Type & {  workspace :string} */
@js.native
trait Typeworkspacestring extends js.Object {
  
  var color: String = js.native
  
  var created_at: String = js.native
  
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
  def dispatchDelete(path: String): ^[_] = js.native
  def dispatchDelete(path: String, dispatchOptions: js.Any): ^[_] = js.native
  
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
  def dispatchGet(path: String): ^[_] = js.native
  def dispatchGet(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
  def dispatchGet(path: String, query: js.Any): ^[_] = js.native
  def dispatchGet(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
  
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
  def dispatchGetCollection(path: String): ^[_] = js.native
  def dispatchGetCollection(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any): ^[_] = js.native
  def dispatchGetCollection(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
  
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
  def dispatchPost(path: String): ^[_] = js.native
  def dispatchPost(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
  def dispatchPost(path: String, query: js.Any): ^[_] = js.native
  def dispatchPost(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
  
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
  def dispatchPut(path: String): ^[_] = js.native
  def dispatchPut(path: String, query: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): ^[_] = js.native
  def dispatchPut(path: String, query: js.Any): ^[_] = js.native
  def dispatchPut(path: String, query: js.Any, dispatchOptions: js.Any): ^[_] = js.native
  
  var followers: js.Array[Resource] = js.native
  
  var gid: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
  
  var notes: String = js.native
  
  var workspace: Resource with String = js.native
}

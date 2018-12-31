package typings
package asanaLib.asanaMod.asanaNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceStatic
  extends /**
  * @param dispatcher
  */
org.scalablytyped.runtime.Instantiable1[/* dispatcher */ asanaLib.asanaMod.asanaNs.Dispatcher, Resource] {
  /**
    * @type {number} Default number of items to get per page.
    */
  var DEFAULT_PAGE_LIMIT: scala.Double = js.native
  /**
    * Helper method that dispatches a GET request to the API, where the expected
    * result is a collection.
    * @param  {Dispatcher} dispatcher
    * @param  {String}     path    The path of the API
    * @param  {Object}     [query] The query params
    * @param  {Object}     [dispatchOptions] Options for handling the request and
    *     response. See `Dispatcher.dispatch`.
    * @return {Promise<SimpleResourceList>} The Collection response for the request
    * @param dispatcher
    * @param path
    * @param query?
    * @param dispatchOptions?
    */
  def getCollection(dispatcher: js.Any, path: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getCollection(dispatcher: js.Any, path: java.lang.String, query: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def getCollection(dispatcher: js.Any, path: java.lang.String, query: js.Any, dispatchOptions: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Helper method for any request Promise from the Dispatcher, unwraps the `data`
    * value from the payload.
    * @param  {Promise} promise A promise returned from a `Dispatcher` request.
    * @return {Promise}         The `data` portion of the response payload.
    * @param promise
    * @return
    */
  def unwrap(promise: js.Any): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}


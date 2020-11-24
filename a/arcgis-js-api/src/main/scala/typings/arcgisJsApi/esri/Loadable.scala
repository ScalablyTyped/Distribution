package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`not-loaded`
import typings.arcgisJsApi.arcgisJsApiStrings.failed
import typings.arcgisJsApi.arcgisJsApiStrings.loaded
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.std.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Loadable extends js.Object {
  
  /**
    * Cancels a [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load) operation if it is already in progress.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#cancelLoad)
    */
  def cancelLoad(): Unit = js.native
  
  /**
    * `isFulfilled()` may be used to verify if creating an instance of the class is fulfilled (either resolved or rejected).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isFulfilled)
    */
  def isFulfilled(): Boolean = js.native
  
  /**
    * `isRejected()` may be used to verify if creating an instance of the class is rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isRejected)
    */
  def isRejected(): Boolean = js.native
  
  /**
    * `isResolved()` may be used to verify if creating an instance of the class is resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isResolved)
    */
  def isResolved(): Boolean = js.native
  
  /**
    * Loads the resources referenced by this class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load)
    */
  def load(): js.Promise[_] = js.native
  def load(signal: AbortSignal): js.Promise[_] = js.native
  
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadError)
    */
  val loadError: Error = js.native
  
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load) operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadStatus)
    */
  val loadStatus: `not-loaded` | loading | failed | loaded = js.native
  
  /**
    * A list of warnings which occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadWarnings)
    */
  val loadWarnings: js.Array[_] = js.native
  
  /**
    * `when()` may be leveraged once an instance of the class is created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#when)
    */
  def when(): js.Promise[_] = js.native
  def when(callback: js.UndefOr[scala.Nothing], errback: js.Function): js.Promise[_] = js.native
  def when(callback: js.Function): js.Promise[_] = js.native
  def when(callback: js.Function, errback: js.Function): js.Promise[_] = js.native
}

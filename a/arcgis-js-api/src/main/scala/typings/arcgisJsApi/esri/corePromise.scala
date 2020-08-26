package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait corePromise extends js.Object {
  /**
    * `isFulfilled()` may be used to verify if creating an instance of the class is fulfilled (either resolved or rejected). If it is fulfilled, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isFulfilled)
    *
    *
    */
  def isFulfilled(): Boolean = js.native
  /**
    * `isRejected()` may be used to verify if creating an instance of the class is rejected. If it is rejected, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isRejected)
    *
    *
    */
  def isRejected(): Boolean = js.native
  /**
    * `isResolved()` may be used to verify if creating an instance of the class is resolved. If it is resolved, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isResolved)
    *
    *
    */
  def isResolved(): Boolean = js.native
  /**
    * `when()` may be leveraged once an instance of the class is created. This method takes two input parameters: a `callback` function and an `errback` function. The `callback` executes when the instance of the class loads. The `errback` executes if the instance of the class fails to load.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#when)
    *
    * @param callback The function to call when the promise resolves.
    * @param errback The function to execute when the promise fails.
    *
    */
  def when(): js.Promise[_] = js.native
  def when(callback: js.UndefOr[scala.Nothing], errback: js.Function): js.Promise[_] = js.native
  def when(callback: js.Function): js.Promise[_] = js.native
  def when(callback: js.Function, errback: js.Function): js.Promise[_] = js.native
}


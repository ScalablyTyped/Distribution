package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  def isFulfilled(): scala.Boolean = js.native
  /**
    * `isRejected()` may be used to verify if creating an instance of the class is rejected. If it is rejected, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isRejected)
    *
    *
    */
  def isRejected(): scala.Boolean = js.native
  /**
    * `isResolved()` may be used to verify if creating an instance of the class is resolved. If it is resolved, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#isResolved)
    *
    *
    */
  def isResolved(): scala.Boolean = js.native
  /**
    * `when()` may be leveraged once an instance of the class is created. This method takes two input parameters: a `callback` function and an `errback` function. The `callback` executes when the instance of the class loads. The `errback` executes if the instance of the class fails to load.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Promise.html#when)
    *
    * @param callback The function to call when the promise resolves.
    * @param errback The function to execute when the promise fails.
    *
    */
  def when(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def when(callback: js.Function): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def when(callback: js.Function, errback: js.Function): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

@JSGlobal("__esri.corePromise")
@js.native
class corePromiseCls () extends corePromise


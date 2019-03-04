package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachAlwaysResult
  extends stdLib.Object {
  /**
    * The error with which the promise rejected. Defined only if the promise rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
    * The promise that has been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var promise: arcgisDashJsDashApiLib.IPromise[_]
  /**
    * The value with which the promise resolved. Defined only if the promise resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object EachAlwaysResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    promise: arcgisDashJsDashApiLib.IPromise[_],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    error: js.Any = null,
    value: js.Any = null
  ): EachAlwaysResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, promise = promise, propertyIsEnumerable = propertyIsEnumerable)
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EachAlwaysResult]
  }
}


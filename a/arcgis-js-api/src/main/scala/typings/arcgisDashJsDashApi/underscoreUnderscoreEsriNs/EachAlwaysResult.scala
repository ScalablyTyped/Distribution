package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachAlwaysResult extends Object {
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
  var promise: IPromise[_]
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
    hasOwnProperty: PropertyKey => Boolean,
    promise: IPromise[_],
    propertyIsEnumerable: PropertyKey => Boolean,
    error: js.Any = null,
    value: js.Any = null
  ): EachAlwaysResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), promise = promise, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (error != null) __obj.updateDynamic("error")(error)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[EachAlwaysResult]
  }
}


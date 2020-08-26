package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EachAlwaysResult extends Object {
  /**
    * The error with which the promise rejected. Defined only if the promise rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var error: js.UndefOr[js.Any] = js.native
  /**
    * The promise that has been fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var promise: js.Promise[_] = js.native
  /**
    * The value with which the promise resolved. Defined only if the promise resolved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#EachAlwaysResult)
    */
  var value: js.UndefOr[js.Any] = js.native
}

object EachAlwaysResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    promise: js.Promise[_],
    propertyIsEnumerable: PropertyKey => Boolean
  ): EachAlwaysResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), promise = promise.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[EachAlwaysResult]
  }
  @scala.inline
  implicit class EachAlwaysResultOps[Self <: EachAlwaysResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(value: js.Promise[_]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


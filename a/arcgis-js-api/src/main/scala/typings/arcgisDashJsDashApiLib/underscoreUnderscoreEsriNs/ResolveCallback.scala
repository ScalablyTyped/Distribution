package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveCallback
  extends stdLib.Object {
  /**
    * The value with which the promise resolved. Defined only if the promise is fulfilled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#ResolveCallback)
    */
  var value: js.UndefOr[js.Any | arcgisDashJsDashApiLib.IPromise[_]] = js.undefined
}

object ResolveCallback {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: js.Any | arcgisDashJsDashApiLib.IPromise[_] = null
  ): ResolveCallback = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveCallback]
  }
}


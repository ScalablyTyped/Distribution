package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectCallback
  extends stdLib.Object {
  /**
    * The error with which the promise rejected. Defined only if the promise is rejected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-promiseUtils.html#RejectCallback)
    */
  var error: js.UndefOr[js.Any] = js.undefined
}

object RejectCallback {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    error: js.Any = null
  ): RejectCallback = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[RejectCallback]
  }
}


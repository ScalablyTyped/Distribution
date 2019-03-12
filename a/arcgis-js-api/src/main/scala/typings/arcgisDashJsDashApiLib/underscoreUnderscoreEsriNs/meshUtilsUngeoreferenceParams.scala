package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsUngeoreferenceParams
  extends stdLib.Object {
  /**
    * Indicates whether the coordinates are georeferenced relative to the globe or the projected coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
}

object meshUtilsUngeoreferenceParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    geographic: js.UndefOr[scala.Boolean] = js.undefined
  ): meshUtilsUngeoreferenceParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    __obj.asInstanceOf[meshUtilsUngeoreferenceParams]
  }
}


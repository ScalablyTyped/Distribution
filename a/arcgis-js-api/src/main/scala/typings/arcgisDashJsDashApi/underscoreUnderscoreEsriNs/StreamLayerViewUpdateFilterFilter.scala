package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerViewUpdateFilterFilter extends Object {
  /**
    * A spatial filter for filtering features. Only features that intersect the given geometry are displayed in the view. If `null`, the spatial filter is cleared.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter)
    */
  var geometry: js.UndefOr[Extent] = js.undefined
  /**
    * A SQL where clause used to filter features by attributes. If `null`, the attribute filter is cleared.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter)
    */
  var where: js.UndefOr[String] = js.undefined
}

object StreamLayerViewUpdateFilterFilter {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    geometry: Extent = null,
    where: String = null
  ): StreamLayerViewUpdateFilterFilter = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (geometry != null) __obj.updateDynamic("geometry")(geometry)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[StreamLayerViewUpdateFilterFilter]
  }
}


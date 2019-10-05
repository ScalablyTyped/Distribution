package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerUpdateFilterFilterChanges extends Object {
  /**
    * A spatial filter for filtering features. Only features that intersect the given geometry are displayed in the view(s). If `null`, the spatial filter is cleared.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter)
    */
  var geometry: Extent
  /**
    * A SQL where clause used to filter features by attributes. If `null`, the attribute filter is cleared.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter)
    */
  var where: String
}

object StreamLayerUpdateFilterFilterChanges {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Extent,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    where: String
  ): StreamLayerUpdateFilterFilterChanges = {
    val __obj = js.Dynamic.literal(constructor = constructor, geometry = geometry, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), where = where)
  
    __obj.asInstanceOf[StreamLayerUpdateFilterFilterChanges]
  }
}


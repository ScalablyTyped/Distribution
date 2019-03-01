package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerUpdateFilterFilterChanges
  extends stdLib.Object {
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
  var where: java.lang.String
}

object StreamLayerUpdateFilterFilterChanges {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Extent,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    where: java.lang.String
  ): StreamLayerUpdateFilterFilterChanges = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("geometry")(geometry)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[StreamLayerUpdateFilterFilterChanges]
  }
}


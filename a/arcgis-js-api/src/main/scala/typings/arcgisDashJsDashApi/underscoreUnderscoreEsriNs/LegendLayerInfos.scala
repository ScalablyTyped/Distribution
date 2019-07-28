package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayerInfos extends Object {
  /**
    * A layer to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layer: Layer
  /**
    * Specifies a title for the layer to display above its symbols and descriptions. If no title is specified the service name is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var title: js.UndefOr[String] = js.undefined
}

object LegendLayerInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean,
    title: String = null
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendLayerInfos]
  }
}


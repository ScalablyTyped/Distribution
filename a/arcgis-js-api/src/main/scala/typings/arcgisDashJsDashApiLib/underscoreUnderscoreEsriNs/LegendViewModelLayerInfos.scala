package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendViewModelLayerInfos
  extends stdLib.Object {
  /**
    * A layer to add to the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
    */
  var layer: js.UndefOr[Layer] = js.undefined
  /**
    * Specify a title for the layer. If no title is specified the service name is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object LegendViewModelLayerInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    layer: Layer = null,
    title: java.lang.String = null
  ): LegendViewModelLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendViewModelLayerInfos]
  }
}


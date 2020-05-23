package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayerInfos extends Object {
  /**
    * When `false`, the default symbol for the renderer will not display in the legend. Only applicable to [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    *
    * @default true
    */
  var defaultSymbol: js.UndefOr[Boolean] = js.undefined
  /**
    * List of sublayer ids that will not be displayed in the legend even if they are visible in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var hideLayers: js.Array[Double]
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
    hideLayers: js.Array[Double],
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean,
    defaultSymbol: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hideLayers = hideLayers.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(defaultSymbol)) __obj.updateDynamic("defaultSymbol")(defaultSymbol.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendLayerInfos]
  }
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendLayerInfos
  extends stdLib.Object {
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
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object LegendLayerInfos {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: Layer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    title: java.lang.String = null
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, layer = layer, propertyIsEnumerable = propertyIsEnumerable)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[LegendLayerInfos]
  }
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerViewProperties extends LayerViewProperties {
  /**
    * Contains the collection of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) visible in the layer view for the live stream. Graphics may be removed from the layer view by calling the [removeAll()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#removeAll) method from [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html).  **This property is deprecated. Use [queryFeatures](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryFeatures) method instead.**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
}

object StreamLayerViewProperties {
  @scala.inline
  def apply(
    graphics: CollectionProperties[GraphicProperties] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StreamLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (graphics != null) __obj.updateDynamic("graphics")(graphics.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StreamLayerViewProperties]
  }
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerViewProperties extends LayerViewProperties {
  /**
    * An object that provides the user access to [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) and their values in the layer. See the object specifications table below for details about each property. This object is used as input in the [pixelFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter) function for filtering and processing each pixel in the block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelData: js.UndefOr[ImageryLayerViewPixelData] = js.undefined
}

object ImageryLayerViewProperties {
  @scala.inline
  def apply(pixelData: ImageryLayerViewPixelData = null, visible: js.UndefOr[scala.Boolean] = js.undefined): ImageryLayerViewProperties = {
    val __obj = js.Dynamic.literal()
    if (pixelData != null) __obj.updateDynamic("pixelData")(pixelData)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ImageryLayerViewProperties]
  }
}


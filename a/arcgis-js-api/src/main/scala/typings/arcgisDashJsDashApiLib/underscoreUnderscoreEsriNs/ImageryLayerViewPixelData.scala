package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerViewPixelData
  extends stdLib.Object {
  /**
    * The extent of the `pixelBlock`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var extent: js.UndefOr[Extent] = js.undefined
  /**
    * An object representing the pixels in the view. This provides the user access to each pixel on the client via the `pixels` property of this object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelBlock: PixelBlock
}

object ImageryLayerViewPixelData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    pixelBlock: PixelBlock,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    extent: Extent = null
  ): ImageryLayerViewPixelData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("pixelBlock")(pixelBlock)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    __obj.asInstanceOf[ImageryLayerViewPixelData]
  }
}


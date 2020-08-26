package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryLayerViewPixelData extends Object {
  /**
    * The extent of the `pixelBlock`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var extent: js.UndefOr[Extent] = js.native
  /**
    * An object representing the pixels in the view. This provides the user access to each pixel on the client via the `pixels` property of this object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData)
    */
  var pixelBlock: PixelBlock = js.native
}

object ImageryLayerViewPixelData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pixelBlock: PixelBlock,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ImageryLayerViewPixelData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixelBlock = pixelBlock.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ImageryLayerViewPixelData]
  }
  @scala.inline
  implicit class ImageryLayerViewPixelDataOps[Self <: ImageryLayerViewPixelData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPixelBlock(value: PixelBlock): Self = this.set("pixelBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
  }
  
}


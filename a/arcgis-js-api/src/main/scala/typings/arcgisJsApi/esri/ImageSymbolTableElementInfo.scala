package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSymbolTableElementInfo
  extends Object
     with SymbolTableElementType {
  /**
    * The height of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The label of the category corresponding to the given image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The opacity of the image (`0` to `1`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var opacity: Double = js.native
  /**
    * The data URI of the image representing a colored pixel in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var src: String = js.native
  /**
    * The width of the image in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ImageSymbolTableElementInfo)
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageSymbolTableElementInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    src: String
  ): ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSymbolTableElementInfo]
  }
  @scala.inline
  implicit class ImageSymbolTableElementInfoOps[Self <: ImageSymbolTableElementInfo] (val x: Self) extends AnyVal {
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
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


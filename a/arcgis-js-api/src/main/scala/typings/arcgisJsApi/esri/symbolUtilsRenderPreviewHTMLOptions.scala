package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait symbolUtilsRenderPreviewHTMLOptions extends Object {
  /**
    * Indicates whether to disable upsampling for raster images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var disableUpsampling: js.UndefOr[Boolean] = js.native
  /**
    * The maximum size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var maxSize: js.UndefOr[Double] = js.native
  /**
    * The parent node to append to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var node: js.UndefOr[HTMLElement] = js.native
  /**
    * The opacity of the layer represented by the `symbol`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The rotation of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var rotation: js.UndefOr[String] = js.native
  /**
    * Indicates whether to scale the symbol preview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var scale: js.UndefOr[Boolean] = js.native
  /**
    * The size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * For "tall" symbols in portrait view, then the `tall` value should be used here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var symbolConfig: js.UndefOr[String] = js.native
}

object symbolUtilsRenderPreviewHTMLOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): symbolUtilsRenderPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[symbolUtilsRenderPreviewHTMLOptions]
  }
  @scala.inline
  implicit class symbolUtilsRenderPreviewHTMLOptionsOps[Self <: symbolUtilsRenderPreviewHTMLOptions] (val x: Self) extends AnyVal {
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
    def setDisableUpsampling(value: Boolean): Self = this.set("disableUpsampling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableUpsampling: Self = this.set("disableUpsampling", js.undefined)
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setRotation(value: String): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSymbolConfig(value: String): Self = this.set("symbolConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolConfig: Self = this.set("symbolConfig", js.undefined)
  }
  
}


package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureFillSymbolProperties extends FillSymbolProperties {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    *
    * @default 12
    */
  var height: js.UndefOr[Double | String] = js.native
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    *
    * @default 12
    */
  var width: js.UndefOr[Double | String] = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    *
    * @default 1
    */
  var xscale: js.UndefOr[Double] = js.native
  /**
    * The offset on the y-axis in pixels or points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.native
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    *
    * @default 1
    */
  var yscale: js.UndefOr[Double] = js.native
}

object PictureFillSymbolProperties {
  @scala.inline
  def apply(): PictureFillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureFillSymbolProperties]
  }
  @scala.inline
  implicit class PictureFillSymbolPropertiesOps[Self <: PictureFillSymbolProperties] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXoffset(value: Double | String): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoffset: Self = this.set("xoffset", js.undefined)
    @scala.inline
    def setXscale(value: Double): Self = this.set("xscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXscale: Self = this.set("xscale", js.undefined)
    @scala.inline
    def setYoffset(value: Double | String): Self = this.set("yoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoffset: Self = this.set("yoffset", js.undefined)
    @scala.inline
    def setYscale(value: Double): Self = this.set("yscale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYscale: Self = this.set("yscale", js.undefined)
  }
  
}


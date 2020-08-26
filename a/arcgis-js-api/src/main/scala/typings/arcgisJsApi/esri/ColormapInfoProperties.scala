package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColormapInfoProperties extends js.Object {
  /**
    * The color of a given pixel. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#color)
    */
  var color: js.UndefOr[Color_] = js.native
  /**
    * The label for a given pixel value and color mapping.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The raster pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-ColormapInfo.html#value)
    */
  var value: js.UndefOr[Double] = js.native
}

object ColormapInfoProperties {
  @scala.inline
  def apply(): ColormapInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColormapInfoProperties]
  }
  @scala.inline
  implicit class ColormapInfoPropertiesOps[Self <: ColormapInfoProperties] (val x: Self) extends AnyVal {
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
    def setColor(value: Color_): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


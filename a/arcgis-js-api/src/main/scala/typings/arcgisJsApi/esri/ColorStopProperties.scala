package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorStopProperties extends js.Object {
  /**
    * The [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) used to render features with the given [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#value).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * A string value used to label the stop along the color ramp in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Specifies the data value to map to the given [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#color).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-support-ColorStop.html#value)
    */
  var value: js.UndefOr[Double] = js.native
}

object ColorStopProperties {
  @scala.inline
  def apply(): ColorStopProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStopProperties]
  }
  @scala.inline
  implicit class ColorStopPropertiesOps[Self <: ColorStopProperties] (val x: Self) extends AnyVal {
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
    def setColorVarargs(value: Double*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = this.set("color", value.asInstanceOf[js.Any])
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


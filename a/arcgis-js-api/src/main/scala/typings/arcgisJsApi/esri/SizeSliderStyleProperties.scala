package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSliderStyleProperties extends Object {
  /**
    * The background color of the slider's track. Generally, this color should be subdued and not interfere with the `trackFillColor`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    *
    * @default new Color([224, 224, 224])
    */
  var trackBackgroundColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * The color of the slider's track. For single-color visualizations where only a Size variable is present, you should set this color to match the color of the symbol in the [SimpleRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#style)
    *
    * @default new Color([149, 149, 149])
    */
  var trackFillColor: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
}

object SizeSliderStyleProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SizeSliderStyleProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SizeSliderStyleProperties]
  }
  @scala.inline
  implicit class SizeSliderStylePropertiesOps[Self <: SizeSliderStyleProperties] (val x: Self) extends AnyVal {
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
    def setTrackBackgroundColorVarargs(value: Double*): Self = this.set("trackBackgroundColor", js.Array(value :_*))
    @scala.inline
    def setTrackBackgroundColor(value: Color_ | js.Array[Double] | String): Self = this.set("trackBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackBackgroundColor: Self = this.set("trackBackgroundColor", js.undefined)
    @scala.inline
    def setTrackFillColorVarargs(value: Double*): Self = this.set("trackFillColor", js.Array(value :_*))
    @scala.inline
    def setTrackFillColor(value: Color_ | js.Array[Double] | String): Self = this.set("trackFillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackFillColor: Self = this.set("trackFillColor", js.undefined)
  }
  
}


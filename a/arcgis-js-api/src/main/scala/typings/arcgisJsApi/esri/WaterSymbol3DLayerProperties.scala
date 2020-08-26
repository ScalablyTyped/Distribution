package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.calm
import typings.arcgisJsApi.arcgisJsApiStrings.large
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import typings.arcgisJsApi.arcgisJsApiStrings.moderate
import typings.arcgisJsApi.arcgisJsApiStrings.rippled
import typings.arcgisJsApi.arcgisJsApiStrings.slight
import typings.arcgisJsApi.arcgisJsApiStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaterSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The dominant color used to shade the water. The water has different shades of the dominant color based on the reflection of the light. The image below shows how different types of water can be represented with different colors. For example for deep water the dominant color could be navy blue.  ![symbol3D-water](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-water-colors.png)  The color can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#color)
    *
    * @default #0077BE
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.native
  /**
    * Indicates the size of the waterbody which is represented by the symbol layer. `small` can be set for small lakes, rivers or swimming pools, `medium` can be set for large lakes, whereas `large` is recommended for ocean and sea waterbodies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waterbodySize)
    *
    * @default medium
    */
  var waterbodySize: js.UndefOr[small | medium | large] = js.native
  /**
    * Indicates the direction in which the waves travel. This value represents the geographic rotation in degrees and it ranges from 0 to 360 degrees. A value of 0 degrees corresponds to geographic north, which means that the wave travels from south to north.  The default is set to `null`, which will display the waves without a distinct direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveDirection)
    *
    * @default null
    */
  var waveDirection: js.UndefOr[Double] = js.native
  /**
    * Indicates the shape and intensity of the waves. Currently only calm to moderate waterbodies can be represented. A `calm` wave strength represents water without waves, acting almost like a mirror. A water with `rippled` wave strength has very small and short waves. `slight` wave strength displays the waves with a more pronounced form, but they are still quite short. Choosing `moderate` will display waves with a longer form and a slightly increased intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html#waveStrength)
    *
    * @default moderate
    */
  var waveStrength: js.UndefOr[calm | rippled | slight | moderate] = js.native
}

object WaterSymbol3DLayerProperties {
  @scala.inline
  def apply(): WaterSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterSymbol3DLayerProperties]
  }
  @scala.inline
  implicit class WaterSymbol3DLayerPropertiesOps[Self <: WaterSymbol3DLayerProperties] (val x: Self) extends AnyVal {
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
    def setWaterbodySize(value: small | medium | large): Self = this.set("waterbodySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaterbodySize: Self = this.set("waterbodySize", js.undefined)
    @scala.inline
    def setWaveDirection(value: Double): Self = this.set("waveDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaveDirection: Self = this.set("waveDirection", js.undefined)
    @scala.inline
    def setWaveStrength(value: calm | rippled | slight | moderate): Self = this.set("waveStrength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaveStrength: Self = this.set("waveStrength", js.undefined)
  }
  
}

